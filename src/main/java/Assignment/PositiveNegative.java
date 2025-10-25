package Assignment;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = sc.nextInt();

        if(a>0)
        {
            System.out.println("Entered number is positive");
        }
        else
        {
            System.out.println("Entered number is negative");
        }
    }
}
