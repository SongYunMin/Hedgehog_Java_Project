package java_term_project;

public class Gross_Sales {
	private  int Day_Sales;		
	private int Month_Sales;
	
	// 생성자
	public Gross_Sales() {
		Day_Sales = 0;
		Month_Sales = 0;
	};		
	
	// 일 매출
	public int getDay_Sales() {
		return Day_Sales;
	}
	public void setDay_Sales(int day_Sales) {
		Day_Sales = day_Sales;
	}
	public void Plus_Day_Sales(int day_Sales,int plus) {
		this.Day_Sales = day_Sales + plus;
	}
	
	
	// 월 매출
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
