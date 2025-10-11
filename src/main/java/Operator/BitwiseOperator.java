package Operator;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
//        Bitwise - &, |

        Scanner scan=new Scanner(System.in);
        System.out.println("provide total marks:" );
       int totalMark = scan.nextInt();
       System.out.println("provide maths marks:" );
        int mathMark = scan.nextInt();

        String status= (totalMark>=400 | mathMark>=90) ? "Allowed": "Not Allowed";
        System.out.println(status);

    }
}
