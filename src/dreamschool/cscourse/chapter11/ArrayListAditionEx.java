package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class ArrayListAditionEx {
	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 10;
		
		ArrayList<Integer> list = new ArrayList<>();
		//ArrayList<Object> list = new ArrayList<>()
		//�̷��� ������Ʈ�� ���ָ� ��� ���µ� �� ������
		list.add(number1);
		list.add(number2);
		list.add(23);
		list.add(100);
		list.add(new Integer(150));
		//list.add(new Integer(150));
		//�ڹٰ� �˾Ƽ� int���� ��ü�� �ٲپ���
		
		
		int a = list.get(4);
		System.out.println(a);
		list.remove(1);
		//������� �� �ڿ��͵��� �ϳ��� ��ȣ�� �������ϱ� �ð��� �ɸ�
		list.set(0, 500);
		//�� �߰�
		System.out.println(list);
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}//list������ length���� size�� �� 
		
		System.out.println();
		
		for(int i : list) {
			System.out.println(i);
		}//������ �� ����Ʈ�Ҷ� ����. Ư���� �� ���� �Ұ��� : ���� for ���� 
	}
}