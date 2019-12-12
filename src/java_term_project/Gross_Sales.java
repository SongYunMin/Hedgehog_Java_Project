package java_term_project;

public class Gross_Sales {
	private int Day_Sales;		
	private int Month_Sales;
	private int Water_Sales;
	private int Coffee_Sales;
	private int Sport_Sales;
	private int Soda_Sales;
	
	// 생성자
	public Gross_Sales() {
		
		
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
	
	/*
	// 물 매출
	public int getWater_Sales() {
		return Water_Sales;
	}

	public void setWater_Sales(int water_Sales) {
		Water_Sales = water_Sales;
	}

	public int getCoffee_Sales() {
		return Coffee_Sales;
	}

	public void setCoffee_Sales(int coffee_Sales) {
		Coffee_Sales = coffee_Sales;
	}

	public int getSport_Sales() {
		return Sport_Sales;
	}

	public void setSport_Sales(int sport_Sales) {
		Sport_Sales = sport_Sales;
	}

	public int getSoda_Sales() {
		return Soda_Sales;
	}

	public void setSoda_Sales(int soda_Sales) {
		Soda_Sales = soda_Sales;
	}
	*/


}
