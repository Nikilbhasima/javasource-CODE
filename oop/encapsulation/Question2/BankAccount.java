package oop.encapsulation.Question2;
//Design a class "BankAccount" that holds a balance (double).
// Implement public methods to deposit and withdraw money, ensuring that the balance is never negative.
public class BankAccount {
    private double balance;

    public void setdeposit(double initializedAmount){
        if (initializedAmount<0){
            System.out.println("the initial amount cannot be in negative");
            System.exit(0);
        }
        this.balance+=initializedAmount;
    }
    public double getdeposite(){
        return this.balance;
    }

    public void setwithdraw(double amount){
        if (amount<0){
            System.out.println("withdraw amount cannot be in negative");
            System.exit(0);
        }
      this.balance-=amount;
    }

    public double getwithdraw(){
        return this.balance;
    }


}
