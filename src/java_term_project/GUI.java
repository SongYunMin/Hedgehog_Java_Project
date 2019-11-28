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

public class GUI extends JFrame {

	private JPanel Money_text;
	private JTextField InputMoney;

	/**
	 * Launch the application.
	 */

	// 원래 Main을 삭제해야 함

	/**
	 * Create the frame.
	 */
	public GUI() {

		// Money 초기화
		Money10 money10 = new Money10(10, 5);
		Money50 money50 = new Money50(50, 5);
		Money100 money100 = new Money100(100, 5);
		Money500 money500 = new Money500(500, 5);
		Money1000 money1000 = new Money1000(1000, 5);

		// 현재 총액을 알려줄 class
		Money_Input money = new Money_Input(0);
		money.setMoney(0, 0);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 686);
		Money_text = new JPanel();
		Money_text.setBackground(new Color(248, 248, 255));
		Money_text.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Money_text);
		Money_text.setLayout(null);

		JLabel Main_Text = new JLabel("\uC790\uD310\uAE30");
		Main_Text.setForeground(new Color(0, 0, 0));
		Main_Text.setFont(new Font("순천향체", Font.PLAIN, 60));
		Main_Text.setBackground(new Color(0, 0, 0));
		Main_Text.setBounds(355, 10, 186, 137);
		Money_text.add(Main_Text);

		// 관리자 메뉴 버튼
		JButton Admin_Menu = new JButton("\uAD00\uB9AC\uC790 \uBA54\uB274");
		Admin_Menu.setBackground(new Color(188, 143, 143));
		Admin_Menu.setForeground(new Color(47, 79, 79));
		Admin_Menu.setFont(new Font("아리따B", Font.BOLD, 14));
		Admin_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 출력되었습니다.");
				Admin_Menu.setText("gkgkgkgk");
			}
		});
		Admin_Menu.setBounds(27, 20, 117, 48);
		Money_text.add(Admin_Menu);

		JPanel panel = new JPanel();
		panel.setBounds(612, 481, 223, 64);
		Money_text.add(panel);

		// 투입금액 확인
		InputMoney = new JTextField();
		InputMoney.setFont(new Font("서울남산체 B", Font.PLAIN, 32));
		InputMoney.setText(String.valueOf(money.getMoney()) + " 원");
		InputMoney.setBounds(191, 437, 178, 75);
		Money_text.add(InputMoney);
		InputMoney.setColumns(10);

		// 10원짜리 버튼
		JButton M10_BT = new JButton("10\uC6D0");
		M10_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M10_BT.setBackground(new Color(211, 211, 211));
		M10_BT.addActionListener(new ActionListener() {
			// 10원 버튼을 누르면 현재금액 증가
			public void actionPerformed(ActionEvent e) {
				money.setMoney(money.getMoney(), money10.getMoney_10());
				InputMoney.setText(String.valueOf(money.getMoney()) + " 원");
			}
		});
		panel.add(M10_BT);

		// 50원짜리 버튼
		JButton M50_BT = new JButton("50\uC6D0");
		M50_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M50_BT.setBackground(new Color(211, 211, 211));
		M50_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money.setMoney(money.getMoney(), money50.getMoney_50());
				InputMoney.setText(String.valueOf(money.getMoney()) + " 원");
			}
		});
		panel.add(M50_BT);

		// 100원짜리 버튼
		JButton M100_BT = new JButton("100\uC6D0");
		M100_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M100_BT.setBackground(new Color(211, 211, 211));
		M100_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money.setMoney(money.getMoney(), money100.getMoney_100());
				InputMoney.setText(String.valueOf(money.getMoney()) + "원");
			}
		});
		panel.add(M100_BT);

		// 500원짜리 버튼
		JButton M500_BT = new JButton("500\uC6D0");
		M500_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M500_BT.setBackground(new Color(211, 211, 211));
		M500_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money.setMoney(money.getMoney(), money500.getMoney_500());
				InputMoney.setText(String.valueOf(money.getMoney()) + "원");
			}
		});
		panel.add(M500_BT);

		// 1000원짜리 버튼
		JButton M1000_BT = new JButton("1000\uC6D0");
		M1000_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M1000_BT.setBackground(new Color(211, 211, 211));
		M1000_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money.setMoney(money.getMoney(), money1000.getMoney_1000());
				InputMoney.setText(String.valueOf(money.getMoney()) + "원");
			}
		});
		panel.add(M1000_BT);

		JButton Water = new JButton("\uBB3C");
		Water.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("안녕하세요");
				Admin_Menu.isEnabled();
			}
		});
		Water.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		Water.setForeground(new Color(0, 0, 0));
		Water.setBackground(new Color(255, 228, 225));
		Water.setBounds(104, 269, 81, 48);
		Money_text.add(Water);

		JButton Coffee = new JButton("\uCEE4\uD53C");
		Coffee.setBackground(new Color(255, 245, 238));
		Coffee.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		Coffee.setBounds(262, 269, 81, 48);
		Money_text.add(Coffee);

		JButton High_Coffee = new JButton("\uACE0\uAE09\uCEE4\uD53C");
		High_Coffee.setBackground(new Color(240, 255, 255));
		High_Coffee.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		High_Coffee.setBounds(410, 269, 97, 48);
		Money_text.add(High_Coffee);

		JButton SportDrink = new JButton("\uC774\uC628\uC74C\uB8CC");
		SportDrink.setBackground(new Color(250, 235, 215));
		SportDrink.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		SportDrink.setBounds(571, 269, 97, 48);
		Money_text.add(SportDrink);

		JButton Soda = new JButton("\uD0C4\uC0B0\uC74C\uB8CC");
		Soda.setBackground(new Color(230, 230, 250));
		Soda.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		Soda.setBounds(724, 269, 97, 48);
		Money_text.add(Soda);

		// 종료 버튼
		JButton Exit = new JButton("\uC885\uB8CC");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setForeground(Color.BLACK);
		Exit.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		Exit.setBackground(new Color(255, 228, 225));
		Exit.setBounds(790, 20, 81, 48);
		Money_text.add(Exit);

		JLabel Input_Amount = new JLabel("\uD22C\uC785\uAE08\uC561 : ");
		Input_Amount.setFont(new Font("서울남산체 EB", Font.PLAIN, 32));
		Input_Amount.setBounds(46, 437, 151, 75);
		Money_text.add(Input_Amount);

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
