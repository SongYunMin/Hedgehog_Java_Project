package java_term_project;

public class Gross_Sales {
	private int Day_Sales;		
	private int Month_Sales;
	private int Water_Sales;
	private int Coffee_Sales;
	private int Sport_Sales;
	private int Soda_Sales;
	
	// ������
	public Gross_Sales() {
		
		
	};		
	
	// �� ����
	public int getDay_Sales() {
		return Day_Sales;
	}
	public void setDay_Sales(int day_Sales) {
		Day_Sales = day_Sales;
	}
	public void Plus_Day_Sales(int day_Sales,int plus) {
		this.Day_Sales = day_Sales + plus;
	}
	
	
	// �� ����
	public int getMonth_Sales() {
		return Month_Sales;
	}
	public void setMonth_Sales(int month_Sales) {
		Month_Sales = month_Sales;
	}
	public void Plus_Month_Sales(int month_Sales,int plus) {
		this.Day_Sales = month_Sales + plus;
	}
}
