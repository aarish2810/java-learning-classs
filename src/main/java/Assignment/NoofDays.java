package Assignment;

import java.util.Scanner;

public class NoofDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a valid month");
        int month = sc.nextInt();
        int days = 0;
        int year = 0;

        if (month == 2)
        {
            System.out.println("Please enter the year");
            year = sc.nextInt();
        }

        if (month == 1 || month == 12 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)
        {
            days = 31;

        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            days = 30;
        }
        else if (month == 2)
        {

            int rem = year % 4;
            if (rem == 0) {
                days = 29;
            } else {
                days = 28;
            }

        }


        else
        {
            System.out.println("Invalid month");
           return;
        }

        System.out.println("No of days:"+ days);
    }
}
