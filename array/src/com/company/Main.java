package com.company;

public class Main
{
    static double[] data = {1,2,3,41,7,15,2,5};

    public static void main(String[] args)
    {
        printArray();
        addUp();
        findMax();
        findMin();
        findMore10();
        findTeens();
        add10();
    }

    static void addUp()
    {
        double total = 0;
        int x = 0;
        for(x = 0; x < data.length; x = x+1)
        {
            total = total + data[x];
        }
        output("Total = " + total);
        double average = total/(x-1);
        String formatted = String.format("%.2f", average);
        output("Average = " + formatted);
    }

    static  void printArray()
    {
        String info = "";
        for(int c=0; c < data.length; c=c+1)
        {
            info = info + data[c] + ", ";
        }
        output(info);
    }
    static void findMax(){
        double Big = 0;
        for(int i = 0; i < data.length; i++){
            if(Big< data[i])
                Big = data[i];
        }
        output("Biggest = " + Big);
    }
    static void findMin(){
        double min = 2147483647;
        for(int i = 0; i < data.length; i++){
            if(min > data[i])
                min = data[i];
        }
        output("Smallest = " + min);
    }
    static void findMore10(){
        for(int i = 0; i < data.length; i++){
            if(10 <  data[i])
                System.out.println("More than 10: " + data[i]);
        }
    }
    static void findTeens(){
        int cc = 0;
        for(int i = 0; i < data.length; i++){
            if(12 <  data[i] && data[i] < 20)
                cc++;
        }
        output("There were: " + cc + " teens. ");
    }
    static void add10(){
        for(int i = 0; i < data.length; i++){
            data[i] = data[i]/10+data[i];
        }
        printArray();
    }
    public static String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }

    public  static void output(String message)
    {  javax.swing.JOptionPane.showMessageDialog(null,message);  }
}
