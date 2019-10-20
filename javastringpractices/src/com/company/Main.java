package com.company;
import java.util.Scanner;  // Import the Scanner class


public class Main {

    public static void main(String[] args) {
        compare(input());
    }

    public static String input(){
        Scanner word = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter 2 words: ");
        return word.nextLine();
    }
    public static void compare(String word){
        String letters = word.substring(0,2);
        int spaceindex = word.indexOf(" ");
        String letters2 = word.substring(spaceindex+1, spaceindex+3);
        if(letters.equals(letters2)){
            System.out.println("Similar words");
        }
        else{
            System.out.println("Try again");
        }
    }
}
