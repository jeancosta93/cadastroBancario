package UserBank;

public class AccBank {

	private int number;
	private String holder;
	private double balance;
	
	public AccBank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	

	public AccBank(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	
	

	public String getHolder() {
		return holder;
	}



	public void setHolder(String holder) {
		this.holder = holder;
	}



	public int getNumber() {
		return number;
	}



	public double getBalance() {
		return balance;
	}



	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}

	
	
	public String toString() {
		return 
		 "Acount " 
		+ getNumber()
		+ ", Holder: "
		+ getHolder()
		+", "
		+ "Balance: $"
		+ String.format("%.2f", balance);
	
 }
}