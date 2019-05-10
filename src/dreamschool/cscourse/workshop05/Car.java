package dreamschool.cscourse.workshop05;

public class Car extends Vehicle {
	
	private int mileage;

	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		super(modelName, maxSpeed, numberLimit);
		this.mileage = mileage;
	}


	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" Æò±Õ¿¬ºñ : " + mileage + "km/l");
	}
}
