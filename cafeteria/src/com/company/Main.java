package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    String food, more ;
    double price, total;

    public Main() {
        do                       // repeat for each new customer
        { total = 0.00;
            do
            {                          // repeat for each food item
                food = input("Food item");
                if( food.equalsIgnoreCase("ha") )       // hamburger
                {  price = 3.50; }
                else if (food.equalsIgnoreCase("ff"))   // french fries
                {  price = 1.75; }
                else if (food.equalsIgnoreCase("ap"))   // apple
                {  price = 0.90; }
                else if (food.equalsIgnoreCase("dr"))   // drink
                {  price = 1.40; }
                else
                {  price = 0.00; }            // unknown item
                System.out.println(food + "\t" + price);
                total = total + price;
            } while(!food.equals(""));  // press ENTER after last item

            System.out.println("Total wo taxes = " + total);
            BigDecimal bd = new BigDecimal(total*1.15).setScale(2, RoundingMode.HALF_UP);
            double newtotal = bd.doubleValue();
            System.out.println("Total with taxes = " + newtotal); // adds 15% taxes

            more = input("Next customer (or type 'quit')");
        } while (!more.equals("quit"));
    }

    public static void main(String[] args)
    {  new Main(); }

    public String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }
}
