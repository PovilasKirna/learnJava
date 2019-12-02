package com.company;

public class Main
{
    String[] titles = {"Cafe del Mar 18",
            "Valtari",
            "Nature One",
            "Swagg",
            "Netsky 2",
            "DJ Kicks",
            "Trouble"
    };

    public Main()
    {
        String name = "";
        do
        {
            name = input("Type the name of the CD");
            search(name);
        } while(name.length() > 0);   // type nothing to quit
    }

    void search(String name)
    {
        for(int c = 0; c < titles.length; c=c+1)
        {
            String names = titles[c].toLowerCase();
            String qname = name.toLowerCase();


            if( names.equals(qname) )
            {
                output("Found " + name);
                return;                   // quits if name is found
            }
        }
        output("Not found - you don't own that");
    }

    public static void main(String[] args)
    {  new Main(); }

    public String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }

    public void output(String message)
    {  javax.swing.JOptionPane.showMessageDialog(null,message);  }
}