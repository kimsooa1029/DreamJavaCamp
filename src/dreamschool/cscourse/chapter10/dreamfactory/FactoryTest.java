package dreamschool.cscourse.chapter10.dreamfactory;

public class FactoryTest {

	public static void main(String[] args) {
		IProduct[] pros = new IProduct[4];
		pros[0] = CreatFactory.creat("A");
		pros[1] = CreatFactory.creat("B");
		pros[2] = CreatFactory.creat("C");
		pros[3] = CreatFactory.creat("A");
		
		for(IProduct pro : pros) {
			pro.printProductInfo();
		}

	}

}