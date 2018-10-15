import java.util.*;

public class Transactions {

	private int trID;
	private Date trDate;
	private int trAmount;
	private int fromAccount;
	private int toAccount;
	
		
	
	public Transactions(int trID, int fromA, int toA, int amount){
		this.trID=trID;
		this.fromAccount=fromA;
		this.toAccount=toA;
		this.trAmount=amount;
		
	}
	//constructor Overloading
	public Transactions(int trID, Date date, int fromA, int toA, int amount){
		
		this.trID=trID;
		this.trDate=date;
		this.fromAccount=fromA;
		this.toAccount=toA;
		this.trAmount=amount;
		
	}
	
	//ToBeDone
	public void TransactionList(int trID){
			
		}
		
		
	} 
	

