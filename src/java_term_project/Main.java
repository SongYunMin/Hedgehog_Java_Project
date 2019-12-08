package java_term_project;
import java.awt.EventQueue;

public class Main {
	public Main() {}			// »ý¼ºÀÚ
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}