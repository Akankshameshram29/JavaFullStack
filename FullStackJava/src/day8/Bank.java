package day8;

public class Bank {
  private  int balance;
  
  public void setBalance(int bal) {
	  if(bal > 0) {
		  balance = bal;
	  }else {
		  System.out.println("Invalid");
	  }
	 
  }
  
  public int getBalance() {
	  return balance;
  }
  
  
  
}
