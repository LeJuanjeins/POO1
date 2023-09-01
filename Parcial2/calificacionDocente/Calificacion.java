import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Calificacion {
    private int MaestroID;
    private int rating1;
    private int rating2;
    private int rating3;

    public int getMaestroID() {
        return MaestroID;
    }

    public int getRating1() {
        return rating1;
    }

    public int getRating2() {
        return rating2;
    }

    public int getRating3() {
        return rating3;
    }
     public void submitQualificationToDatabase() {
        String host = "127.0.0.1";
        String user = "root";
        String password = " ";
        int port = 3306;
        String database = "calificacion_maestros";
        String url = String.format("jdbc:mysql://%s:%i/%s", host, port, database);
        String insertQuery = "INSERT INTO scorestudents (MaestroID, rating1, rating2, rating3) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(insertQuery)) {

            statement.setInt(1, MaestroID);
            statement.setInt(2, rating1);
            statement.setInt(3, rating2);
            statement.setInt(4, rating3);

            statement.executeUpdate();
            System.out.println("Calificacion subida a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void generateTeacherRatingsReport(int MaestroID) {
        String host = "127.0.0.1";
        String user = "root";
        String password = " ";
        int port = 3306;
        String database = "calificacion_maestros";
        String url = String.format("jdbc:mysql://%s:%d/%s", host, port, database);
        String selectQuery = "SELECT rating1, rating2, rating3 FROM qualifications WHERE teacher_id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(selectQuery)) {

            statement.setInt(1, MaestroID);
            try (ResultSet resultSet = statement.executeQuery()) {
                int count = 0;
                int totalRating1 = 0;
                int totalRating2 = 0;
                int totalRating3 = 0;

                while (resultSet.next()) {
                    int rating1 = resultSet.getInt("rating1");
                    int rating2 = resultSet.getInt("rating2");
                    int rating3 = resultSet.getInt("rating3");

                    totalRating1 += rating1;
                    totalRating2 += rating2;
                    totalRating3 += rating3;
                    count++;
                }

                if (count > 0) {
                    double averageRating1 = (double) totalRating1 / count;
                    double averageRating2 = (double) totalRating2 / count;
                    double averageRating3 = (double) totalRating3 / count;

                    System.out.println("Maestro ID: " + MaestroID);
                    System.out.println("Average Rating 1: " + averageRating1);
                    System.out.println("Average Rating 2: " + averageRating2);
                    System.out.println("Average Rating 3: " + averageRating3);
                } else {
                    System.out.println("No se ha encontrado calificaciones para el ID: " + MaestroID);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void submitCalificacionToDatabase(int maestroID2, int rating12, int rating22, int rating32) {
    }
}
