package java_term_project;

// ���� Ŭ����
public class Drink {
	private int number;

	//�����ڷ� ������ ���� �ʱ�ȭ ��
	public Drink(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void MinusNumber(int number, int minus) {
		this.number = number - minus;
	}
	
}

// ��
class Water_class extends Drink{
	public int water = 450;
	public Water_class(int number, int water) {
		super(number);
		this.water = water;
	}
	
}

// Ŀ��
class Coffee_class extends Drink{
	public int coffee = 500;
	public Coffee_class(int number, int coffee) {
		super(number);
		this.coffee = coffee;
	}
}

//���Ŀ��
class High_Quality_Coffee_class extends Drink {
	public int high_quality_coffee;
	public High_Quality_Coffee_class(int number,int High_Coffee) {
		super(number);
		this.high_quality_coffee = High_Coffee;
	}
}


// �̿�����
class  Ion_Beverage_class extends Drink{
	public int ion_beverage = 550;
	public Ion_Beverage_class(int number, int ion_beverage) {
		super(number);
		this.ion_beverage = ion_beverage;
	}
}



// ź������
class Soda_class extends Drink {
	public int soda;
	public Soda_class(int number, int soda) {
		super(number);
		this.soda = soda;
	}

}

