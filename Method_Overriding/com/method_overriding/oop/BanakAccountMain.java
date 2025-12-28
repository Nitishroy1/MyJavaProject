package com.method_overriding.oop;

 class BankAccount {
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE="IOBA0005623";
	
	public BankAccount(String accontHolderName,String accountNumber,double balance) {
		super();
		if(accontHolderName.isBlank()) {
			System.out.println("Account holder name cannot be empty.");
			System.exit(0);
		}
		if(accountNumber.isBlank()) {
			System.out.println("Account Number cannot be empty.");
			System.exit(0);
		}
		if(balance<0) {
			System.out.println("Balance canot be negative.");
		}
	 this.accountHolderName=accontHolderName;
	 this.accountNumber=accountNumber;
	 this.balance=balance;
	}
	public void calculateInterest() {
		IO.println("Iinterest is calculating.");
	}
	
	public void displayAccountDetails() {
		IO.println("Account Holder: "+this.accountHolderName);
		IO.println("Account Number: "+this.accountNumber);
		IO.println("Balance RS: "+this.balance);
		IO.println("IFSC CODE: "+BankAccount.IFSC_CODE);
		
	}
	}
	
	class SavingsAccount extends BankAccount{
		protected double interestRate=4.0;

		public SavingsAccount(String accontHolderName, String accountNumber, double balance) {
			super(accontHolderName, accountNumber, balance);
			
		}
		@Override
		public void calculateInterest() {
			double simpalInterest=this.balance+ (this.balance*4.0/100);
			IO.println("Savings Account Interest RS: "+simpalInterest);
		}
		
	}
	
	class CurrentAccount extends BankAccount{
		protected double overdraftLimit =5000.0;

		public CurrentAccount(String accontHolderName, String accountNumber, double balance) {
			super(accontHolderName, accountNumber, balance);
			
		}
		
		@Override
		public void calculateInterest() {
			IO.println("Current Accounts do not earn interest.");
		}
		
		public void checkOverdraftLimit() {
			IO.println("Overdraft limit RS: "+this.overdraftLimit);
		}
	}
	
	class FixedDepositAccount extends BankAccount{
		protected double interestRate = 6.5;
		protected int depositeTerm;
		public FixedDepositAccount(String accontHolderName, String accountNumber, double balance,
				int depositeTerm) {
			super(accontHolderName, accountNumber, balance);
			if(depositeTerm<=0) {
				IO.println("depositeTerm can't be negative");
				System.exit(0);
			}
			
			this.depositeTerm = depositeTerm;
		}
		@Override
		public void calculateInterest() {
			double simpalInterest=this.balance * this.interestRate * this.depositeTerm;
			IO.println("Fixed Deposit Interest for "+this.depositeTerm+" years RS :"+simpalInterest);
		}
		
	}
	
public class BanakAccountMain {
	public static void main(String[] args) {
		IO.println("Please select the Account Type : ");
		IO.println("\t1) Saving Account");
		IO.println("\t2) Current Account");
		IO.println("\t3) Fixed Deposit Account");
		IO.println("Please enter the type os account you want to open:[1/2/3]:");
		int choice=Integer.parseInt(IO.readln());
		IO.print("Enter acount HolderName: ");
		String accountHolderName=IO.readln();
		IO.print("Enter Account Number: ");
		String accountNumber=IO.readln();
		IO.print("Enter Account Balance: ");
		double balance=Double.parseDouble(IO.readln());
		switch(choice) {
		case 1 ->
		{
			
			BankAccount accountType=new SavingsAccount(accountHolderName, accountNumber, balance);
			accountType.displayAccountDetails();
			accountType.calculateInterest();
		}
		case 2 ->
		  {
			BankAccount accountTyAccount=new CurrentAccount(accountHolderName, accountNumber, balance);
			if(accountTyAccount instanceof CurrentAccount currentAccount) {
				currentAccount.displayAccountDetails();
				currentAccount.calculateInterest();
				currentAccount.checkOverdraftLimit();
				
			}
			}
			case 3 ->{
				int depositTurm=Integer.parseInt(IO.readln());
				BankAccount accountType=new FixedDepositAccount(accountHolderName, accountNumber, balance, depositTurm);
				accountType.displayAccountDetails();
				accountType.calculateInterest();
			}
			
			
		}
		}
	}


