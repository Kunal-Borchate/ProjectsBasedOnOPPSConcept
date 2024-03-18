package bankaccountapp;

public abstract class Account implements IBaseRate{

	private String name;
	private String SSN;
	private double balance;
	private static int index=10000;
	protected String accountNumber;
	protected double rate;
	
	public Account(String name,String SSN,double intitDeposit) {
		this.name=name;
		this.SSN=SSN;
		balance=intitDeposit;
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
		
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN=SSN.substring(SSN.length()-2, SSN.length());
		int uniqueID=index;
		int randomNumber=(int)(Math.random()*Math.pow(10,3));
		return lastTwoOfSSN+uniqueID+randomNumber;
		
	}
	
	public void compound() {
		double accruedInterest=balance*(rate/100);
		balance+=accruedInterest;
		System.out.println("Accrued Interest: $"+accruedInterest);
	}
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	}
	
	public void transfer(String toWhere,double amount) {
		 balance-=amount;
		 System.out.println("Transfering $"+amount+" to "+toWhere);
		 printBalance();
	}
	
	public void printBalance() {
		System.out.println("Available Balance $"+balance);
	}
	
	public void showInfo() {
		System.out.println(
				"Name:"+name+
				"\nAccount Number:"+accountNumber+
				"\nBalance:"+balance+
				"\nRate:"+rate+"%"
				);
	}
}
