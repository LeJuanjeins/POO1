public class Usuario {
    private String role;

    public void setUsuario(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void calificarMaestro(int MaestroID, int rating1, int rating2, int rating3) {
        if (role.equals("student")) {
            Calificacion calificacion = new Calificacion();
            Calificacion.submitCalificacionToDatabase(MaestroID, rating1, rating2, rating3);
            System.out.println("Calificacion existosa.");
        } else {
            System.out.println("Solo los alumnos pueden calificar.");
        }
    }

    public void generateTeacherRatingsReport(int MaestroID) {
        if (role.equals("director")) {
            Calificacion.generateTeacherRatingsReport(MaestroID);
        } else {
            System.out.println("Solo el director puede generar el reporte.");
        }
    }
}
