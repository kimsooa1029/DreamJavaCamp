package dreamschool.cscourse.chapter09;

public class Cat extends Animal{
	private String name;
	
	
	public Cat(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + "��ü�� ȣ��Ǿ��׿� ������";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void hunt() {
		System.out.println("�㸦 �����ž�!!!");
	}
	public void paly() {
		System.out.println("��� ���̰� ���ƿ�~~");
	}
	

}
