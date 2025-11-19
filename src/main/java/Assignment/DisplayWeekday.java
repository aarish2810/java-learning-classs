package Assignment;

import ConditionalOperatorDemo.IfElseClass;

import java.util.Scanner;

public class DisplayWeekday {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input between 1 and 7");
        int input = sc.nextInt();

        if(input==1) {
            System.out.println("Weekday is Sunday");
        } else if(input==2) {
            System.out.println("Weekday is Monday");
        } else if(input==3) {
            System.out.println("Weekday is Tuesday");
        } else if(input==4) {
            System.out.println("Weekday is Wednesday");
        } else if(input==5) {
            System.out.println("Weekday is Thursday");
        } else if(input==6) {
            System.out.println("Weekday is Friday");
        } else if(input==7) {
            System.out.println("Weekday is Saturday");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
