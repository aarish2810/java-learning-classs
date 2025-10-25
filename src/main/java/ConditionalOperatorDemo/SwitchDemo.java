package ConditionalOperatorDemo;

public class SwitchDemo {
    public static void main(String[] args) {
        int i=0;
        for(i=0;i<3;i++)
        {
            switch(i)
            {
                case 0:break;
                case 1: System.out.println("one");
                case 2: System.out.println("two");
                case 3: System.out.println("three");


            }
        }
        System.out.println("done");
    }
}
