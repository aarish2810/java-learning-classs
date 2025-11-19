package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMMachine {

        public static void main(String[] args) {
            System.out.println("==============================");
            System.out.println("Welcome to Vaibhav ATM machine");
            System.out.println("==============================");
            Scanner scan = new Scanner(System.in);
            List<String> accountStatement = new ArrayList<>();
            int accountBalance = 0;
            while(true){
                showOptions();
                System.out.print("Enter your selection : ");
                int selection = scan.nextInt();
                boolean shouldWeExit = false;
                switch (selection){
                    case 1:
                        System.out.print("Enter your amount to deposit:");
                        int amount = scan.nextInt();
                        accountBalance = accountBalance  + amount;
                        accountStatement.add("Deposit - "+amount + " , Balance "+accountBalance);

                        System.out.println("Amount Deposited Successfully");
                        break;
                    case 2:
                        System.out.print("Enter your amount to withdraw:");
                        int withdraw_amount = scan.nextInt();
                        if(withdraw_amount > accountBalance){
                            System.out.println("Insuffient balance");
                        }else{
                            accountBalance = accountBalance - withdraw_amount;
                            accountStatement.add("Withdraw - "+withdraw_amount + " , Balance "+accountBalance);
                            System.out.println("Amount withdraw Successfully");
                        }
                        break;
                    case 3:
                        System.out.println("Your Current balance : " +accountBalance);
                        break;
                    case 4:
                        int i = 1;
                        for(String statement: accountStatement){
                            System.out.println(i + " -> " + statement);
                            i++;
                        }
                        break;
                    case 5:
                        shouldWeExit = true;
                        break;
                    default:
                        System.out.println("INVALID INPUT. Please Try Again!");
                }

                if(shouldWeExit){
                    break;
                }
            }
            System.out.println("Thank you for using Vaibhav ATM.");
        }
        public static void showOptions(){
            System.out.println("----------------------------");
            System.out.println("Press 1 - for deposit money");
            System.out.println("Press 2 - for withdraw money");
            System.out.println("Press 3 - to check Balance");
            System.out.println("Press 4 - view Statement");
            System.out.println("Press 5 - Exit");
        }
}
