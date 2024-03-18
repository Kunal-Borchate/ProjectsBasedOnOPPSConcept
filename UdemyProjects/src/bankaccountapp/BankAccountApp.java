package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		/*
		Checking checking=new Checking("Kunal","786567890",900);
		Savings savings=new Savings("Yash","678986548",800);
		checking.showInfo();
		savings.showInfo();
        */
		
		List<Account>accounts=new LinkedList<Account>();
		
		String file="C:\\Users\\Admin\\Desktop\\JavaProjectsOOP\\NewBankAccounts.csv";
		List<String[]>newAccountHolder=utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			
			String name=accountHolder[0];
			String SSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			
    
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, SSN, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name, SSN, initDeposit));
			}
			else {
				System.out.println("Error Reading Account Type");
			}
		}
		
		for (Account account: accounts) {
			System.out.println("\n***********");
			account.showInfo();
		}
	}

}
	