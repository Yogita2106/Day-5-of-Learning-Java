
public class BankDemo {
   
    private String accountNumber;

    
    private double balance;

    
    public BankDemo(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
       
        balance += amount;
    }

    
    public void withdraw(double amount) {
        
        if (balance >= amount) {
            
            balance -= amount;
        } else {
           
            System.out.println("Insufficient balance");
        }
    }

    
    public double getBalance() {
       
        return balance;
    }
} 
