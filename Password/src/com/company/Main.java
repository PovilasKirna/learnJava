package com.company;

public class Main {

    public static void main(String[] args) {
        String name = input("Type your username: ");
        String start = name.substring(0,3);
        if(start.equals("Sup") && name.length() == 8){
            output("You must be superman");
            for(int i = 0; i< 3; i++) {
                String password = input("Type your password: ");
                if (password.equals("Kryptonite") || password.equals("kryptonite")) {
                    output("Great");
                    break;
                }
                else {
                    output("Your are a phony, try again");
                }
            }
        }
        else{
            output("Yikes");
        }
    }

    public static String input(String prompt) {
        return javax.swing.JOptionPane.showInputDialog(null,prompt);
    }

    public static void output(String message) {
        javax.swing.JOptionPane.showMessageDialog(null,message);
    }
}
