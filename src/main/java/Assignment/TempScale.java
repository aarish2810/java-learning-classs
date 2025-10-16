package Assignment;

import java.util.Scanner;

public class TempScale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        double celsius=sc.nextDouble();
        //celsius to Fahrenheit

        double fahrenheit=(celsius*1.8)+32;
        System.out.println("The temperature in Fahrenheit:"+fahrenheit);

        double kelvin=celsius+273;
        System.out.println("The temperature in Kelvin:"+kelvin);

    }
}
