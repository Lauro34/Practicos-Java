package com.mycompany.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es divisible entre 2.");
        } else {
            System.out.println(numero + " no es divisible entre 2.");
        }
    }
}
