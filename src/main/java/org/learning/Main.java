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


        System.out.println("Calcolo biglietto treno");
        System.out.println("Inserisci la tua età");
        int eta=Integer.parseInt(scanner.nextLine());
        System.out.println("Inserisci i km che vuoi percorrere");
        double km=Double.parseDouble(scanner.nextLine());
        Ticket ticket = new Ticket(km,eta);
        System.out.println("Il prezzo è di: " + ticket.totalPrice);
        if (ticket.sale()==0){
            System.out.println("Non rientri in nessuna condizione per ricevere uno sconto");
        }else{
            System.out.println("Per te è riservato uno sconto, il nuovo prezzo è di: " + ticket.sale());
        }
        scanner.close();
    }
}
