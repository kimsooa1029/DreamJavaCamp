package icehs.science.chapter03;

public class TypeCasting {

	public static void main(String[] args) {
		long billWealth = 70000000000L;
		System.out.println("원래값 :" + billWealth);
		
		int intbillWealth = (int)billWealth;
		System.out.println("int형으로 형변환" + intbillWealth);
		
		double doubleBillWealth = billWealth;
		System.out.println("double형으로 형변환 :" + doubleBillWealth);

	}

}
