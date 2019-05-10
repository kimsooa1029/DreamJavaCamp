package dreamschool.cscourse.workshop05;

import java.util.ArrayList;

public class VehicleManager {
	  
	ArrayList<Vehicle> list = new ArrayList<>();
	public VehicleManager() {
		
		list.add(new Airplane("����747",1300,300,4));
		list.add(new Airplane("F-15",1600,1,1));
		list.add(new Car("�׷���", 180, 5, 10));
		list.add(new Car("����ũ", 130, 4, 15));
		list.add(new Car("��Ÿ����", 150, 10, 11));
		list.add(new Ship("ũ����2", 30, 400,35000));
		list.add(new Ship("��ƿ����", 25, 150, 15000));
	}

	public void displayVehicles(String title) {
		System.out.println(title);
		for(Vehicle vehicle : list) {
			vehicle.displayInfo();
			vehicle.setAvailable(true);
		}
	}
	/*
	 * public void displayVehicles2(String title) { System.out.println(title); for
	 * (int inx = 0 ; inx < vehicles.length ; inx++) { vehicles[inx].displayInfo();
	 * vehicles[inx].setAvailable(true);; }
	 * 
	 * 
	 * 
	 * System.out.println(); }
	 */
}
