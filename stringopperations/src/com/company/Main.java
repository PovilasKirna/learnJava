package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        math(input());
    }

    public static String input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operation line: ");
        return input.nextLine();
    }

    public static void math(String line){
        int length = line.length();
        double first_number = Double.parseDouble(line.substring(0,getNumber(line)));
        double second_number = Double.parseDouble(line.substring(getNumber(line)+1, length));
        if(line.charAt(getNumber(line)) == '+'){
            System.out.println(first_number+second_number);
        }
        else if(line.charAt(getNumber(line)) == '-'){
            System.out.println(first_number-second_number);
        }
        else if(line.charAt(getNumber(line)) == '/'){
            System.out.println(first_number/second_number);
        }
        else if(line.charAt(getNumber(line)) == '*'){
            System.out.println(first_number*second_number);
        }
        else{
            System.out.println("Error");
        }
    }

    private static int getNumber(String line){
        int i = 0;
        while(line.charAt(i) != '+' && line.charAt(i) != '-' && line.charAt(i) != '/' && line.charAt(i) != '*'){
            i++;
        }
        return i;
    }
}
