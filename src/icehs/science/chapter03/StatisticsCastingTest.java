package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		
		double lotooProbability = 0.0000001235;
        long population = 6973738433L;

        
        int intLotooProbability = (int)lotooProbability;
        System.out.println("�ζǿ� ��÷�� Ȯ�� :" + lotooProbability);
        System.out.println("�ζǿ� ��÷�� Ȯ�� int��ȯ :" + intLotooProbability);
        
        int intPopulation = (int)population;
        System.out.println("�� ������ �α� �� :" + population);
        System.out.println("�� ������ �α� �� int��ȯ :" + intPopulation);
	}

}
