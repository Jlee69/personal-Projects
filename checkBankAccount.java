public class checkBankAccount extends bankAccount {
   //attributes 
   private double overdraft;

   // constructor
   public checkBankAccount (double overdraft, double annual, double balance) {
      super(balance, annual);
      this.overdraft = overdraft;
   }
   
   public void sOverDraft (double overdraft){
      this.overdraft = overdraft;
      }
   
   public double gOverdraft() {
      return overdraft;
      }

   //toString 
   public String toString() {
      return super.toString() + " You overdraft limit $" + overdraft + ".";
     }


  /* @Override
   public void withdraw (double amt) {
      if((gBalance() = amt) >= overdraft)
      super.withdraw(amt);
   }
*/
   
}