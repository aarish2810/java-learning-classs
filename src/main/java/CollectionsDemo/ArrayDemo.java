package CollectionsDemo;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

//        int [] studentmarks = {30,40,50,60,70};
//        int length=studentmarks.length;
//        System.out.println(studentmarks[1]);
//        System.out.println("size:"+length);

        int [] studentmarks2 = new int[5];
        studentmarks2[0]=40;
        studentmarks2[1]=50;
        studentmarks2[2]=60;
        studentmarks2[3]=70;
        studentmarks2[4]=80;

        System.out.println(Arrays.toString(studentmarks2));

        for (int i=0;i<studentmarks2.length;i++){
            System.out.println(studentmarks2[i]);
        }


        for(int a :studentmarks2)
            {
            System.out.println(a);
            }
    }
}
