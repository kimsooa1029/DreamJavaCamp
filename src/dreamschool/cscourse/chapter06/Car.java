package dreamschool.cscourse.chapter06;

public class Car {
	String carName;
	int oilAmount;
	double distance;
	
	void addOil(int amount) {
	    oilAmount += amount;
	    System.out.println("휘발유통" + amount + "주유합니다.");
	}
	
	void printCarInfo() {
		System.out.println("[" + carName + "] 남은 기름양 :" + oilAmount +
				"L, 총 주행거리 :" + distance + "km");

	}
	void driveCar(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "에서" + endPoint + "까지"
				+ driveDistance + "km 주행하였습니다.");
		distance += driveDistance;
		oilAmount -= (int)(driveDistance / 20);
		// 남은 기름양은 주행거리에서 빼줘야 하는 식
	}
	
	void distanceCheck() {
		System.out.println("주행가능 거리는 약" + (oilAmount * 20) + "km입니다.");
	}

}
