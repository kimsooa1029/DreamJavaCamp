package dreamschool.cscourse.chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol [] id = new Idol [4];
		id[0] = new Idol("�ҳ�ô� ", "�¿�");
		id[1] = new Idol("����Ÿ ", "����");
		id[2] = new Idol("��� ", "���巡��");
		id[3] = new Idol("��Ʈ ", "��伷");
		
		for(int i = 0; i < id.length; i++) {
			System.out.println( id[i].getName() + " : " + id[i].getGroup() );
	
		}
	}
}
