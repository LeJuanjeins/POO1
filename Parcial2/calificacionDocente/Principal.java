import libs;
import java.sql.*;
import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/calificacion_maestros";
        String DB_USERNAME = "root";
        String DB_PASSWORD = " ";
            try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
                String role = promptUserRole();

                // Prompt for qualification information based on the role
                int MaestroID = promptMaestroID();
                int rating1 = promptRating("Rating 1");
                int rating2 = promptRating("Rating 2");
                int rating3 = promptRating("Rating 3");

                // Validate and process the input data
                if (validateInput(role, MaestroID, rating1, rating2, rating3)) {
                    // Insert qualification data into the database
                    // Assuming you have a table called 'qualifications' with appropriate columns
                    String insertQuery = "INSERT INTO scorestudents (MaestroID, rating1, rating2, rating3) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
                        // Set the parameter values based on user input
                        statement.setInt(1, MaestroID);
                        statement.setInt(2, rating1);
                        statement.setInt(3, rating2);
                        statement.setInt(4, rating3);

                        // Execute the insert statement
                        statement.executeUpdate();
                        System.out.println("Calificacion subida con exito.");
                    }
                } else {
                    System.out.println("Dato invalido, ingrese de nuevo.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        private static String promptUserRole() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter user role (student or principal): ");
            return scanner.nextLine();
        }

        private static int promptMaestroID() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter teacher ID: ");
            return scanner.nextInt();
        }

        private static int promptRating(String ratingName) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter " + ratingName + " (1-10): ");
            int rating = scanner.nextInt();
            
            // Validate the rating
            while (rating < 1 || rating > 10) {
                System.out.println("Invalid rating. Please enter a number between 1 and 10.");
                System.out.print("Enter " + ratingName + " (1-10): ");
                rating = scanner.nextInt();
            }
            
            return rating;
        }

        private static boolean validateInput(String role, int MaestroID, int rating1, int rating2, int rating3) {
            if (role.equalsIgnoreCase("student")) {
                // Validate ratings for students
                if (rating1 < 1 || rating1 > 10 ||
                    rating2 < 1 || rating2 > 10 ||
                    rating3 < 1 || rating3 > 10) {
                    System.out.println("Invalid rating. Ratings should be between 1 and 10 for students.");
                    return false;
                }
            } else if (role.equalsIgnoreCase("principal")) {
                // Validate ratings for principal
                if (rating1 < 1 || rating1 > 10 ||
                    rating2 < 1 || rating2 > 10 ||
                    rating3 < 1 || rating3 > 10) {
                    System.out.println("Invalid rating. Ratings should be between 1 and 10 for principal.");
                    return false;
                }
            } else {
                // Invalid role
                System.out.println("Invalid role. Please enter either 'student' or 'principal'.");
                return false;
            }
            
            // All input is valid
            return true;
                }
}

