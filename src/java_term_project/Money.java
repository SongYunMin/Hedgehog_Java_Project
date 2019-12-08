package java_term_project;

// Money Class
public class Money {
		protected int count;
		public Money(int count){this.count = count;}
		public int getCount() {return count;}
}

// 10��
class Money10 extends Money{
	private int money_10;

	public Money10(int money_10, int count) {
		super(count);
		this.money_10 = money_10;
	}
	// Getter Setter
	public int getMoney_10() {
		return money_10;
	}
	public void setMoney_10(int money_10, int How) {
		this.money_10 = money_10 + How;
	}

	// count �ϳ��� ����
	public void delete(){ count--; }
}


// 50��
class Money50 extends Money{
	private int money_50;

	public Money50(int money_50, int count) {
		super(count);
		this.money_50 = money_50;
	}
	// Getter Setter
	public int getMoney_50() {
		return money_50;
	}
	public void setMoney_50(int money_50, int How) {
		this.money_50 = money_50 + How;
	}

	// count �ϳ��� ����
	public void delete(){ count--; }
}

// 100��
class Money100 extends Money{
	private int money_100;
	
	public Money100(int money_100, int count) {
		super(count);
		this.money_100 = money_100;
	}
	// Getter Setter
	public int getMoney_100() {
		return money_100;
	}
	public void setMoney_100(int money_100) {
		this.money_100 = money_100;
	}

	// count �ϳ��� ����
	public void delete(){	count--; }
}

// 500��
class Money500 extends Money{
	private int money_500;

	public Money500(int money_500, int count) {
		super(count);
		this.money_500 = money_500;
	}
	// Getter Setter
	public int getMoney_500() {
		return money_500;
	}
	public void setMoney_500(int money_500) {
		this.money_500 = money_500;
	}
	
	// count �ϳ��� ����
	public void delete(){ count--; }
}

// 1000��
class Money1000 extends Money{
	private int money_1000;

	public Money1000(int money_1000, int count) {
		super(count);
		this.money_1000 = money_1000;
	}
	// Getter Setter
	public int getMoney_1000() {
		return money_1000;
	}
	public void setMoney_1000(int money_1000) {
		this.money_1000 = money_1000;
	}
	
	public void delete(){ count--; }
}