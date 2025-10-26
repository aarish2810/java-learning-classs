package Assignment;

import java.util.Scanner;

public class ConvertInches {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide inches:");
      //  double inches = sc.nextDouble();

        if (sc.hasNextDouble()){
            double inches = sc.nextDouble();
            double metres = inches * 0.0254;

            System.out.printf("In meters: %.2f", metres);
        }
        else  {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
