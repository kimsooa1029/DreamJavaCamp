package dreamschool.cscourse.chapter10;

public class Truck extends Car{
	private int maxWeight;

	
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}


	@Override
	public void go(int d) {
		System.out.println("트럭를 타고 " + d + "km 이동합니다.");
	}

}
