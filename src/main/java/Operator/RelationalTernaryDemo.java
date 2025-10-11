package Operator;

public class RelationalTernaryDemo {
    public static void main(String[] args) {

        // Relational operator returns only boolean value
        int a=10;
        int b=10;
        System.out.println(a==b);
        System.out.println(a>b);

        int c=895;
        int rem=c%2;

        String valueType=(rem==0)?"Even" :"Odd";
        System.out.println("num is :"+valueType);

    }
}
