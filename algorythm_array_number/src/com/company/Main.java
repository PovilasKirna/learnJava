package com.company;
import java.util.Arrays;


class ArrayOffNumbers {

    double[] data = {5, 14, 15, 10, 11, 14, 15, 8};

    public static void main(String[] args) {
        new ArrayOffNumbers();
    }

    ArrayOffNumbers() {
//        printArray();
//        countOver(12);
//        countOver(20);
//        findValue(11);
//        findValue(27);
//        makeSum(20);
//        findDuplicates();
//        findTwoLargest();
        frequencyDistribution(5);
//        frequencyDistribution(10);
//        findMedian();
//        showTop(5);
//        showTop(3);
//        findLargest();
//        findSmallest();
//        printArray();

    }

    //print an array numbers and their index.
    void printArray() {
        String text = "";
        for (int i=0; i < data.length; i++){
            text+=((i+1)+". "+data[i]+ "\n");
        }
        output(text);
    }

    // count the number of data items larger than target number
    void countOver(double min)    // change this so that
    {
        int counter = 0;
        for (int i=0; i < data.length; i++){
            if(data[i] >= min){
                counter++;
            }
        }// countOver(12) INCLUDES 12
        output("There are "+counter+" term higher than "+min);
    }

    //search for a specific number and count how many times it occurs
    void findValue(double target){
        int counter = 0;
        boolean flag = false;
        for (int i = 0; i < data.length; i++){
            if(data[i] == target){
                counter++;
                flag=true;
            }
        }
        if(flag)
            output("There were "+counter+" terms with value "+target);
        else
            output("There were no terms with value "+target);
    }

    //search for two numbers that add up to exactly a specific number
    int makeSum(int total){
        boolean flag = false;
        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if ((data[i] + data[j]) == total){
                    output("The terms " + data[i] + " and " + data[j] + " add up to a total of " + total);
                    flag = true;
                    return 0;
                }
            }
        }
        if(flag == false)
            output("There were no terms that add up to a total of "+ total);
        return 0;
    }

    //search for DUPLICATES
    void findDuplicates(){
        int counter = 0;
        for (int i = 0; i< data.length; i++){
            for(int j = i+1; j<data.length; j++){
                if (data[i] == data[j] && i!=j)
                    counter++;
            }
        }
        if(counter != 0)
            output("There were " + counter + " duplicate terms");
        else
            output("There were no duplicate terms");
    }

    // find the TWO LARGEST numbers
    void findTwoLargest(){
        Arrays.sort(data);
        output("Two largest terms are: "+data[data.length-2]+", "+data[data.length-1]);
    }

    double findLargest() {
        double max  = data[0];
        for(int i = 0; i < data.length; i++){
            if(data[i] > max)
                max = data[i];
        }
        output("Largest term in the array is equal to: " + max);
        return max;
    }

    double findSmallest() {
        double min  = data[0];
        for(int i = 0; i < data.length; i++){
            if(data[i] < min)
                min = data[i];
        }
        output("Smallest term in the array is equal to: " + min);
        return min;
    }

    //print a FREQUENCY DISTRIBUTION in specifc classes -------klaida
    void frequencyDistribution(double size) {
        Arrays.sort(data);
        int counter = 0;
        for (int j = 0; j <= findLargest(); j+=size){
            for(int i = 0; i < data.length; i++){
                if (data[i] <= j)
                    counter++;
            }
        }
        System.out.println(counter);
    }

    // Write a correct method for finding the median.
    void findMedian() {
        Arrays.sort(data);
        int half = data.length / 2;
        double median;
        if((half%2) == 0) {
            median = ((data[half]+data[half+1])/2);
        }
        else
            median = data[half];
        System.out.println(data.length+ "  "+ half);
        output("Median is "+ median);
    }

    // find the TOP NUMBERS  ----------------klaida
    void showTop(int howMany) {
        Arrays.sort(data);
        String text = "Top numbers are: ";
        for (int i = howMany+1; i > 0; i--) {
            text+=("\n"+data[data.length - i]);
        }
        output(text);
    }

    public static String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }

    public  static void output(String message)
    {  javax.swing.JOptionPane.showMessageDialog(null,message);  }
}
