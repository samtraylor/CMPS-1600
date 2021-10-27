
/**
 * Used to test various functionalities of bank account and its subclasses
 *
 * @author Sam Traylor
 * @version 1.0
 */
public class BankAccountTest
{
  
    /**
     * Main method: tests withdrawl, deposit, transfer, and interest
     */
    public static void main(String args[]) 
    {
        SavingsAccount Saving = new SavingsAccount("Daquan",0.0,1);
        CheckingAccount Checking = new CheckingAccount("Nakamoto", 500.0);
        
        Saving.deposit(1000.0);
        Checking.withdraw(100.0);
        Saving.transfer(Checking,200.0);
        
        System.out.println(Saving.toString());
        System.out.println(Checking.toString());
        
        Saving.addInterest();
        Checking.deductFees();
        
        System.out.println(Saving.toString());
        System.out.println(Checking.toString());
        
        
    }

    
}
