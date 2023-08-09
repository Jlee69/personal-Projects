public class bankAccount {

   //attributes
   private double balance;
   private double annualRate;
   
   //constructor
   public bankAccount(double balance, double annualRate){
    this.balance = balance;
    // this.annualRate = annualRate;
    sAnnualInterestRate(annualRate);
    }
   
   // getters
    public double gBalance(){
      return balance;
    }
    
    public double gAnnualInterestRate(){
      return annualRate;
    }
   
   //setters
   public void sAnnualInterestRate(double annualRate){
      this.annualRate = annualRate;
    }
    
    public void deposit(double amount){
      balance += amount;
   }

    public void withdraw(double amount){
       this.balance -= amount;
   }

   public double gMonthlyInterestRate(){
      return annualRate/12;
   }

    public double gMonthlyInterest(){
      return balance * gMonthlyInterestRate();
   }
 
   public String toString(){
      return "This account contains $" + balance + ". You have earned $" + gMonthlyInterest() + 
      "in the last month";
   }
 // Add an equals method to your Account class.
 // Two Account objects are equal if their balance and annualInterestRates are equal.
   public boolean equals(bankAccount that){
      return this.balance == that.balance && this.annualRate == that.annualRate;
   }

    
}