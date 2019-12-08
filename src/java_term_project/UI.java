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

	// 원래 Main을 삭제해야 함

public UI() {
		/*
		 * Class init Area
		 */

		// Money 초기화
		Money10 money10 = new Money10(10, 5);
		Money50 money50 = new Money50(50, 5);
		Money100 money100 = new Money100(100, 5);
		Money500 money500 = new Money500(500, 5);
		Money1000 money1000 = new Money1000(1000, 5);
		
		
		// Drink 초기화
		Water_class water = new Water_class(3,450);
		Coffee_class coffee = new Coffee_class(3,500);
		Ion_Beverage_class ion = new Ion_Beverage_class (3,550);
		High_Quality_Coffee_class high_coffee = new High_Quality_Coffee_class(3,700);
		Soda_class soda = new Soda_class(3,750);
		

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
				new Test();
				Admin_Menu.setText("gkgkgkgk");
			}
		});
		Admin_Menu.setBounds(27, 20, 117, 48);
		Money_text.add(Admin_Menu);

		JPanel panel = new JPanel();
		panel.setBounds(612, 481, 223, 64);
		Money_text.add(panel);


		// 10원짜리 버튼
		JButton M10_BT = new JButton("10\uC6D0");
		M10_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M10_BT.setBackground(new Color(211, 211, 211));
		M10_BT.addActionListener(new ActionListener() {
			// 10원 버튼을 누르면 현재금액 증가
			public void actionPerformed(ActionEvent e) {
				if (money10.getCount() != 0) {
					if (money.getMoney() <= 4990) {
						money.setMoney(money.getMoney(), money10.getMoney_10());
						money10.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + " 원");
					} else {
						JOptionPane.showMessageDialog(Money_text, "5000원 이상 입력 받을 수 없습니다.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "10원 화폐가 없습니다.");

				}
			}
		});
		panel.add(M10_BT);

		// 50원짜리 버튼
		JButton M50_BT = new JButton("50\uC6D0");
		M50_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M50_BT.setBackground(new Color(211, 211, 211));
		M50_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (money50.getCount() != 0) {
					if (money.getMoney() <= 4950) {
						money.setMoney(money.getMoney(), money50.getMoney_50());
						money50.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + " 원");
					} else {
						JOptionPane.showMessageDialog(Money_text, "5000원 이상 입력 받을 수 없습니다.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "50원 화폐가 없습니다.");
				}
			}
		});
		panel.add(M50_BT);

		// 100원짜리 버튼
		JButton M100_BT = new JButton("100\uC6D0");
		M100_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M100_BT.setBackground(new Color(211, 211, 211));
		M100_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (money100.getCount() != 0) {
					if (money.getMoney() <= 4900) {
						money.setMoney(money.getMoney(), money100.getMoney_100());
						money100.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + "원");
					} else {
						JOptionPane.showMessageDialog(Money_text, "5000 원 이상 입력 받을 수 없습니다.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "100원 화폐가 없습니다.");
				}
			}
		});
		panel.add(M100_BT);

		// 500원짜리 버튼
		JButton M500_BT = new JButton("500\uC6D0");
		M500_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M500_BT.setBackground(new Color(211, 211, 211));
		M500_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (money500.getCount() != 0) {
					if (money.getMoney() <= 4500) {
						money.setMoney(money.getMoney(), money500.getMoney_500());
						money500.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + "원");
					} else {
						JOptionPane.showMessageDialog(Money_text, "5000원 이상 입력 받을 수 없습니다.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "500원 화폐가 없습니다.");
				}
			}
		});
		panel.add(M500_BT);

		// 1000원짜리 버튼
		JButton M1000_BT = new JButton("1000\uC6D0");
		M1000_BT.setFont(new Font("서울남산체 B", Font.PLAIN, 12));
		M1000_BT.setBackground(new Color(211, 211, 211));
		M1000_BT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (money1000.getCount() != 0) {
					if (money.getMoney() <= 2000) {
						money.setMoney(money.getMoney(), money1000.getMoney_1000());
						money1000.delete();
						InputMoney.setText(String.valueOf(money.getMoney()) + "원");
					} else {
						JOptionPane.showMessageDialog(Money_text, "화폐 입력 최대단위는 3000원 입니다.");
					}
				} else {
					JOptionPane.showMessageDialog(Money_text, "1000원 화폐가 없습니다.");
				}
			}
		});
		panel.add(M1000_BT);

		/*
		 * Button Area 음료의 버튼 클릭시 이벤트 발생하는 공간
		 * 
		 */

		// Water 버튼
		JButton Water = new JButton("\uBB3C");
		Water.addActionListener(new ActionListener() {
			// 클릭 이벤트
			public void actionPerformed(ActionEvent e) {

				// 재고 Check
				if (water.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "재고가 부족합니다");
					return;
				}
				// 잔액이 물의 금액보다 같거나 많다면 분기 실행
				if (money.getMoney() >= 450  ) {
					// 재고 한개 Down
					water.MinusNumber(water.getNumber(), 1);
					WaterNum.setText("수량 : " + water.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 450));
					money.MinusMoney(money.getMoney(), 450);
					JOptionPane.showMessageDialog(Money_text, "물 을 구입하였습니다.");
				}
				// 잔액 부족
				else {
					JOptionPane.showMessageDialog(Money_text, "잔액이 부족합니다.");

			}
		}
			});

		Water.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		Water.setForeground(new Color(0, 0, 0));
		Water.setBackground(new Color(255, 228, 225));
		Water.setBounds(104, 269, 81, 48);
		Money_text.add(Water);

		// Coffee 버튼
		JButton Coffee = new JButton("\uCEE4\uD53C");
		Coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 재고 Check
				if(coffee.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "재고가 부족합니다");
					return;
				}
				if (money.getMoney() >= 500) {
					// 재고 한개 Down
					coffee.MinusNumber(coffee.getNumber(), 1);
					CoffeeNum.setText("수량 : " + coffee.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 500));
					money.MinusMoney(money.getMoney(), 500);
					JOptionPane.showMessageDialog(Money_text, "커피를 구입하였습니다.");
				}
				// 잔액 부족
				else {
					JOptionPane.showMessageDialog(Money_text, "잔액이 부족합니다.");
				}
			}
		});
		Coffee.setBackground(new Color(255, 245, 238));
		Coffee.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		Coffee.setBounds(246, 269, 81, 48);
		Money_text.add(Coffee);

		// SportDrink 버튼
		JButton SportDrink = new JButton("\uC774\uC628\uC74C\uB8CC");
		SportDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 재고 Check
				if(ion.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "재고가 부족합니다");
					return;
				}
				if (money.getMoney() >= 550) {
					// 재고 한개 Down
					ion.MinusNumber(ion.getNumber(), 1);
					SportNum.setText("수량 : " + ion.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 550));
					money.MinusMoney(money.getMoney(), 550);
					JOptionPane.showMessageDialog(Money_text, "이온음료를 구입하였습니다.");
				}
				// 잔액 부족
				else {
					JOptionPane.showMessageDialog(Money_text, "잔액이 부족합니다.");
				}
			}
		});
		SportDrink.setBackground(new Color(250, 235, 215));
		SportDrink.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		SportDrink.setBounds(389, 269, 97, 48);
		Money_text.add(SportDrink);

		// High_Coffee 버튼
		JButton High_Coffee = new JButton("\uACE0\uAE09\uCEE4\uD53C");
		High_Coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 재고 Check
				if(high_coffee.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "재고가 부족합니다");
					return;
				}
				if (money.getMoney() >= 700) {
					// 재고 한개 Down
					high_coffee.MinusNumber(high_coffee.getNumber(), 1);
					HighCoffeeNum.setText("수량 : " + high_coffee.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 700));
					money.MinusMoney(money.getMoney(), 700);
					JOptionPane.showMessageDialog(Money_text, "고급커피를 구입하였습니다.");
				}
				// 잔액 부족
				else {
					JOptionPane.showMessageDialog(Money_text, "잔액이 부족합니다.");
				}
			}
		});
		High_Coffee.setBackground(new Color(240, 255, 255));
		High_Coffee.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		High_Coffee.setBounds(549, 269, 97, 48);
		Money_text.add(High_Coffee);

		// 탄산음료 버튼
		JButton Soda = new JButton("\uD0C4\uC0B0\uC74C\uB8CC");
		Soda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 재고 Check
				if(soda.getNumber() == 0) {
					JOptionPane.showMessageDialog(Money_text, "재고가 부족합니다");
					return;
				}
				if (money.getMoney() >= 750) {
					// 재고 한개 Down
					soda.MinusNumber(soda.getNumber(), 1);
					SodaNum.setText("수량 : " + soda.getNumber());
					InputMoney.setText(String.valueOf(money.getMoney() - 750));
					money.MinusMoney(money.getMoney(), 750);
					JOptionPane.showMessageDialog(Money_text, "탄산음료를 구입하였습니다.");
				}
				// 잔액 부족
				else {
					JOptionPane.showMessageDialog(Money_text, "잔액이 부족합니다.");
				}
			}
		});
		Soda.setBackground(new Color(230, 230, 250));
		Soda.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		Soda.setBounds(705, 268, 97, 48);
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
		Input_Amount.setBounds(46, 437, 165, 75);
		Money_text.add(Input_Amount);

		/*
		 * TextFlied Area
		 */

		// 투입금액 확인
		InputMoney = new JTextField();
		InputMoney.setFont(new Font("서울남산체 B", Font.PLAIN, 32));
		InputMoney.setText(String.valueOf(money.getMoney()) + " 원");
		InputMoney.setBounds(191, 437, 178, 75);
		Money_text.add(InputMoney);
		InputMoney.setColumns(10);

		// 물 재고 수량 확인
		WaterNum = new JTextField();
		WaterNum.setText("수량 : " + water.getNumber());
		WaterNum.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		WaterNum.setColumns(10);
		WaterNum.setBounds(104, 328, 81, 21);
		Money_text.add(WaterNum);

		// 커피 재고 수량 확인
		CoffeeNum = new JTextField();
		CoffeeNum.setText("수량 : " + coffee.getNumber());
		CoffeeNum.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		CoffeeNum.setColumns(10);
		CoffeeNum.setBounds(246, 329, 81, 21);
		Money_text.add(CoffeeNum);

		// 이온음료 재고 수량 확인
		SportNum = new JTextField();
		SportNum.setText("수량 : " + ion.getNumber());
		SportNum.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		SportNum.setColumns(10);
		SportNum.setBounds(399, 329, 81, 21);
		Money_text.add(SportNum);

		// 고급 커피 재고 수량 확인
		HighCoffeeNum = new JTextField();
		HighCoffeeNum.setText("수량 : " + high_coffee.getNumber());
		HighCoffeeNum.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
		HighCoffeeNum.setColumns(10);
		HighCoffeeNum.setBounds(559, 329, 81, 21);
		Money_text.add(HighCoffeeNum);

		// 탄산음료 재고 수량 확인
		SodaNum = new JTextField();
		SodaNum.setText("수량 : " + soda.getNumber());
		SodaNum.setFont(new Font("서울남산체 B", Font.PLAIN, 15));
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