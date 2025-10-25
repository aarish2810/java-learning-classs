package Assignment;

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num=sc.nextDouble();

        double square=num*num;
        double cube=square*num;
        double fourthpower=cube*num;

        System.out.println("The cube is "+cube+"\nThe square is "+square+"\nThe fourthpower is "+fourthpower);
    }
}
