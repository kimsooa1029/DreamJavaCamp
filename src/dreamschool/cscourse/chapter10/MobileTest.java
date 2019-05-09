package dreamschool.cscourse.chapter10;

public class MobileTest {

	public static void main(String[] args) {
		Mobile [] mobiles = new Mobile[2];
		mobiles[0] = new Galaxy("Galaxy");
		mobiles[1] = new IPhone("IPhone");
		
		Galaxy gal = (Galaxy)mobiles[0];
		gal.setOsVersion("�ȵ���̵� ������");
		System.out.println("Galaxy :" + gal.getOsVersion() );
		mobiles[0].call(5);
		mobiles[0].charge(30);
		
		System.out.println();
		
		IPhone iph = (IPhone)mobiles[1];
		iph.setColor("���");
		System.out.println("IPhone : " + iph.getColor() );
		mobiles[1].call(10);
		mobiles[1].charge(15);


		
	}

}
