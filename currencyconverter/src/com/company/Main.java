package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Conversion is possible in EU <--> US, EU <--> BP, US <--> BP");
        String conversion = input("Enter conversion details format (from --> to): ");
        String amount = input("Enter amount of money to convert: ");
        convert(conversion, amount);
    }

    public static String input(String message){
        Scanner amount = new Scanner(System.in);
        System.out.println(message);
        return amount.nextLine();
    }
    public static void convert(String conversion, String amount){
        double realAmount = Double.parseDouble(amount);
        if (conversion.equals("EU --> US")){
            System.out.println(amount + " " +conversion.substring(0,2) + " --> "  + (realAmount*1.12) + " " +conversion.substring(conversion.lastIndexOf(' ')+1, conversion.length()));
        }
        else if(conversion.equals("US --> EU")){
            System.out.println(amount + " " +conversion.substring(0,2) + " --> "  + (realAmount*0.9) + " " +conversion.substring(conversion.lastIndexOf(' ')+1, conversion.length()));
        }
        else if(conversion.equals("EU --> BP")){
            System.out.println(amount + " " +conversion.substring(0,2) + " --> "  + (realAmount*0.86) + " " +conversion.substring(conversion.lastIndexOf(' ')+1, conversion.length()));
        }
        else if(conversion.equals("BP --> EU")){
            System.out.println(amount + " " +conversion.substring(0,2) + " --> "  + (realAmount*1.16) + " " +conversion.substring(conversion.lastIndexOf(' ')+1, conversion.length()));
        }
        else if(conversion.equals("US --> BP")){
            System.out.println(amount + " " +conversion.substring(0,2) + " --> "  + (realAmount*0.77) + " " +conversion.substring(conversion.lastIndexOf(' ')+1, conversion.length()));
        }
        else if(conversion.equals("BP --> US")){
            System.out.println(amount + " " +conversion.substring(0,2) + " --> "  + (realAmount*1.30) + " " +conversion.substring(conversion.lastIndexOf(' ')+1, conversion.length()));
        }
        else{
            System.out.println("Wrong conversion details, please try again.");
        }
    }
}
