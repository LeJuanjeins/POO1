import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("ingrese operador (+ , - , * , /): ");
        char operador = scanner.next().charAt(0);
        double result;
        if (operador == '+') {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (operador == '-') {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (operador == '*') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (operador == '/') {
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result); 
        } else {
            System.out.println("No se reconoce el operador");
        }
    }
}