package com.company;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public void Main(){
        String time = input("Input time in format hh:mm");
        char first = time.charAt(0);
        char second = time.charAt(1);
        char third = time.charAt(2);
        char fourth = time.charAt(3);
        char fifth = time.charAt(4);
        if(time.length() == 5) {
            if (first == '1' || first == '0') {
                if(second == '0' || )
            }
            else if ( first == '2'){

            }
        }
    }

    public static String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }

    public static void output(String message)
    {  javax.swing.JOptionPane.showMessageDialog(null,message);  }
}
