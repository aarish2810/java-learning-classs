package Objects;

public class MethodDemo {

    public static void main(String[] args) {

        int sub = Calculator.subtract(7,9);
        System.out.println(sub);
    }
}
    class Calculator
    {

        void printMyValues(String content)
        {
            System.out.println("My values"+content);
        }

        double getPiValue()
        {
                       return 3.14d;
        }
        int add(int a,int b)
        {
            int c=a+b;
            return c;
        }

        /**
         * This method performing subtraction of 2 numbers
         * a is first number of int data type
         * b is first number of int data type
         * performed operation using (-) symbol/operation
         */
        static int subtract(int a,int b)
        {
            int c=a-b;
            return c;
        }

    }

