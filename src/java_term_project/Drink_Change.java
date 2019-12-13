package java_term_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Drink_Change extends JFrame {

	private JPanel Drink_change;
	private JTextField Drink_text;
	private JTextField Change_Text;

	/**
	 * Create the frame.
	 */
	public Drink_Change() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Drink_change = new JPanel();
		Drink_change.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Drink_change);
		Drink_change.setLayout(null);
		
		JLabel Drink_name = new JLabel("\uBCC0\uACBD\uB420 \uC74C\uB8CC \uC774\uB984 : ");
		Drink_name.setFont(new Font("서울남산체 B", Font.PLAIN, 21));
		Drink_name.setBounds(53, 60, 164, 44);
		Drink_change.add(Drink_name);
		
		JLabel label = new JLabel("\uBCC0\uACBD\uD560 \uC74C\uB8CC \uC774\uB984 : ");
		label.setFont(new Font("서울남산체 B", Font.PLAIN, 21));
		label.setBounds(53, 124, 164, 44);
		Drink_change.add(label);
		
		// 변경될 텍스트
		Drink_text = new JTextField();
		Drink_text.setBounds(229, 60, 121, 42);
		Drink_change.add(Drink_text);
		Drink_text.setColumns(10);
		
		// 변경할 텍스트
		Change_Text = new JTextField();
		Change_Text.setColumns(10);
		Change_Text.setBounds(229, 126, 121, 42);
		Drink_change.add(Change_Text);
		
		JButton Change_Button = new JButton("\uC74C\uB8CC \uBCC0\uACBD");
		Change_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Drink_text.getText().equals("물") == true) {
					UI.Water.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "물 을 " + Change_Text.getText() + " 로 변경하였습니다.");
					dispose();
				}
				else if(Drink_text.getText().equals("커피") == true) {
					UI.Coffee.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "커피 를 " + Change_Text.getText() + " 로 변경하였습니다.");
				}
				else if(Drink_text.getText().equals("이온음료") == true) {
					UI.SportDrink.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "이온음료 를 " + Change_Text.getText() + " 로 변경하였습니다.");
				}
				else if(Drink_text.getText().equals("고급커피") == true) {
					UI.High_Coffee.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "고급커피 를 " + Change_Text.getText() + " 로 변경하였습니다.");
				}
				else if(Drink_text.getText().equals("탄산음료") == true) {
					UI.Soda.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "탄산음료 를 " + Change_Text.getText() + " 로 변경하였습니다.");
				}
				else {
					JOptionPane.showMessageDialog(Change_Text, "다시 입력해주세요. 정확히 입력해야 합니다.\nex)물, 탄산음료 ...");
				}
			}
		});
		Change_Button.setBounds(161, 201, 97, 23);
		Drink_change.add(Change_Button);
	}
}
