package com.company;
class Main
{
    String[] names = new String[2400];  // from 0:00 until 24:00
    String[] namesother = new String[2400];  // from 0:00 until 24:00


    public Main()
    {
        String name = "";
        String answer = "";
        String counc = "";
        do{
            name = input("Name");
            if(name.equals("ABORT")){ System.exit(0); }  // end the program
            int time = Integer.parseInt(input("Time code (e.g. 840 or 1200)"));
            counc = input("Which councelor do you wish to visit? Dr. Romb, Dr. Sing");
            if(counc.equals("Dr. Romb") || counc.equals("Romb"))
                if(names[time] != null) {
                    output("Are you sure there is another client registered for this time!");
                    answer = input("Yes or No");
                    if (answer.equals("Yes") || answer.equals("Y") || answer.equals("yes"))
                        names[time] = name;
                }
                else
                    names[time] = name;
            else
                if(namesother[time] != null) {
                    output("Are you sure there is another client registered for this time!");
                    answer = input("Yes or No");
                    if (answer.equals("Yes") || answer.equals("Y") || answer.equals("yes"))
                        namesother[time] = name;
                }
                else
                    namesother[time] = name;
            showAllNames();
        } while(true);        // loop never ends
    }

    void showAllNames()     // shows all the times where there is a name
    {
        System.out.println("================");
        System.out.println("Dr. Romb");
        for(int t = 0; t < 2400; t=t+1)
        {
                String name = names[t];
                if(name!=null)
                {
                    System.out.println(t + "\t" + name);
                }
        }
        System.out.println("================");
        System.out.println("Dr. Sing");
        for(int t = 0; t < 2400; t=t+1)
        {
            String nameo = namesother[t];
            if(nameo!=null)
            {
                System.out.println(t + "\t" + nameo);
            }
        }
        System.out.println("================");
    }

    public static void main(String[] args)
    {  new Main(); }

    public String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }
    public  static void output(String message)
    {  javax.swing.JOptionPane.showMessageDialog(null,message);  }
}