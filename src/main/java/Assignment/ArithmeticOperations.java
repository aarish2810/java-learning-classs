package Assignment;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 2 int numbers:");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        int num1=(int) a;
        int num2=(int) b;
        System.out.println("Entered integers are:"+num1+"\n"+num2);
        int sum=num1+num2;
        int diff=num1-num2;
        int product=num1*num2;
        int average=(num1+num2)/2;
        int distance=Math.abs(num1-num2);
        int min=Math.min(num1, num2);
        int max=Math.max(num1,num2);
        System.out.println("The sum is:"+sum);
        System.out.println("The difference is:"+diff);
        System.out.println("The product is:"+product);
        System.out.println("The average is:"+average);
        System.out.println("The distance is:"+distance);
        System.out.println("The minimum is:"+min);
        System.out.println("The maximum is:"+max);

    }
}
