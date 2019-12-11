package java_term_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager extends JFrame {

	private JPanel Manager_Layout;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 697);
		Manager_Layout = new JPanel();
		Manager_Layout.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Manager_Layout);
		Manager_Layout.setLayout(null);

		// 일/월/음료별 매출관리
		JButton Drink_Sales = new JButton("\uC74C\uB8CC\uBCC4 \uB9E4\uCD9C \uAD00\uB9AC");
		Drink_Sales.setFont(new Font("서울남산체 EB", Font.PLAIN, 16));
		Drink_Sales.setBounds(393, 518, 161, 63);
		Manager_Layout.add(Drink_Sales);

		JButton monthly_Sales = new JButton("\uC6D4\uBCC4 \uCD1D \uB9E4\uCD9C \uD655\uC778");
		monthly_Sales.setFont(new Font("서울남산체 EB", Font.PLAIN, 16));
		monthly_Sales.setBounds(209, 518, 161, 63);
		Manager_Layout.add(monthly_Sales);

		JButton Daily_Sales = new JButton("\uC77C\uBCC4 \uCD1D \uB9E4\uCD9C \uD655\uC778");
		Daily_Sales.setFont(new Font("서울남산체 EB", Font.PLAIN, 16));
		Daily_Sales.setBounds(24, 518, 161, 63);
		Manager_Layout.add(Daily_Sales);

		JLabel Admin_Label = new JLabel("\uAD00\uB9AC\uC790 \uBA54\uB274");
		Admin_Label.setFont(new Font("서울남산체 EB", Font.PLAIN, 36));
		Admin_Label.setBounds(24, 10, 172, 86);
		Manager_Layout.add(Admin_Label);

		// 음료들의 재고를 보충!
		JButton Plus_Water = new JButton("\uBB3C \uBCF4\uCDA9");
		Plus_Water.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.water.setNumber(3);
				UI.WaterNum.setText(String.valueOf("수량 : " + UI.water.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "물을 보충하였습니다.");
			}
		});
		Plus_Water.setFont(new Font("서울남산체 EB", Font.PLAIN, 16));
		Plus_Water.setBounds(413, 116, 124, 47);
		Manager_Layout.add(Plus_Water);

		JButton Plus_Coffee = new JButton("\uCEE4\uD53C \uBCF4\uCDA9");
		Plus_Coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.coffee.setNumber(3);
				UI.CoffeeNum.setText(String.valueOf("수량 : " + UI.coffee.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "커피를 보충하였습니다.");
			}
		});
		Plus_Coffee.setFont(new Font("서울남산체 EB", Font.PLAIN, 16));
		Plus_Coffee.setBounds(413, 183, 124, 47);
		Manager_Layout.add(Plus_Coffee);

		JButton Plus_Sport = new JButton("\uC774\uC628\uC74C\uB8CC \uBCF4\uCDA9");
		Plus_Sport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.ion.setNumber(3);
				UI.SportNum.setText(String.valueOf("수량 : " + UI.ion.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "이온음료를 보충하였습니다.");
			}
		});
		Plus_Sport.setFont(new Font("서울남산체 EB", Font.PLAIN, 16));
		Plus_Sport.setBounds(413, 251, 124, 47);
		Manager_Layout.add(Plus_Sport);

		JButton Plus_HighCoffee = new JButton("\uACE0\uAE09\uCEE4\uD53C \uBCF4\uCDA9");
		Plus_HighCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.high_coffee.setNumber(3);
				UI.HighCoffeeNum.setText(String.valueOf("수량 : " + UI.high_coffee.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "고급커피를 보충하였습니다.");
			}
		});
		Plus_HighCoffee.setFont(new Font("서울남산체 EB", Font.PLAIN, 16));
		Plus_HighCoffee.setBounds(413, 320, 124, 47);
		Manager_Layout.add(Plus_HighCoffee);

		JButton Plus_Soda = new JButton("\uD0C4\uC0B0\uC74C\uB8CC \uBCF4\uCDA9");
		Plus_Soda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.soda.setNumber(3);
				UI.SodaNum.setText(String.valueOf("수량 : " + UI.soda.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "탄산음료를 보충하였습니다.");
			}
		});
		Plus_Soda.setFont(new Font("서울남산체 EB", Font.PLAIN, 16));
		Plus_Soda.setBounds(413, 393, 124, 47);
		Manager_Layout.add(Plus_Soda);
	}
}
