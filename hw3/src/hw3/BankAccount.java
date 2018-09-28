package hw3;


public class BankAccount implements Comparable<BankAccount> {
    private double balance;

    /**
     * BankAccount constructor
     */
    public BankAccount(double balance){

        this.balance = balance;
    }

    /**
     * returns the balance of the bank account
     * @return balance of the bank account
     */
    public double getBalance(){

        return balance;
    }

    /**
     * compares this account's balance to other account
     */
    @Override
    public int compareTo(final BankAccount otherAccount){
        return Double.compare(this.balance,otherAccount.balance);
    }

}
