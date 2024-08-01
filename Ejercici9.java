package com.mycompany.ejercici9;

import java.util.Scanner;
public class Ejercici9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        // Tasa del IVA (ajusta según tu región)
        double tasaIVA = 0.21; // 21% en este ejemplo

        double iva = precioProducto * tasaIVA;
        double precioFinal = precioProducto + iva;

        System.out.println("El IVA a pagar es: $" + iva);
        System.out.println("El precio final con IVA es: $" + precioFinal);
    }
}
