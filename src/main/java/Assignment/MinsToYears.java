package Assignment;

import java.util.Scanner;

public class MinsToYears {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minutes: ");
      // long minutes = sc.nextLong();
if(sc.hasNextLong())
{
    long minutes = sc.nextLong();
    long years = minutes/(60*24*365);
    long days=minutes/(60*24);

    System.out.println(years+" Years "+days+" Days ");

}
   else{
    System.out.println("invalid output");
   }

    }
}
