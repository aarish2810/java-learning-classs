package Operator;

import java.util.Scanner;

public class InputFromConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide any integer:");
      int num=  scan.nextInt();
      //  System.out.println("you provided:"+num);

        int rem=num % 10;
        int div=num/10;
        int sum=rem+div;
        System.out.println("sum:"+sum);

    }
}
