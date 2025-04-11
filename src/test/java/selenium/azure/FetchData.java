package selenium.azure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {
    public static void main(String[] args) {

        // Connection details
        String url = "jdbc:sqlserver://localhost:1433;databaseName=master;trustServerCertificate=true";
        String username = "sa";
        String password = "NewPassword123!";

        Connection con;
        Statement stmt;
        ResultSet rs ;

        try {
            // Establish connection
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();

            // Insert data
            String insertQuery = "INSERT INTO Persons (PersonID, LastName, FirstName, Address, City)" +
                    " VALUES (3, 'Smith', 'John', '123 Elm Street', 'New York')";
            stmt.executeUpdate(insertQuery);

            // Fetch data
            String selectQuery = "SELECT FirstName FROM Persons";
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                String firstName = rs.getString("FirstName");
                System.out.println("Row Number: " + rs.getRow());
                System.out.println("First Name: " + firstName);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}