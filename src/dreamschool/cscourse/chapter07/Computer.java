package dreamschool.cscourse.chapter07;

public class Computer {
	String model;
	String osVer;
	int production;
	int sales;
	
	public Computer(String modle, String osVer, int product) {
		this.model = modle;
		this.osVer = osVer;
		this.production = product;
	}
	public Computer(String modle, String osVer, int product, int sales) {
		this.model = modle;
		this.osVer = osVer;
		this.production = product;
		this.sales = sales;
	}
	void printComputerInfo() {
		System.out.println("=== " + this.model + "(" + this.osVer + ")" +" ===");
		System.out.println("생산 : " + this.production + " / " + "판매 : " + this.sales);
	}
	

}
