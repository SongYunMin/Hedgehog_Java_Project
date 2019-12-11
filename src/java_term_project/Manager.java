package java_term_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Manager extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ID_Text = new JLabel("ID  :");
		ID_Text.setFont(new Font("서울남산체 B", Font.PLAIN, 34));
		ID_Text.setBounds(84, 85, 62, 53);
		contentPane.add(ID_Text);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setFont(new Font("서울남산체 B", Font.PLAIN, 34));
		lblPw.setBounds(77, 168, 83, 53);
		contentPane.add(lblPw);
	}
}
