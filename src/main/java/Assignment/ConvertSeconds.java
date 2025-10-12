package Assignment;

import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide seconds:");
        int givenSec=sc.nextInt();
        //conver seconds to hour, minut and seconds
        int hours=givenSec/3600;
        int minutes=(givenSec%3600)/60;
        int seconds=givenSec%60;

        System.out.println(hours+" hours "+minutes +" mins "+seconds+" secs");
    }
}
