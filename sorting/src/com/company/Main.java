package com.company;

public class Main {

    public static void main(String[] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        int[] input1 = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        select_srt(input1);
        //bubble_srt(input);
    }


    public static void bubble_srt(int num []) {
        for(int i = 0; i <num.length-1; i++){
            for (int ii = 0; ii < num.length-i-1; ii++){
                if(num[ii] > num[ii+1]){
                    int temp = num[ii+1];
                    num[ii+1] = num[ii];
                    num[ii] = temp;
                }
                printNumbers(num);
            }
        }
    }

    public static void select_srt(int num []){
        for(int i = 0; i < num.length; i++){
            int maziausioindexas = min(num, i);
            int maziausias = num[maziausioindexas];
            int temp = num[i];
            num[i] = maziausias;
            num[maziausioindexas] = temp;
        }
        printNumbers(num);

    }

    public static int min(int num[], int cc){
        int min = num[cc];
        int minindex = cc;
        for (int i = cc; i < num.length; i++){
            if(num[i] < min) {
                min = num[i];
                minindex = i;
            }
        }
        return minindex;
    }



    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}

//  Show array in List//
//================================================
// Bubble Sort //
//===============================================
// Selection Sort //
//===============================================
// Insert a new number  into a sorted list//
//==============================================
// Implement Binary search//
