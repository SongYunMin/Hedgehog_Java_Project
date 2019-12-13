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
		Drink_name.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 21));
		Drink_name.setBounds(53, 60, 164, 44);
		Drink_change.add(Drink_name);
		
		JLabel label = new JLabel("\uBCC0\uACBD\uD560 \uC74C\uB8CC \uC774\uB984 : ");
		label.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 21));
		label.setBounds(53, 124, 164, 44);
		Drink_change.add(label);
		
		// ����� �ؽ�Ʈ
		Drink_text = new JTextField();
		Drink_text.setBounds(229, 60, 121, 42);
		Drink_change.add(Drink_text);
		Drink_text.setColumns(10);
		
		// ������ �ؽ�Ʈ
		Change_Text = new JTextField();
		Change_Text.setColumns(10);
		Change_Text.setBounds(229, 126, 121, 42);
		Drink_change.add(Change_Text);
		
		JButton Change_Button = new JButton("\uC74C\uB8CC \uBCC0\uACBD");
		Change_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Drink_text.getText().equals("��") == true) {
					UI.Water.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "�� �� " + Change_Text.getText() + " �� �����Ͽ����ϴ�.");
					dispose();
				}
				else if(Drink_text.getText().equals("Ŀ��") == true) {
					UI.Coffee.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "Ŀ�� �� " + Change_Text.getText() + " �� �����Ͽ����ϴ�.");
				}
				else if(Drink_text.getText().equals("�̿�����") == true) {
					UI.SportDrink.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "�̿����� �� " + Change_Text.getText() + " �� �����Ͽ����ϴ�.");
				}
				else if(Drink_text.getText().equals("���Ŀ��") == true) {
					UI.High_Coffee.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "���Ŀ�� �� " + Change_Text.getText() + " �� �����Ͽ����ϴ�.");
				}
				else if(Drink_text.getText().equals("ź������") == true) {
					UI.Soda.setText(Change_Text.getText());
					JOptionPane.showMessageDialog(Change_Text, "ź������ �� " + Change_Text.getText() + " �� �����Ͽ����ϴ�.");
				}
				else {
					JOptionPane.showMessageDialog(Change_Text, "�ٽ� �Է����ּ���. ��Ȯ�� �Է��ؾ� �մϴ�.\nex)��, ź������ ...");
				}
			}
		});
		Change_Button.setBounds(161, 201, 97, 23);
		Drink_change.add(Change_Button);
	}
}
