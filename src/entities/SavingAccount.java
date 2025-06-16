package entities;

public class SavingAccount  extends Account{
	
	private Double interesteRate;
	
	public SavingAccount() {
		super();
	}



	public SavingAccount(Integer number, String holder, Double balance, Double interesteRate) {
		super(number, holder, balance);
		this.interesteRate = interesteRate;
	}



	public Double getInteresteRate() {
		return interesteRate;
	}

	public void setInteresteRate(Double interesteRate) {
		this.interesteRate = interesteRate;
	}
	
	
	public void updateBalance() {
		balance += balance * interesteRate;
		
	}
	@Override
	public void withdraw(double amount) {//saque de dinheiro sem taxa
		balance -= amount;
	}
	

}
