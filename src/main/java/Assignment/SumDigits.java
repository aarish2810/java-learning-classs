package Assignment;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        SumDigits s1=new SumDigits();
        int sum = s1.sumDigits(sc.nextInt());
        System.out.println("Sum is:"+sum);

    }

    public int sumDigits(int n) {
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;

    }
}
