package Objects;

public class Table {

    //instance variables/object variables
    String brand;
    float width;
    int length;
    String color;
    int capacity;

    static String madein="India";



}

class TableDemo{
    public static void main(String[] args) {

       // Table.madein="India";

        Table t1= new Table();
        t1.brand="brandA";
        t1.color="white";

        Table t2= new Table();
        t2.brand="brandB";
        t2.color="black";
        t2.madein="Japan";

        t1=t2;
        t2=null;

        System.out.println(t1.color);

    }

}
