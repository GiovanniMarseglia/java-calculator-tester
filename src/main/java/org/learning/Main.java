package org.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1;
        float num2;
        System.out.println("Inserisci il primo numero");
        num1=Float.parseFloat(scanner.nextLine());
        System.out.println("Inserisci il secondo numero");
        num2=Float.parseFloat(scanner.nextLine());
        Calculator calculator = new Calculator();
        System.out.print("Somma: ");
        System.out.println(calculator.add(num1,num2));
        System.out.print("Sottrazione: ");
        System.out.println(calculator.subtract(num1,num2));
        System.out.print("Divisione: ");
        System.out.println(calculator.divide(num1,num2));
        System.out.print("Moltiplicazione: ");
        System.out.println(calculator.multiply(num1,num2));
        scanner.close();
    }
}
