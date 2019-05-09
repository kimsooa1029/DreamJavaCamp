package dreamschool.cscourse.chapter10;

public class IPhone extends Mobile{
	private String color;

	public IPhone(String production) {
		super(production);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void charge(int time) {
		System.out.println("IPhone : " + time + "분 충전했더니 FULL!!");
	}
	
}