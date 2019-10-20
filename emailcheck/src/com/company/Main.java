package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String email  = input();
    int atIndex = email.indexOf("@");
    domain(email, atIndex);
    }
    public static String input(){
        Scanner email = new Scanner(System.in);
        System.out.println("Enter email:");
        return email.nextLine();
    }
    public static void domain(String email, int atIndex){
        if(atIndex < 0){
            System.out.println("No @ sign");
        }
        else{
            int dot = email.lastIndexOf('.');
            if(dot > atIndex){
                String domain = email.substring(atIndex+1, email.length());
                System.out.println("Domain: " + domain);
            }
            else if(dot < 0){
                System.out.println("No . was found");
            }
        }
    }
}
