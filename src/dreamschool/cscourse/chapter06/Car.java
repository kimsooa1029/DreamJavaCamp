package dreamschool.cscourse.chapter06;

public class Car {
	String carName;
	int oilAmount;
	double distance;
	
	void addOil(int amount) {
	    oilAmount += amount;
	    System.out.println("�ֹ�����" + amount + "�����մϴ�.");
	}
	
	void printCarInfo() {
		System.out.println("[" + carName + "] ���� �⸧�� :" + oilAmount +
				"L, �� ����Ÿ� :" + distance + "km");

	}
	void driveCar(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "����" + endPoint + "����"
				+ driveDistance + "km �����Ͽ����ϴ�.");
		distance += driveDistance;
		oilAmount -= (int)(driveDistance / 20);
		// ���� �⸧���� ����Ÿ����� ����� �ϴ� ��
	}
	
	void distanceCheck() {
		System.out.println("���డ�� �Ÿ��� ��" + (oilAmount * 20) + "km�Դϴ�.");
	}

}
