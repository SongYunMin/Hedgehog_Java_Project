package JAVA_Term_Project;

public class Main_Class {
	public static void main(String[] args) {
		// 재고 3개로 초기화
		Water_class water = new Water_class(3, 450);
		Coffee_class coffee = new Coffee_class(3, 500);
		Ion_Beverage_class ion = new Ion_Beverage_class(3, 550);
		High_Quality_Coffee_class high_coffee = new High_Quality_Coffee_class(3, 700);
		Soda_class soda = new Soda_class(3, 750);

	}

}