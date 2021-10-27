
/**
 * CheckingAccount 
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class CheckingAccount extends BankAccount
{

    /**
     * Amount of transactions that have taken place (deposits/withdrawls)
     */
    protected int transactionCount = 0;
    /**
     * Static final variable that can be referenced anywhere as the set per-transaction fee
     */
    static final double TRANSACTION_FEE = 3.0;
    
    /**
     * Constructor for objects of class CheckingAccount
     * @Param chkname is the name on the checking account
     * @Param Balance is the balance of the checking account
     */
    public CheckingAccount(String chkname, double Balance)
    {
        super(chkname, Balance);
        name = chkname;
        balance = Balance;
        
    }
    
    /**
     * Overriden form of Deposit method, now any deposit counts towards the transaction count
     */
    @Override
    public void deposit(double depAmt) 
    {
        super.deposit(depAmt);
        transactionCount++;
    }
    
    /**
     * Overriden form of Withdrawl method, now any deposit counts towards the transaction count
     */
    @Override
    public void withdraw(double wdAmt) 
    {
        super.withdraw(wdAmt);
        transactionCount++;
    }
    
    /**
     * Deducts fees based off of number of transactions
     */
    public void deductFees() 
    {
        this.withdraw(transactionCount * TRANSACTION_FEE);
        transactionCount = 0;
    }
}
