package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Definir variables
        double radio, area;

        // Crear objeto Scanner para entrada por teclado
        Scanner entrada = new Scanner(System.in);

        // Solicitar y leer el radio del círculo
        System.out.println("Ingrese el radio del círculo: ");
        radio = Double.parseDouble(entrada.nextLine());

        // Calcular el área del círculo
        area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo es: " + area);
    }
}
