/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        double euros, exchangeRate, dollars;

        System.out.print("How many Euros are you exchanging? ");
        euros = scanner.nextDouble();
        System.out.print("What is the exchange rate? ");
        exchangeRate = scanner.nextDouble();

        dollars = euros * exchangeRate / 100;

        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is");
        System.out.println(String.format("%.2f", dollars) + " U.S. dollars.");



    }
}
