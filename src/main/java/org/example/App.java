/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        double tax = 0, total = 0;

        //asking to input order amount
        System.out.println("What is the order amount?");
        double order = scanner.nextDouble();

        //asking to input state you live in
        System.out.println("What state do you live in?");
        String state = scanner.next();

        //if statement for WI state tax for eau claire
        if (state.equals("Wisconsin") || state.equals("WI") || state.equals("wisconsin")) {

            //asking what country you live in
            System.out.println("What county do you live in?");
            String county = scanner.next();

            //nested if statement to see what country, county, and state and calculates
            if (county.equals("EauClaire") || county.equals("eau") || county.equals("eau_claire")) {
                tax = ((order * 5) + (order * .005))/100;

                total = tax + order;
            }
            else if(county.equals("Dunn") || county.equals("dunn")){
                tax = ((order * 5) + (order * .004))/100;

                total = tax + order;
            }
            else{
                System.out.println("Not a valid county");
            }
        }
        else if(state.equals("Illinoi") || state.equals("illinoi")){
            tax = (order * .08);

            total = tax + order;
        }
        else{

            total = order;
        }
        //outputs for tax and total
        System.out.format("The tax is $%.2f\nThe total is $%.2f", tax, total);
    }
}
