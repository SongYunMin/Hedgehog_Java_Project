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
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Test extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	// ���� Main�� �����ؾ� ��

	/**
	 * Create the frame.
	 */
	public Test() {
		
		Money_Input money = new Money_Input();
		// ���� ���� �ݾ�
		int GUI_Money = 0;
		money.setMoney(GUI_Money);
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 686);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Main_Text = new JLabel("\uC790\uD310\uAE30");
		Main_Text.setForeground(new Color(0, 0, 0));
		Main_Text.setFont(new Font("��õ��ü", Font.PLAIN, 60));
		Main_Text.setBackground(new Color(0, 0, 0));
		Main_Text.setBounds(355, 10, 186, 137);
		contentPane.add(Main_Text);
		
		JButton Admin_Menu = new JButton("\uAD00\uB9AC\uC790 \uBA54\uB274");
		Admin_Menu.setBackground(new Color(188, 143, 143));
		Admin_Menu.setForeground(new Color(47, 79, 79));
		Admin_Menu.setFont(new Font("�Ƹ���B", Font.BOLD, 14));
		Admin_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ��µǾ����ϴ�.");
				Admin_Menu.setText("gkgkgkgk");
			}
		});
		Admin_Menu.setBounds(27, 20, 117, 48);
		contentPane.add(Admin_Menu);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(612, 481, 223, 64);
		contentPane.add(panel);
		
		
		// ���Աݾ� �˷��ٰ�?
		JLabel Money = new JLabel("");
		Money.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 32));
		Money.setBounds(197, 437, 198, 75);
		Money.setText(String.valueOf(GUI_Money));
		contentPane.add(Money);
		
		// 10��¥�� ��ư
		JButton M10_BT = new JButton("10\uC6D0");
		M10_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M10_BT.setBackground(new Color(211, 211, 211));
		M10_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money.setMoney(GUI_Money+50);
			}
			
		});
		panel.add(M10_BT);
		
		// 50��¥�� ��ư
		JButton M50_BT = new JButton("50\uC6D0");
		M50_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M50_BT.setBackground(new Color(211, 211, 211));
		M50_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(M50_BT);
		
		// 100��¥�� ��ư
		JButton M100_BT = new JButton("100\uC6D0");
		M100_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M100_BT.setBackground(new Color(211, 211, 211));
		M100_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel.add(M100_BT);
		
		// 500��¥�� ��ư
		JButton M500_BT = new JButton("500\uC6D0");
		M500_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M500_BT.setBackground(new Color(211, 211, 211));
		M500_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(M500_BT);
		
		// 1000��¥�� ��ư
		JButton M1000_BT = new JButton("1000\uC6D0");
		M1000_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M1000_BT.setBackground(new Color(211, 211, 211));
		M1000_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(M1000_BT);
		
		JLabel Money_Text = new JLabel("\uB3C8\uC744 \uD22C\uC785\uD574 \uC8FC\uC138\uC694");
		Money_Text.setForeground(Color.BLACK);
		Money_Text.setFont(new Font("��õ��ü", Font.PLAIN, 30));
		Money_Text.setBackground(Color.BLACK);
		Money_Text.setBounds(591, 422, 294, 64);
		contentPane.add(Money_Text);
		
		JButton Water = new JButton("\uBB3C");
		Water.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("�ȳ��ϼ���");
				Admin_Menu.isEnabled();
			}
		});
		Water.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		Water.setForeground(new Color(0, 0, 0));
		Water.setBackground(new Color(255, 228, 225));
		Water.setBounds(104, 269, 81, 48);
		contentPane.add(Water);
		
		
		JButton Coffee = new JButton("\uCEE4\uD53C");
		Coffee.setBackground(new Color(255, 245, 238));
		Coffee.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		Coffee.setBounds(262, 269, 81, 48);
		contentPane.add(Coffee);
		
		
		JButton High_Coffee = new JButton("\uACE0\uAE09\uCEE4\uD53C");
		High_Coffee.setBackground(new Color(240, 255, 255));
		High_Coffee.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		High_Coffee.setBounds(410, 269, 97, 48);
		contentPane.add(High_Coffee);
		
		
		JButton SportDrink = new JButton("\uC774\uC628\uC74C\uB8CC");
		SportDrink.setBackground(new Color(250, 235, 215));
		SportDrink.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		SportDrink.setBounds(571, 269, 97, 48);
		contentPane.add(SportDrink);
		
		
		JButton Soda = new JButton("\uD0C4\uC0B0\uC74C\uB8CC");
		Soda.setBackground(new Color(230, 230, 250));
		Soda.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		Soda.setBounds(724, 269, 97, 48);
		contentPane.add(Soda);
		
		// ���� ��ư
		JButton Exit = new JButton("\uC885\uB8CC");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setForeground(Color.BLACK);
		Exit.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		Exit.setBackground(new Color(255, 228, 225));
		Exit.setBounds(790, 20, 81, 48);
		contentPane.add(Exit);
		
		JLabel Input_Amount = new JLabel("\uD22C\uC785\uAE08\uC561 : ");
		Input_Amount.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 32));
		Input_Amount.setBounds(46, 437, 151, 75);
		contentPane.add(Input_Amount);
		

		
		
		SportDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
