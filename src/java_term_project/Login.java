package java_term_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	private JPanel Login_Layout;
	public JTextField ID_textField;
	public JPasswordField PW_textField;
	public ID_PassWord ID_PW = new ID_PassWord();
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Login_Layout = new JPanel();
		Login_Layout.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Login_Layout);
		Login_Layout.setLayout(null);
		
		ID_textField = new JTextField();
		ID_textField.setFont(new Font("서울남산체 L", Font.PLAIN, 12));
		ID_textField.setBounds(180, 74, 139, 41);
		ID_textField.setForeground(Color.GRAY);
		Login_Layout.add(ID_textField);
		ID_textField.setColumns(10);

		
		JLabel ID_Label = new JLabel("ID :");
		ID_Label.setFont(new Font("서울남산체 EB", Font.PLAIN, 36));
		ID_Label.setBounds(111, 67, 57, 48);
		Login_Layout.add(ID_Label);
		
		JLabel PW_Label = new JLabel("PW :");
		PW_Label.setFont(new Font("서울남산체 EB", Font.PLAIN, 36));
		PW_Label.setBounds(94, 125, 74, 48);
		Login_Layout.add(PW_Label);
		
		PW_textField = new JPasswordField();
		PW_textField.setBounds(180, 129, 139, 41);
		Login_Layout.add(PW_textField);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setFont(new Font("서울남산체 B", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String ID_Data = ID_textField.getText();
				String PW_Data = PW_textField.getText();
				ID_PW.setID(ID_Data);
				ID_PW.setPW(PW_Data);
				// ID,  PW 검사
				if(ID_PW.getID().equals(ID_PW.getID_Start()) == true && ID_PW.getPW().equals(ID_PW.getPW_Start()) == true) {
				JOptionPane.showMessageDialog(Login_Layout, "로그인 되었습니다.\n관리자 메뉴로 이동합니다.");
				Manager manager = new Manager();
				manager.setVisible(true);
				dispose();
				}
				else {
					JOptionPane.showMessageDialog(Login_Layout, "아이디 혹은 패스워드가 다릅니다.");
				}

			}
		});
		btnNewButton.setBounds(157, 200, 97, 34);
		Login_Layout.add(btnNewButton);
		
		JLabel Login_Label = new JLabel("\uAD00\uB9AC\uC790\uBA54\uB274 \uB85C\uADF8\uC778");
		Login_Label.setFont(new Font("서울남산체 EB", Font.PLAIN, 28));
		Login_Label.setBounds(106, 10, 220, 34);
		Login_Layout.add(Login_Label);
	}
}
