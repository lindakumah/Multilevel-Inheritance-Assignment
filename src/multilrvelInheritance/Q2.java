package multilrvelInheritance;

class Account{
	String customer_name;
	int account_no;
	
	public void display() {
		System.out.println("Customer Name");
        System.out.println("Account Number");
	}
}

class Saving_Account extends Account{
	int min_bal;
	int saving_balance;
	
	public void display() {
		System.out.println("Customer Name");
		System.out.println("Account number");
		System.out.println("Minimum Balance");
		System.out.println("Saving Balance");
	}
}

class Account_Details extends Saving_Account{
	int deposits;
	int withdrawals;
	
	public void display() {
		System.out.println("Customer Name");
		System.out.println("Account Number");
		System.out.println("Minimum balance");
		System.out.println("Saving Balance");
		System.out.println("Deposits");
		System.out.println("Withdrawals");
	}	
}

public class Q2 {

	public static void main(String[] args) {
		Saving_Account lyn = new Account_Details();
		
		System.out.println("The properties of the Account are stated below");
		lyn.display();

	}

}
