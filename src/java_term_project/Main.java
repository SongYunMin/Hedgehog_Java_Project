package java_term_project;

import java.awt.EventQueue;

public class Main {
	
	
	public Main() {}			// 생성자
	public static void main(String[] args) {
		
		// 상한선 변수
		int max_value = 5000;
		
		// 음료 재고 3개로 초기화
		Water_class water = new Water_class(3, 450);
		Coffee_class coffee = new Coffee_class(3, 500);
		Ion_Beverage_class ion = new Ion_Beverage_class(3, 550);
		High_Quality_Coffee_class high_coffee = new High_Quality_Coffee_class(3, 700);
		Soda_class soda = new Soda_class(3, 750);
		
		// Money Class 필요성 ??
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}