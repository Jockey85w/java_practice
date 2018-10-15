import java.util.*;



public class BankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // creating test users
		 BankAccount user1 = new BankAccount(00001, "Kiss János", 100000);
		 BankAccount user2 = new BankAccount(00002, "Nagy Tamás", 250000);
		 BankAccount user3 = new BankAccount(00003, "Szupergazdag Béla", 1000000000);
		 BankAccount user4 = new BankAccount(00004, "Richie Rich", 200000000);
		 
		 //Date
		 Date c1 = new Date(2018, 10, 15); 
		 
		 Transactions tr1 = new Transactions(001, c1, 00001, 00002, 5000);
		 
		 System.out.println(user4.getUserName()+user4.getPrevTransact());
		 
		 user4.withdraw(50000);
		 System.out.println(user4.getUserName()+" "+user4.getPrevTransact());
		 
		 System.out.println(user4.getUserName()+" has "+user4.getBalance()+" amount on the account");
	}



}
