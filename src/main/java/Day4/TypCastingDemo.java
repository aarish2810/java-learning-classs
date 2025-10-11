package Day4;

public class TypCastingDemo {
    public static void main(String[] args) {
        //byte b1=(byte) 130;
        //byte b2=(byte)(short) 130;
        byte b3=(byte)(int)(short)130;
        System.out.println(b3);
    }
}
