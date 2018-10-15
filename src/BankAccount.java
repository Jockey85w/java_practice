
public class BankAccount {

	private int accountID;

	//declared to int, just to keep it simple for now.
	private int balance;
	
	private int prevTransaction;
	private String ownerName;
	
	//constructor for class
	public BankAccount(int accountID, String ownerName, int balance){
		this.accountID=accountID;
		this.ownerName=ownerName;
		this.balance=balance;
	} //end constructor section
	
	public void deposit(int amount){
		if (amount > 0)  {
			balance = balance + amount;
			prevTransaction = amount;
		}//end if
				
	}//end deposit section
	
	public void withdraw(int amount){
		
		if (amount>0 && amount<= balance){ 
		
			balance=balance-amount;
			prevTransaction= -amount;
		} else System.out.println("It is not possible to withdraw 0 from account or there is not enough credit on your balance.");
			
	}//end withdraw section
	
	//for curiosity used this function to query last transaction (deposit/withdrawal)
	public int getPrevTransact(){
		
		if (prevTransaction>0) {
			 System.out.println("Previous Transaction was a deposit of: "+prevTransaction);
		return prevTransaction;	 		
		} 
		else if (prevTransaction<0){
			System.out.println("Previous Transaction was a withdrawal of: "+ Math.abs(prevTransaction));
			return Math.abs(prevTransaction);
		}
		else System.out.println("No previous transaction occured\n");
		return 0;
		
	}
	
	// returns balance of the user
	public int getBalance(){
		return this.balance;
	}
	
	//returns the accountID
	public int getAccId(){
		return this.accountID;
	}
	
	//Returns the username
	public String getUserName(){
		return this.ownerName;
	}
	
	
	//Modifying/setting balance it would be used during transactions
	public void modBalance(int amount){
		this.balance=this.balance+amount;
	}
	

}



