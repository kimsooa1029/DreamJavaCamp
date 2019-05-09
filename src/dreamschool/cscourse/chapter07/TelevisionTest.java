package dreamschool.cscourse.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tel1 = new Television("INFINIA", 1500000);
		Television tel2 = new Television("XCANVAS",  1000000 ,"LCD TV");
		Television tel3 = new Television("CINEMA", 2000000 , "3D TV");
		
		tel1.printTelevisionInfo();
		tel2.printTelevisionInfo();
		tel3.printTelevisionInfo();
		System.out.println("가격의 합" +(tel1.price + tel2.price + tel3.price));
			
		}
	}
