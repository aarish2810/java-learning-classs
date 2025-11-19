public class InbuildClass {

    public static void main(String[] args) {


       double power= Math.pow(2,0.5);
        System.out.println("power is "+power);

       double abst= Math.abs(-9.786);
        System.out.println("abstract is "+abst);


        System.out.println("Random nos are: ");
        for(int i=1; i<=10; i++){
            int randomnum=generateRandom(45,200);
            System.out.println(randomnum);
        }
        String str1="";
        //System.out.println("Random chars are: ");
        for(int i=1; i<=10; i++){
            char randomchar=generateRandomchar(100,110);
            str1=str1+randomchar;
        }
        System.out.println("Random string : "+str1);

    }

    public static int generateRandom(int start, int end) {
        int rnum = (int)(start+(Math.random()*(end-start)));
        return rnum;

    }

    public static char generateRandomchar(int start, int end) {
        char rnum = (char)(start+(Math.random()*(end-start)));
        return rnum;

    }
}
