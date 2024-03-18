package bankaccountapp;

public class Checking extends Account{
	
	private int debitCardNumber;
	private int debitCardPIN;

	public Checking(String name,String SSN,double initDeposit) {
		super(name,SSN,initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
	}
	
	public void setRate() {
		rate=getBaseRate()*.15;
	}
	
	private void setDebitCard() {
		debitCardNumber=(int) (Math.random()*Math.pow(10,12));
		debitCardPIN=(int) (Math.random()*Math.pow(10,4));
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features:"+
				"\n Debit Card Number:"+debitCardNumber+
				"\n Debit Card Pin:"+debitCardPIN);
	}

}
