package Assignment;
/*2.	Create a BankAccount class to simulate a bank account. 
The class should have the following attributes: account number, account holder name, and balance.
\lnclude methods to deposit(), withdraw(), and checkBalance().
Implement functionality to
-	Create new accounts
-	Deposit money into the account
-	Withdraw money
-	Check the account balance.
*/
public class task2 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(9011, "Ram", 10000);
        ba.checkBalance();
        ba.deposit(100);
        ba.checkBalance();
        ba.withdraw(200);
        ba.checkBalance();
    }
}
class BankAccount{
    public int accountNumber;
    public String accountHolderName;
    public double balance;
    
    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    public void deposit(double amt){
        if(amt>0){
            this.balance+=amt;
            System.out.println("deposited:"+amt);
        }else{
            System.out.println("Invalid amt");
        }
    }
    public void withdraw(double amt){
        if(amt>0 && amt<this.balance){
            this.balance-=amt;
            System.out.println("withdrawn:"+amt);
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void checkBalance(){
        System.out.println("Current balance:"+this.balance);
    }
}