package java_term_project;

import java.awt.EventQueue;

public class Main {
	
	
	public Main() {}			// ������
	public static void main(String[] args) {
		
		// ���Ѽ� ����
		int max_value = 5000;
		
		// ���� ��� 3���� �ʱ�ȭ
		Water_class water = new Water_class(3, 450);
		Coffee_class coffee = new Coffee_class(3, 500);
		Ion_Beverage_class ion = new Ion_Beverage_class(3, 550);
		High_Quality_Coffee_class high_coffee = new High_Quality_Coffee_class(3, 700);
		Soda_class soda = new Soda_class(3, 750);
		
		// Money Class �ʿ伺 ??
		
		
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