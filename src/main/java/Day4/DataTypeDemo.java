package Day4;

public class DataTypeDemo {
    public static void main(String[] args) {
        //byte -128 to +127
//        byte b=10;
        short s = 400;
        //type casting - forcefully fitting larger datatype into smaller datatype
        byte b1= (byte)s;
        System.out.println(b1);
    }
}
