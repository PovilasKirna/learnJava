package com.company;

public class Main
{
    String[] items = {"pencil","pen","sharpie","notebook A",
            "notebook B","eraser","tippex","usb stick","glue","tape"
    };

    int[] inverntory = {4, 5, 3, 2,1 ,0 ,10,9,9,8,};

    double[] prices = { 0.75 , 1.50 , 1.20 , 1.90 , 2.50 ,
            0.50 , 1.75 , 5.00 , 1.25 , 2.00
    };

    public Main()
    {
        String name = "";
        String amounts = "";
        double amount;
        printlessthan2();
        printtotalcost();
        do
        {
            name = input("Type the name of an item");
            amounts = input("Type the amount you wanna buy: ");
            amount = Double.parseDouble(amounts);
            double price = getPrice(name, amount);
            if(price > 0)
            { output(name + " = " + price); }
            else if(price == -1){
                output(name +" Is not in stock");
            }
            else
            { output(name + " was not found"); }
        } while(name.length() > 0);             // type nothing to quit
    }

    double getPrice(String name, double amount)           // search for name, return price
    {                                     // the price is not case-sensitive
        for(int x=0; x < prices.length; x = x+1)
        {
            if(items[x].equalsIgnoreCase(name) && amount <= inverntory[x])    // not cases-sensitive
            {
                return prices[x]*amount;
            }
            else {
                return -1;
            }
        }
        return 0.00;
    }

    public void printtotalcost(){
        double total=0;
        for (int i = 0; i<items.length; i++){
            total+=prices[i]*inverntory[i];
        }
        System.out.println("Total cost: " +total);
    }

    public void printlessthan2(){
        for (int i = 0; i < items.length; i++){
            if (prices[i] < 2){
                System.out.println(items[i]+ ":  " +prices[i]);
            }
        }
    }

    public static void main(String[] args)
    {  new Main();  }

    public String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }

    public void output(String message)
    {  javax.swing.JOptionPane.showMessageDialog(null,message);  }
}
