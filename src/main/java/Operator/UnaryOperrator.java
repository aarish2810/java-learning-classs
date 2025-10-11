package Operator;

public class UnaryOperrator {
    public static void main(String[] args) {

        //Unary : + - ++ -- ! ~

        int i=10;
        int j=10;

        int k=i++ + j-- + i-- - j++;
        System.out.println(k);
        System.out.println(j);
        System.out.println(i);

        boolean b1= true;
        System.out.println(!(b1));

        int u1=10;
        int u2=10;
        System.out.println(!(u1==u2));

            int d=-8;
        System.out.println(~d);
    }
}
