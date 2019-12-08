package java_term_project;

import java.awt.EventQueue;

public class Main {
	
	
	public Main() {}			// 생성자
	public static void main(String[] args) {
		
		// 상한선 변수
		int max_value = 5000;
		
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