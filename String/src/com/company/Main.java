package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        check(Main());
    }

    private static void check(String print) {
        String day =print.substring(0,2);
        String month = print.substring(3,5);
        if(print.length() == 10) {
            if (Integer.parseInt(day) <= 31 && Integer.parseInt(day) > 0) {
                if(print.charAt(2) == '.'){
                    if(Integer.parseInt(month) <= 12 && Integer.parseInt(month) > 0){
                        if(print.charAt(5) == '.') {
                            System.out.println("Congrats you entered the right date format");
                        }
                        else{
                            System.out.println("Wrong date format");
                        }
                    }
                    else{
                        System.out.println("Wrong date format");
                    }
                }
                else{
                    System.out.println("Wrong date format");
                }
            }
            else{
                System.out.println("Wrong date format");
            }
        }
        else{
            System.out.println("Wrong date format");
        }
    }


    public static String Main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the date: ");
        return input.nextLine();
    }
}