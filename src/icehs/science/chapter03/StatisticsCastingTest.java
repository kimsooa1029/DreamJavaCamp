package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		
		double lotooProbability = 0.0000001235;
        long population = 6973738433L;

        
        int intLotooProbability = (int)lotooProbability;
        System.out.println("로또에 당첨될 확률 :" + lotooProbability);
        System.out.println("로또에 당첨될 확률 int변환 :" + intLotooProbability);
        
        int intPopulation = (int)population;
        System.out.println("전 세계의 인구 수 :" + population);
        System.out.println("전 세계의 인구 수 int변환 :" + intPopulation);
	}

}
