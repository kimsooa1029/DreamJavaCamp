package dreamschool.cscourse.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat cat = new Cat(23, "�丣�þ�", "�߿���");
		
		System.out.println(cat);
		
		System.out.println("�̸� :" + cat.getName());
		System.out.println("���� :" + cat.getAge() + "��");
		System.out.println("���� :" + cat.getKind());
		cat.run();
		cat.hunt();
		cat.paly();
		System.out.println();
		
		
		Dog dog = new Dog(2, "�ú����� �㽺Ű", "�۸���");
				
		System.out.println("�̸� :" + dog.getName());
		System.out.println("���� :" + dog.getAge() + "��");
		System.out.println("���� :" + dog.getKind());
		dog.run();
		dog.hunt();
	
	}
}