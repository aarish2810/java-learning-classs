package Assignment;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int n=num;
        int sum=0;

        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }

        System.out.println("The sum is:"+sum);
        System.out.println("The number is:"+num);
        if(sum==num) {
            System.out.println("Entered number is a Armstrong number");
        } else {
            System.out.println("Entered number is not a Armstrong number");
        }
    }
}


