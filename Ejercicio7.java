import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número ASCII: ");
        int codigoAscii = scanner.nextInt();

        // Convertir el código ASCII a carácter
        char caracter = (char) codigoAscii;

        System.out.println("El carácter correspondiente es: " + caracter);
    }
}
