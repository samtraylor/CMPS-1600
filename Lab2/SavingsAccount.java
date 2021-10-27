
/**
 * SavingsAccount extends the functionality of BankAccount, now including a system for adding
 * interest
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class SavingsAccount extends BankAccount
{
    /**
     * The interest rate used in our calculation
     */
    protected double interest;
    
    /**
     * Constructor for creating savings accounts
     * @Param savname is the name for the savings account
     * @Param Balance is the account balance
     * @Param interestRate is the rate to be used
     */
    public SavingsAccount(String savname, double Balance, double interestRate) 
    {
        super(savname,Balance);
        this.interest = interestRate;
        
    }
  
    /**
     * This method adds interest based on the interest rate previously given during construction
     */
    public void addInterest()
    {
        double totInterest = balance * (interest / 100);
        totInterest *= 100;
        Math.round(totInterest);
        totInterest = totInterest / 100;
        
        deposit(totInterest);
    }
} 