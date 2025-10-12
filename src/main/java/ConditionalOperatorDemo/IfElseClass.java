package ConditionalOperatorDemo;

public class IfElseClass {
    public static void main(String[] args) {
        int age=28;
        String food="";

        if(age<=18){
            food="sandwich";
            System.out.println(food);
        }
        else if(age>18 && age<=30){
            food="pizza";
            System.out.println(food);

        }
        else if(age>26 && age<=60){
            food="cheese";
            System.out.println(food);
        }
    }
}
