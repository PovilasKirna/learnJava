package com.company;


public class Main
{
    public Main()
    {
        String today = input("Today's date (mm.dd)");
        String another = "";
        while(another.equals(""))
        {
            String dueDate = input("Due date (mm.dd)");
            int days = daysLate(today, dueDate);
            System.out.println("Today = " + today);
            System.out.println("Due = " + dueDate);
            System.out.println("Days overdue = " + days);

            if(days == 9999)
            { System.out.println("Wrong date format entered."); }
            else if(days<=0)
            { System.out.println("No fine"); }
            else if(days<=7)
            { System.out.printf("Fine = " + "'%.2f'", (days*0.5)); }
            else if(days<=14)
            { System.out.printf("Fine = " + "'%.2f'", (3.5+(days-7)*0.4)); }
            else if(days<=21)
            { System.out.printf("Fine = " + "'%.2f'", (6.3+(days-14)*0.3)); }
            else if(days<=28)
            { System.out.printf("Fine = " + "'%.2f'", (8.4+(days-21)*0.2)); }
            else
            { System.out.println("Fine = " + (9.8+(days-28)*0.1)); }
            another = input("Press [Enter] for another book");
        }
    }

    int daysLate(String today,String dueDate)
    {
        int dotIndex = today.lastIndexOf('.');
        int dotIndex2 = dueDate.lastIndexOf('.');
        if(dotIndex == 2 && dotIndex2 == 2){
            int td = Integer.parseInt(today.substring(dotIndex+1));    // today's day
            int tm = Integer.parseInt(today.substring(0,dotIndex));    // today's month

            int dd = Integer.parseInt(dueDate.substring(dotIndex+1));  // dueDate's day
            int dm = Integer.parseInt(dueDate.substring(0,dotIndex));  // dueDate's month

            if(tm == dm)
            {
                if(dd >= td) {  return -1; }                     // not overdue
                else {  return td-dd; }                  // days overdue
            }
            else if (dm > tm) {  return -1; }                        // not overdue
            else {                                      // tm > dm, due last month
                return (tm-dm)*30 + (td-dd);        // count 30 days per month
            }
        } else { return 9999; }
    }

    public static void main(String[] args)
    {  new Main();  }

    public String input(String prompt)
    { return javax.swing.JOptionPane.showInputDialog(null,prompt); }
}

//if date is december and due date is next year january it will think thats its overdue 12 months. solution is to add year to the date.