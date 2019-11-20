package java_term_project;

public class Money {
		private int count;
		
		public Money(int count)
		{
			this.count = count;
		}
}

class Money10 extends Money{
	public int money_10;
	public Money10(int money_10, int count) {
		super(count);
		this.money_10 = money_10;
	}
}

class Money50 extends Money{
	public int money_50;
	public Money50(int money_50, int count) {
		super(count);
		this.money_50 = money_50;
	}
}

class Money100 extends Money{
	public int money_100;
	public Money100(int money_100, int count) {
		super(count);
		this.money_100 = money_100;
	}
}

class Money500 extends Money{
	public int money_500;
	public Money500(int money_500, int count) {
		super(count);
		this.money_500 = money_500;
	}
}

class Money1000 extends Money{
	public int money_1000;
	public Money1000(int money_1000, int count) {
		super(count);
		this.money_1000 = money_1000;
	}
}