package com.company;
import java.lang.Math;


public class Main {
    static int[] A = {1, 4, 9, 11, 15,16};
    public static void main(String[] args) {
        int min = 2147483647;
        for (int i = 0; i < A.length - 1; i++) {
            if (Math.abs(A[i] - A[i + 1]) < min) {
                min = Math.abs(A[i] - A[i + 1]);
            }
        }
        output("Maziausias tarpas = " + min);
    }
    public static void output(String message) {
        javax.swing.JOptionPane.showMessageDialog(null,message);
    }
}
