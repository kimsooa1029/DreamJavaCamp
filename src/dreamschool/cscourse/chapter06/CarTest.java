package dreamschool.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		mycar.carName = "Dream car";
		mycar.oilAmount = 5;
		mycar.distance = 140;
		
		mycar.printCarInfo();
		
		mycar.addOil(10); 
		
		mycar.printCarInfo();
		
		mycar.driveCar("IT����", "��õ����", 10.17);
		
		mycar.printCarInfo();
		
		mycar.driveCar("��õ����", "������ ����Ʈ", 60.21);
		
		mycar.printCarInfo();
		
		mycar.distanceCheck();
		
		}
		
	}
