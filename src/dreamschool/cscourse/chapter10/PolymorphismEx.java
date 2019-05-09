package dreamschool.cscourse.chapter10;

public class PolymorphismEx {

	public static void main(String[] args) {
		Person [] persons = new Person[3];
		persons[0] = new Person("ȫ�浿", "111-1111");
		persons[1] = new Student("ȫ���", "222-2222", "��ǻ�Ͱ��а�");
		persons[2] = new Teacher("������", "333-3333", "Java");
		
		for(int i = 0; i < persons.length; i++) {
			persons[i].eat();
			persons[i].sleep();
			System.out.println();
		}
		//�ΰ��� for ������ ����.
		for(Person p : persons) {
			p.eat();
			p.sleep();
			System.out.println();
		//�ι�° for ������ ���� �迭������ ����Ѵ�.
		//�ι�° for ������ ������ ������ �� ����Ʈ �Ѵ�.
		//�ι�°�� ���´� �� == ���� for ����.
		}
	}
}