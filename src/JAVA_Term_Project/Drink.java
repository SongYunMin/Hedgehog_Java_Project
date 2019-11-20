package JAVA_Term_Project;

// 음료 클래스
public class Drink {
	public static int number;

	//생성자로 음료의 갯수 초기화 함
	public Drink(int number) {
		this.number = number;
	}
}

class Water_class extends Drink{
	public int water = 450;
	public Water_class(int number, int water) {
		super(number);
		this.water = water;
	}
}

class Coffee_class extends Drink{
	public int coffee = 500;
	public Coffee_class(int number, int coffee) {
		super(number);
		this.coffee = coffee;
	}
}

class  Ion_Beverage_class extends Drink{
	public int ion_beverage = 550;
	public Ion_Beverage_class(int numbe, int ion_beverage) {
		super(number);
		this.ion_beverage = ion_beverage;
	}
}

class High_Quality_Coffee_class extends Drink {
	public int high_quality_coffee;
	public High_Quality_Coffee_class(int number,int High_Coffee) {
		super(number);
		this.high_quality_coffee = High_Coffee;
	}
}

class Soda_class extends Drink {
	public int soda;
	public Soda_class(int number, int soda) {
		super(number);
		this.soda = soda;
		
	}

}

