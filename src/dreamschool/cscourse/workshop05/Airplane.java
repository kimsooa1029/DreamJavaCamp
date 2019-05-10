package dreamschool.cscourse.workshop05;

public class Airplane extends Vehicle {

	private int numOfEngine;

	
	public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine) {
		super(modelName, maxSpeed, numberLimit);
		this.numOfEngine = numOfEngine;
	}
	
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" 엔진개수 : " + numOfEngine + "개");
	}
}
