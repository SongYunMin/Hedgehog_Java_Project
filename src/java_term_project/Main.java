package java_term_project;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		
		int money = 0;
		
		// ���Ѽ� ����
		int max_value = 5000;
		
		// ���� ��� 3���� �ʱ�ȭ
		Water_class water = new Water_class(3, 450);
		Coffee_class coffee = new Coffee_class(3, 500);
		Ion_Beverage_class ion = new Ion_Beverage_class(3, 550);
		High_Quality_Coffee_class high_coffee = new High_Quality_Coffee_class(3, 700);
		Soda_class soda = new Soda_class(3, 750);
		
		// Money Class �ʿ伺 ??
		
		// Money �ʱ�ȭ
		Money10 money10 = new Money10(10,5);
		Money50 money50 = new Money50(50,5);
		Money100 money100 = new Money100(100,5);
		Money500 money500 = new Money500(500,5);
		Money1000 money1000 = new Money1000(1000,5);
		
		
		
		// ��
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}