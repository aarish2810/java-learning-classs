import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        String rfilename="";
        for(int i=1;i<=10;i++)
        {
          rfilename=rfilename+InbuildClass.generateRandomchar(98,100);
        }

       File f=new File("C:/Users/Lenovo/IdeaProjects/java-learning-classs/Aarisha/sdsf/"+rfilename);
        f.mkdir();
        System.out.println(f.list().length);



    }
}
