
class Bank {

    String name;
    double interestRate;
    String ifscCode;
    static String branch;
    Bank(String name, double interestRate, String ifscCode){
    this.name=name;
    this.interestRate=interestRate;
    this.ifscCode=ifscCode;
    Bank.branch=ifscCode;
    }
    Bank(String name)
    {
        this("ABCbANK",1);
    }

    Bank(String name,double interestRate)
    {
        this.name=name;
        this.interestRate=interestRate;
    }

    void displayInfo (){
        System.out.println("Name: "+name);
        System.out.println("Interest Rate: "+interestRate);

    }

}
public class BankDemo {


    public static void main(String[] args) {
       // Bank b1 = new Bank("ABC",7.98,"FSD87878");
        Bank b1=new Bank("ABCbANK");
        b1.displayInfo();
       // Bank.branch="TN";
    }

    void m1(){
        m2();
    }
    void m2(){}


}
