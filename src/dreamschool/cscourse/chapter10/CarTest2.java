package dreamschool.cscourse.chapter10;

public class CarTest2 {

	public static void main(String[] args) {
		//Car[] cars = new Car[2];
		Washer[] cars = new Washer[2];
		
		cars[0] = new Taxi();
		cars[0].wash();
		
		System.out.print("택시 : ");
		cars[0].wash();
		
		cars[1] = new Truck();
		
		System.out.print("트럭 : ");
		cars[1].wash();
		

	}

}
