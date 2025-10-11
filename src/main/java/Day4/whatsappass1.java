package Day4;

public class whatsappass1 {

    static int count=0;
    whatsappass1()
    {
        count++;
    }

    public static void main(String[] args) {
        whatsappass1 a= new whatsappass1();
        whatsappass1 b= new whatsappass1();
        System.out.println(whatsappass1.count);
        System.out.println(a.count);
    }
}
