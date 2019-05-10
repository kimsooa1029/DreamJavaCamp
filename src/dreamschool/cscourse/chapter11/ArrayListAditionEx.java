package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class ArrayListAditionEx {
	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 10;
		
		ArrayList<Integer> list = new ArrayList<>();
		//ArrayList<Object> list = new ArrayList<>()
		//이렇게 오브젝트로 써주면 어떠한 형태도 다 가능함
		list.add(number1);
		list.add(number2);
		list.add(23);
		list.add(100);
		list.add(new Integer(150));
		//list.add(new Integer(150));
		//자바가 알아서 int형을 객체로 바꾸어줌
		
		
		int a = list.get(4);
		System.out.println(a);
		list.remove(1);
		//사라지는 것 뒤에것들이 하나씩 번호가 땡겨지니까 시간이 걸림
		list.set(0, 500);
		//값 추가
		System.out.println(list);
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}//list에서는 length말고 size를 씀 
		
		System.out.println();
		
		for(int i : list) {
			System.out.println(i);
		}//모든것을 다 프린트할때 쓴다. 특정한 값 추출 불가능 : 향상된 for 구문 
	}
}