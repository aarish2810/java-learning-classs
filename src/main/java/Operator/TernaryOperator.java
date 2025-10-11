package Operator;

public class TernaryOperator {
    public static void main(String[] args) {
         int num=45;
         int rem=num%10;

         String val= (rem==0)?"Even":"Odd";
        System.out.println(num+ " is " +val);
    }
}
