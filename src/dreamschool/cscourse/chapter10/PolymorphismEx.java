package dreamschool.cscourse.chapter10;

public class PolymorphismEx {

	public static void main(String[] args) {
		Person [] persons = new Person[3];
		persons[0] = new Person("홍길동", "111-1111");
		persons[1] = new Student("홍길순", "222-2222", "컴퓨터공학과");
		persons[2] = new Teacher("강감찬", "333-3333", "Java");
		
		for(int i = 0; i < persons.length; i++) {
			persons[i].eat();
			persons[i].sleep();
			System.out.println();
		}
		//두개의 for 구문은 같다.
		for(Person p : persons) {
			p.eat();
			p.sleep();
			System.out.println();
		//두번째 for 구문은 오직 배열에서만 사용한다.
		//두번째 for 구문은 무조건 모든것을 다 프린트 한다.
		//두번째를 일컫는 말 == 향상된 for 구문.
		}
	}
}