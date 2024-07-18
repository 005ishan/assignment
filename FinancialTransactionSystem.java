package Assignment;
/*4.	Question Design and implement a Java program that simulates a financial transaction system. 
Your system should be capable of processing different types of transactions, such as deposits and withdrawals, 
and alerting if any transactions exceed certain limits. 
Use interfaces to define common behaviors for transactions and implement these behaviors in different transaction classes.
Create an interface named Transaction with at least two methods:
  getAmount() which returns the amount of the transaction as a double   
  isValid() which returns a boolean indicating if the transaction is valid based on certain criteria.
Implement the Transaction interface in at least three separate classes,
DepositTransaction and WithdrawalTransaction. Each class should have a constructor that sets a limit for transactions and 
specific logic to determine if the transaction is valid.*/


interface Transaction {
    public double getAmount();
    public boolean isValid();
}

class DepositTransaction implements Transaction {
    private double amount;
    private double limit;

    DepositTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;

    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}

class WithdrawalTransaction implements Transaction {
    private double amount;
    private double limit;

    WithdrawalTransaction(double amount, double limit) {
        this.limit = limit;
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }

}

class TransferTransaction implements Transaction {
    private double amount;
    private double limit;

    TransferTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;

    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}

public class FinancialTransactionSystem {
    private double depositLimit;
    private double withdrawalLimit;
    private double transferLimit;
    private double balance;

    FinancialTransactionSystem(double depositLimit, double withdrawalLimit, double transferLimit) {
        this.depositLimit = depositLimit;
        this.withdrawalLimit = withdrawalLimit;
        this.transferLimit = transferLimit;

    }

    public void addTransaction(Transaction transaction) {
        if (transaction.isValid()) {
            System.out.println("Transaction of amount " + transaction.getAmount() + " added.");
        } else if (transaction instanceof WithdrawalTransaction || transaction instanceof TransferTransaction) {
            if (transaction.getAmount() <= balance) {
                balance -= transaction.getAmount();
                System.out.println("Withdrawn/Transferred amount " + transaction.getAmount());
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Can't process. Insufficient balance.");
                System.out.println("Balance: " + balance);
            }
        }
}


    public static void main(String[] args) {

        FinancialTransactionSystem fts = new FinancialTransactionSystem(10000, 10000, 20000);

        Transaction deposit = new DepositTransaction(4500, fts.depositLimit);
        Transaction withdraw = new WithdrawalTransaction(6000, fts.withdrawalLimit);
        Transaction transfer = new TransferTransaction(5000, fts.transferLimit);

        fts.addTransaction(deposit);
        fts.addTransaction(withdraw);
        fts.addTransaction(transfer);

    }
}
