package java_term_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	// 원래 Main을 삭제해야 함

	/**
	 * Create the frame.
	 */
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 686);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAndroidStudio = new JLabel("\uC790\uD310\uAE30");
		lblAndroidStudio.setForeground(new Color(0, 0, 0));
		lblAndroidStudio.setFont(new Font("순천향체", Font.PLAIN, 60));
		lblAndroidStudio.setBackground(new Color(0, 0, 0));
		lblAndroidStudio.setBounds(355, 10, 186, 137);
		contentPane.add(lblAndroidStudio);
		
		JButton button_5 = new JButton("\uAD00\uB9AC\uC790 \uBA54\uB274");
		button_5.setBounds(768, 10, 117, 48);
		contentPane.add(button_5);
		
		JPanel panel = new JPanel();
		panel.setBounds(611, 476, 223, 64);
		contentPane.add(panel);
		
		JButton button_6 = new JButton("10\uC6D0");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(button_6);
		
		JButton button_7 = new JButton("50\uC6D0");
		panel.add(button_7);
		
		JButton button_8 = new JButton("100\uC6D0");
		panel.add(button_8);
		
		JButton button_10 = new JButton("500\uC6D0");
		panel.add(button_10);
		
		JButton button_9 = new JButton("1000\uC6D0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(button_9);
		
		JLabel label = new JLabel("\uB3C8\uC744 \uD22C\uC785\uD574 \uC8FC\uC138\uC694");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("순천향체", Font.PLAIN, 30));
		label.setBackground(Color.BLACK);
		label.setBounds(591, 422, 294, 64);
		contentPane.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(68, 286, 223, 64);
		contentPane.add(panel_1);
		
		JButton button = new JButton("\uBB3C");
		panel_1.add(button);
		
		JButton button_1 = new JButton("\uCEE4\uD53C");
		panel_1.add(button_1);
		
		JButton button_3 = new JButton("\uACE0\uAE09\uCEE4\uD53C");
		panel_1.add(button_3);
		
		JButton button_2 = new JButton("\uC774\uC628\uC74C\uB8CC");
		panel_1.add(button_2);
		
		JButton button_4 = new JButton("\uD0C4\uC0B0\uC74C\uB8CC");
		panel_1.add(button_4);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
