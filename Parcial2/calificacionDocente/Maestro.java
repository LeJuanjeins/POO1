import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Maestro {
    private int id;
    private String nombre;
    private String apellido;

    public int getId() {
        return id;
    }
    public void setMaestro(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public static Maestro getById(int maestroId) {
        Maestro maestro = null;
        String host = "127.0.0.1";
        String user = "root";
        String password = " ";
        int port = 3306;
        String database = "calificacion_maestros";
        String url = String.format("jdbc:mysql://%s:%d/%s", host, port, database);

        String selectQuery = "SELECT MaestroID, NombreM, ApellidoM FROM maestros WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(selectQuery)) {

            statement.setInt(1, maestroId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");

                    maestro = new Maestro();
                    maestro.setMaestro(id,nombre,apellido);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return maestro;
    }
}
