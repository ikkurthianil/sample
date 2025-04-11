package selenium.azure;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchFirstName {
    public static void main(String[] args) {
        // Connection details
        String url = "jdbc:sqlserver://localhost:1433;databaseName=master;trustServerCertificate=true";

        ;
        String username = "sa";
        String password = "NewPassword123!";

        Connection con = null;
        Statement stmt = null;

        try {
            // Establish connection
            con = DriverManager.getConnection(url, username, password);

            // Create a statement
            stmt = con.createStatement();

            // Insert data
            String insertQuery = "INSERT INTO Persons (PersonID, LastName, FirstName, Address, City)" +
                    " VALUES (3, 'Smith', 'John', '123 Elm Street', 'New York')";
            int rowsAffected = stmt.executeUpdate(insertQuery);
            System.out.println("Rows inserted: " + rowsAffected);

            // Fetch data
            String selectQuery = "SELECT PersonID FROM Persons";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("First Name: " + rs.getString("PersonID"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}