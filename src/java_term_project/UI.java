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
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class UI extends JFrame {

	private JPanel Money_text;
	private JTextField InputMoney;
	private JTextField WaterNum;
	private JTextField CoffeeNum;
	private JTextField HighCoffeeNum;
	private JTextField SportNum;
	private JTextField SodaNum;

	// ���� Main�� �����ؾ� ��

public UI() {
		/*
		 * Class init Area
		 */

		// Money �ʱ�ȭ
		Money10 money10 = new Money10(10, 5);
		Money50 money50 = new Money50(50, 5);
		Money100 money100 = new Money100(100, 5);
		Money500 money500 = new Money500(500, 5);
		Money1000 money1000 = new Money1000(1000, 5);
		
		
		// Drink �ʱ�ȭ
		Water_class water = new Water_class(3,450);
		Coffee_class coffee = new Coffee_class(3,500);
		Ion_Beverage_class ion = new Ion_Beverage_class (3,550);
		High_Quality_Coffee_class high_coffee = new High_Quality_Coffee_class(3,700);
		Soda_class soda = new Soda_class(3,750);
		

		// ���� �Ѿ��� �˷��� class
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
		Main_Text.setFont(new Font("��õ��ü", Font.PLAIN, 60));
		Main_Text.setBackground(new Color(0, 0, 0));
		Main_Text.setBounds(355, 10, 186, 137);
		Money_text.add(Main_Text);

		// ������ �޴� ��ư
		JButton Admin_Menu = new JButton("\uAD00\uB9AC\uC790 \uBA54\uB274");
		Admin_Menu.setBackground(new Color(188, 143, 143));
		Admin_Menu.setForeground(new Color(47, 79, 79));
		Admin_Menu.setFont(new Font("�Ƹ���B", Font.BOLD, 14));
		Admin_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� ��µǾ����ϴ�.");
				new Test();
				Admin_Menu.setText("gkgkgkgk");
			}
		});
		Admin_Menu.setBounds(27, 20, 117, 48);
		Money_text.add(Admin_Menu);

		JPanel panel = new JPanel();
		panel.setBounds(612, 481, 223, 64);
		Money_text.add(panel);


		// 10��¥�� ��ư
		JButton M10_BT = new JButton("10\uC6D0");
		M10_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M10_BT.setBackground(new Color(211, 211, 211));
		M10_BT.addActionListener(new ActionListener() {
			// 10�� ��ư�� ������ ����ݾ� ����
			public void actionPerformed(ActionEvent e) {
				if (money10.getCount() != 0) {
					if (money.getMoney() <= 4990) {
						money.setMoney(money.getMoney(), money10.getMoney_10());
						money10.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + " ��");
					} else {
						JOptionPane.showMessageDialog(Money_text, "5000�� �̻� �Է� ���� �� �����ϴ�.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "10�� ȭ�� �����ϴ�.");

				}
			}
		});
		panel.add(M10_BT);

		// 50��¥�� ��ư
		JButton M50_BT = new JButton("50\uC6D0");
		M50_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M50_BT.setBackground(new Color(211, 211, 211));
		M50_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (money50.getCount() != 0) {
					if (money.getMoney() <= 4950) {
						money.setMoney(money.getMoney(), money50.getMoney_50());
						money50.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + " ��");
					} else {
						JOptionPane.showMessageDialog(Money_text, "5000�� �̻� �Է� ���� �� �����ϴ�.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "50�� ȭ�� �����ϴ�.");
				}
			}
		});
		panel.add(M50_BT);

		// 100��¥�� ��ư
		JButton M100_BT = new JButton("100\uC6D0");
		M100_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M100_BT.setBackground(new Color(211, 211, 211));
		M100_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (money100.getCount() != 0) {
					if (money.getMoney() <= 4900) {
						money.setMoney(money.getMoney(), money100.getMoney_100());
						money100.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + "��");
					} else {
						JOptionPane.showMessageDialog(Money_text, "5000 �� �̻� �Է� ���� �� �����ϴ�.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "100�� ȭ�� �����ϴ�.");
				}
			}
		});
		panel.add(M100_BT);

		// 500��¥�� ��ư
		JButton M500_BT = new JButton("500\uC6D0");
		M500_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M500_BT.setBackground(new Color(211, 211, 211));
		M500_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (money500.getCount() != 0) {
					if (money.getMoney() <= 4500) {
						money.setMoney(money.getMoney(), money500.getMoney_500());
						money500.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + "��");
					} else {
						JOptionPane.showMessageDialog(Money_text, "5000�� �̻� �Է� ���� �� �����ϴ�.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "500�� ȭ�� �����ϴ�.");
				}
			}
		});
		panel.add(M500_BT);

		// 1000��¥�� ��ư
		JButton M1000_BT = new JButton("1000\uC6D0");
		M1000_BT.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 12));
		M1000_BT.setBackground(new Color(211, 211, 211));
		M1000_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (money1000.getCount() != 0) {
					if (money.getMoney() <= 2000) {
						money.setMoney(money.getMoney(), money1000.getMoney_1000());
						money1000.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + "��");
					} else {
						JOptionPane.showMessageDialog(Money_text, "ȭ�� �Է� �ִ������ 3000�� �Դϴ�.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "1000�� ȭ�� �����ϴ�.");
				}
			}
		});
		panel.add(M1000_BT);

		/*
		 * Button Area ������ ��ư Ŭ���� �̺�Ʈ �߻��ϴ� ����
		 * 
		 */

		// Water ��ư
		JButton Water = new JButton("\uBB3C");
		Water.addActionListener(new ActionListener() {
			// Ŭ�� �̺�Ʈ
			public void actionPerformed(ActionEvent e) {

				// ��� Check
				if (water.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "��� �����մϴ�");
					return;
				}
				// �ܾ��� ���� �ݾ׺��� ���ų� ���ٸ� �б� ����
				if (money.getMoney() >= 450  ) {
					// ��� �Ѱ� Down
					water.MinusNumber(water.getNumber(), 1);
					WaterNum.setText("���� : " + water.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 450));
					money.MinusMoney(money.getMoney(), 450);
					JOptionPane.showMessageDialog(Money_text, "�� �� �����Ͽ����ϴ�.");
				}
				// �ܾ� ����
				else {
					JOptionPane.showMessageDialog(Money_text, "�ܾ��� �����մϴ�.");

			}
		}
			});

		Water.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		Water.setForeground(new Color(0, 0, 0));
		Water.setBackground(new Color(255, 228, 225));
		Water.setBounds(104, 269, 81, 48);
		Money_text.add(Water);

		// Coffee ��ư
		JButton Coffee = new JButton("\uCEE4\uD53C");
		Coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��� Check
				if(coffee.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "��� �����մϴ�");
					return;
				}
				if (money.getMoney() >= 500) {
					// ��� �Ѱ� Down
					coffee.MinusNumber(coffee.getNumber(), 1);
					CoffeeNum.setText("���� : " + coffee.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 500));
					money.MinusMoney(money.getMoney(), 500);
					JOptionPane.showMessageDialog(Money_text, "Ŀ�Ǹ� �����Ͽ����ϴ�.");
				}
				// �ܾ� ����
				else {
					JOptionPane.showMessageDialog(Money_text, "�ܾ��� �����մϴ�.");
				}
			}
		});
		Coffee.setBackground(new Color(255, 245, 238));
		Coffee.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		Coffee.setBounds(246, 269, 81, 48);
		Money_text.add(Coffee);

		// SportDrink ��ư
		JButton SportDrink = new JButton("\uC774\uC628\uC74C\uB8CC");
		SportDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��� Check
				if(ion.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "��� �����մϴ�");
					return;
				}
				if (money.getMoney() >= 550) {
					// ��� �Ѱ� Down
					ion.MinusNumber(ion.getNumber(), 1);
					SportNum.setText("���� : " + ion.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 550));
					money.MinusMoney(money.getMoney(), 550);
					JOptionPane.showMessageDialog(Money_text, "�̿����Ḧ �����Ͽ����ϴ�.");
				}
				// �ܾ� ����
				else {
					JOptionPane.showMessageDialog(Money_text, "�ܾ��� �����մϴ�.");
				}
			}
		});
		SportDrink.setBackground(new Color(250, 235, 215));
		SportDrink.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		SportDrink.setBounds(389, 269, 97, 48);
		Money_text.add(SportDrink);

		// High_Coffee ��ư
		JButton High_Coffee = new JButton("\uACE0\uAE09\uCEE4\uD53C");
		High_Coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��� Check
				if(high_coffee.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "��� �����մϴ�");
					return;
				}
				if (money.getMoney() >= 700) {
					// ��� �Ѱ� Down
					high_coffee.MinusNumber(high_coffee.getNumber(), 1);
					HighCoffeeNum.setText("���� : " + high_coffee.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 700));
					money.MinusMoney(money.getMoney(), 700);
					JOptionPane.showMessageDialog(Money_text, "���Ŀ�Ǹ� �����Ͽ����ϴ�.");
				}
				// �ܾ� ����
				else {
					JOptionPane.showMessageDialog(Money_text, "�ܾ��� �����մϴ�.");
				}
			}
		});
		High_Coffee.setBackground(new Color(240, 255, 255));
		High_Coffee.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		High_Coffee.setBounds(549, 269, 97, 48);
		Money_text.add(High_Coffee);

		// ź������ ��ư
		JButton Soda = new JButton("\uD0C4\uC0B0\uC74C\uB8CC");
		Soda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��� Check
				if(soda.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "��� �����մϴ�");
					return;
				}
				if (money.getMoney() >= 750) {
					// ��� �Ѱ� Down
					soda.MinusNumber(soda.getNumber(), 1);
					SodaNum.setText("���� : " + soda.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 750));
					money.MinusMoney(money.getMoney(), 750);
					JOptionPane.showMessageDialog(Money_text, "ź�����Ḧ �����Ͽ����ϴ�.");
				}
				// �ܾ� ����
				else {
					JOptionPane.showMessageDialog(Money_text, "�ܾ��� �����մϴ�.");
				}
			}
		});
		Soda.setBackground(new Color(230, 230, 250));
		Soda.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		Soda.setBounds(705, 268, 97, 48);
		Money_text.add(Soda);

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
		Money_text.add(Exit);

		JLabel Input_Amount = new JLabel("\uD22C\uC785\uAE08\uC561 : ");
		Input_Amount.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 32));
		Input_Amount.setBounds(46, 437, 165, 75);
		Money_text.add(Input_Amount);

		/*
		 * TextFlied Area
		 */

		// ���Աݾ� Ȯ��
		InputMoney = new JTextField();
		InputMoney.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 32));
		InputMoney.setText(String.valueOf(money.getMoney()) + " ��");
		InputMoney.setBounds(191, 437, 178, 75);
		Money_text.add(InputMoney);
		InputMoney.setColumns(10);

		// �� ��� ���� Ȯ��
		WaterNum = new JTextField();
		WaterNum.setText("���� : " + water.getNumber());
		WaterNum.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		WaterNum.setColumns(10);
		WaterNum.setBounds(104, 328, 81, 21);
		Money_text.add(WaterNum);

		// Ŀ�� ��� ���� Ȯ��
		CoffeeNum = new JTextField();
		CoffeeNum.setText("���� : " + coffee.getNumber());
		CoffeeNum.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		CoffeeNum.setColumns(10);
		CoffeeNum.setBounds(246, 329, 81, 21);
		Money_text.add(CoffeeNum);

		// �̿����� ��� ���� Ȯ��
		SportNum = new JTextField();
		SportNum.setText("���� : " + ion.getNumber());
		SportNum.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		SportNum.setColumns(10);
		SportNum.setBounds(399, 329, 81, 21);
		Money_text.add(SportNum);

		// ��� Ŀ�� ��� ���� Ȯ��
		HighCoffeeNum = new JTextField();
		HighCoffeeNum.setText("���� : " + high_coffee.getNumber());
		HighCoffeeNum.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		HighCoffeeNum.setColumns(10);
		HighCoffeeNum.setBounds(559, 329, 81, 21);
		Money_text.add(HighCoffeeNum);

		// ź������ ��� ���� Ȯ��
		SodaNum = new JTextField();
		SodaNum.setText("���� : " + soda.getNumber());
		SodaNum.setFont(new Font("���ﳲ��ü B", Font.PLAIN, 15));
		SodaNum.setColumns(10);
		SodaNum.setBounds(715, 328, 81, 21);
		Money_text.add(SodaNum);

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