package Day3;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("hello");
        int a; // Defining variable
        a=10; //initialize variable

        int b=10; //Early loading
        int c;
        c=90; // lazy loading
        c=c+c;
        System.out.println(c);
    }
}
