
/**
 * Class representing A bank account and offering basic banking operations 
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class BankAccount
{
    /**
     * Name of account holder
     */
    protected String name;
    /**
     * Balance of account
     */
    protected double balance;

    /**
     * Constructor for bank account object. Has 2 variables, name and balance.
     * @Param accName is the name registered with the account
     * @Param accBal is balance of the account
     */
    public BankAccount(String accName, double accBal)
    {
        this.name = accName;
        this.balance = accBal;
    }
    
   
    /**
     * Returns the name associated with a bank account
     * @return name of account holder
     */
    public String getName() 
    {
        return name;
    }
    
    /**
     * Returns the balance of given bank account
     * @return a double that represents amount of moeny in the account
     */
    public double getBalance() 
    {
        return balance;
    }
    
    /**
     * Deposits the specified sum into the bank account
     * @Param depAmt amount to deposit, given as a double 
     */
    public void deposit(double depAmt) 
    {
        balance += depAmt;
    }
    
    /**
     * Withdraws the specified sum into the bank account
     * @Param wdAmt amount to withdraw, given as a double 
     */
    public void withdraw(double wdAmt) 
    {
        balance -= wdAmt;
    }
    
    /**
     * Transfers money from one BankAccount to another
     * @Param transfSum is the amount of money, as a double, to be transfered 
     * @Param transfAct is the BankAccount object the money's transferring to, 
     */
    public void transfer(BankAccount transfAct,double transfSum ) 
    {
        this.withdraw(transfSum);
        transfAct.deposit(transfSum);
    }
    
    /**
     * Overrides toString method to return the name and balance of an account
     * @Return a string containing the above-mentioned details is returned
     */
    @Override
    public String toString()
    {
        String concat = "This account has the name " + this.getName() + " and a balance of " 
                                        + getBalance() + ".";
        return concat;                 
    }
    
    
}

