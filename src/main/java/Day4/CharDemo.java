package Day4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CharDemo {
    public static void main(String[] args) {
        //2 types - ASCII & Unicode
        //ASCII - 1 byte

       /* char ch='u';
        System.out.println(ch);

        int e=65;
        char c=(char)e;
        System.out.println(c);

        char c1='S'+8;
        System.out.println(c1);*/

        // Unicode - 2 byte
        System.out.println("my son name in tamil:");
        char ni='\u0BA8';
        char as='\u0BBF';
        char la='\u0BB2';
        char in ='\u0BA9';
        char in2='\u0BCD';

        System.out.println(""+ni+as+la+in+in2);

        Scanner scan =new  Scanner(System.in);
        System.out.println("Provider first no:");
        int p=scan.nextInt();
        System.out.println("Provider second no:");
        int q=scan.nextInt();
        int mul=p*q;
        System.out.println("Multiplication:");







    }
}
