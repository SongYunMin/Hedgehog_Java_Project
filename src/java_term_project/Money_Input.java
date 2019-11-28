package java_term_project;

public class Money_Input {
	private int Money;
	private int Total_Money;
	
	public Money_Input(int Money) {
		this.Money = Money;
	}

	public int getMoney() {
		return Money;
	}

	public void setMoney(int money, int plus) {
		Money = money + plus;
	}
}
