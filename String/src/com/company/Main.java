package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main("Rokas Bokas"));
    }
    public static String Main(String name){
        String first = name.substring(0,1);
        int space = name.lastIndexOf(" ");
        String second = name.substring(space+1,space+2);
        return first.concat(second);
    }
}
