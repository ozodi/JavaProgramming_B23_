package day38_CostumeClass;

public class BankAccount {


    public String accountHolder;
    public long accountNumber;
    public double balance;
    public void setInfo(String accountHolder, long accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Depositing amount can not be negative or zero");
            return;
        }

        System.out.println("Depositing "+amount+" to the account "+ accountNumber);
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance <= 0){
            System.out.println("Insufficient  balance");
            return;
        }
        if(amount > balance){
            balance -= 35;
        }
        System.out.println("Withdrawing $"+amount+"");
    }


}
