package Assignment;

import java.util.Scanner;

public class PrintGreatest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: " );
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("The greatest number is " + n1);

        }
        else if (n2 > n1 && n2 > n3){
            System.out.println("The greatest number is " + n2);

        }
        else if (n3 > n1 && n3 > n2){
            System.out.println("The greatest number is " + n3);
        }
    }
}
