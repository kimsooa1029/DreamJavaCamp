package dreamschool.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "�Ƹ����� ";
		choco.type = "��ũ ";
		choco.price = 2200;
		
		choco.printCholateInfo(); 
		System.out.println("�Ƹ����� ���ݷ� 20�� :" + choco.calculateTotalPrice(20));
		choco.changeChocolateInfo("ī��Ű����", 2500);
		choco.printCholateInfo();
		System.out.println("ī�� Ű���� ���ݷ� 15�� (10% ����) :" + choco.calculateTotalPrice(15, 10));
		choco.changeChocolateInfo("Ʈ���� ���", "ȭ��Ʈ", 2300);
		choco.printCholateInfo();

	}

}
