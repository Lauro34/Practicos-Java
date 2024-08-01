package com.mycompany.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Pedir al usuario que introduzca un carácter
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que introduzca un carácter
            System.out.print("Introduce un carácter: ");
            char caracter = scanner.next().charAt(0);
            // Convertir el carácter a su código ASCII correspondiente
            int codigoAscii = (int) caracter;
            // Mostrar el código ASCII resultante
            System.out.println("El código ASCII correspondiente al carácter '" + caracter + "' es: " + codigoAscii);
            // Cerrar el scanner
        }
    }
}
