package Parcial2.Reina;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("admin", "123"));

        while (true) {
            boolean acceso = false;
            String usuario;
            String contraseña;

            do {
                System.out.println("=== Inicio de Sesión ===");
                System.out.print("Ingrese el usuario (o 'registro' para registrarse): ");
                usuario = scanner.nextLine();

                if (usuario.equalsIgnoreCase("registro")) {
                    registrarUsuario(scanner, usuarios);
                    System.out.println("Registro exitoso. Ahora puedes iniciar sesión con tu nuevo usuario.");
                } else {
                    System.out.print("Ingrese la contraseña: ");
                    contraseña = scanner.nextLine();

                    if (validarCredenciales(usuario, contraseña, usuarios)) {
                        acceso = true;
                        System.out.println("Ingreso de contraseña correcta.");
                        System.out.println("¡Bienvenido, " + usuario + "!");

                        Menu menu = new Menu(scanner);

                        while (true) {
                            menu.mostrar();
                            int opcion = menu.obtenerOpcion();

                            switch (opcion) {
                                case 1:
                                    if (usuario.equals("admin")) {
                                        int seleccion = menu.obtenerOpcionReina();
                                        if (seleccion != -1) {
                                            System.out.print("Ingrese la calificación de inteligencia (1-10): ");
                                            int calificacionInteligencia = menu.obtenerCalificacion();
                                            if (calificacionInteligencia != -1) {
                                                System.out.print("Ingrese la calificación de belleza (1-10): ");
                                                int calificacionBelleza = menu.obtenerCalificacion();
                                                if (calificacionBelleza != -1) {
                                                    menu.calificarReina(reinas[seleccion - 1], calificacionInteligencia, calificacionBelleza);
                                                    System.out.println("Calificación exitosa.");
                                                } else {
                                                    System.out.println("Error: Calificación de belleza inválida. Debe ser un número del 1 al 10.");
                                                }
                                            } else {
                                                System.out.println("Error: Calificación de inteligencia inválida. Debe ser un número del 1 al 10.");
                                            }
                                        } else {
                                            System.out.println("Error: Selección de reina inválida. Debe ser un número del 1 al 3.");
                                        }
                                    } else {
                                        System.out.println("Acceso denegado.");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Información de las reinas:");
                                    menu.mostrarInformacionReinas(reinas);
                                    break;
                                case 3:
                                    System.out.println("Cerrando sesión...");
                                    System.out.println();
                                    break; // Salir del bucle interno y volver a solicitar inicio de sesión
                                default:
                                    System.out.println("Opción inválida. Vuelva a intentarlo.");
                                    break;
                            }

                            System.out.println();
                            if (opcion == 3) {
                                break; // Salir del bucle interno y volver a solicitar inicio de sesión
                            }
                        }
                    } else {
                        System.out.println("Usuario o contraseña incorrectos. Vuelva a intentarlo.");
                        System.out.println();
                    }
                }
            } while (!acceso);
        }
    }

    static Reina[] reinas = {
            new Reina("Reina 1"),
            new Reina("Reina 2"),
            new Reina("Reina 3")
    };

    static boolean validarCredenciales(String usuario, String contraseña, List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    static void registrarUsuario(Scanner scanner, List<Usuario> usuarios) {
        System.out.println("=== Registro de Usuario ===");
        System.out.print("Ingrese un nombre de usuario: ");
        String nuevoUsuario = scanner.nextLine();

        // Validar si el usuario ya existe
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(nuevoUsuario)) {
                System.out.println("El nombre de usuario ya está registrado. Por favor, elija otro.");
                return;
            }
        }

        System.out.print("Ingrese una contraseña: ");
        String nuevaContraseña = scanner.nextLine();

        usuarios.add(new Usuario(nuevoUsuario, nuevaContraseña));
    }
}