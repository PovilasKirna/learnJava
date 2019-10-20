package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String time = input();
    lefttime(time);
    }
    public static String input(){
        Scanner time = new Scanner(System.in);
        System.out.println("Enter time HH:MM");
        return time.nextLine();
    }
    public static void lefttime(String time){
        String min = time.substring(time.indexOf(':')+1, time.length());
        int minutes = Integer.parseInt(min);
        System.out.println("Remaining " + (60-minutes) + " more minutes left.");
    }
}
