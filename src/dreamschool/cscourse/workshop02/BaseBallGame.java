package dreamschool.cscourse.workshop02;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	
	public static void main(String[] args) {
		//������ �ڸ��� ��� �ٸ� ���ڰ� ���ö� ���� ��� ������. 
		int compNum = getHiddenNumber();
		while (true) {
	    if(checkNumber(compNum)) {
			break;
	    }else{
	    	compNum = getHiddenNumber();
	    }
		}
		
		System.out.println(compNum);
			
		int count = 0;//���� Ƚ���� �ִ´�. x������ ���� Ƚ��
		int myNum = 0;
		while(true) {
	    while(true){
		System.out.println("���ڸ� �Է¼��� :");
		myNum = getUserInput();
		if(checkNumber(myNum)) {
		while(checkNumber(myNum)) {
				break;
			}else {
				System.out.println("�� �ڸ� ���ڵ��� ���� �ٸ��� �Է��� �ּ���.");
				myNum = getUserInput();
			}
			System.out.println(myNum);
		}
				
		System.out.println(myNum);
		
		while (true) {
		String result = "";
		int strike = 0;
		int ball = 0;
		
			
		int compNum1 = compNum / 100;
		int compNum2 = (compNum % 10) / 10;
		int compNum3 = compNum % 10;
		
		int myNum1 = myNum / 100;
		int myNum2 = (myNum % 10) / 10;
		int myNum3 = myNum % 10;
		
		if ((compNum1 == myNum1) {
			strike++;
		}esle
			System.out.println();
		}

		
		//compNum & myNum ��
		//������� ========== 1s 2b
		//�¾����� == �����մϴ�. ===== x������ ���߼̽��ϴ�.
		
	}
	
	public static boolean checkNumber(int number) {
		//���ڸ��� ��� �ٸ� �����ΰ� üũ�ϴ� ����
		int firstNum = number / 100;
		int secondNum = (number % 100) / 10;
		int thirthNum = number % 10;
		
		if ((firstNum != secondNum) && (firstNum != thirthNum) && (secondNum != thirthNum) && (firstNum != 0)) {
	
		    return true;
		}else {
			return false;
		}
	}

	
	
	public static int getHiddenNumber() {
			Random random = new Random();
			int num = random.nextInt(988);
			return num;
		}
		public static int getUserInput() {
	        
	       	Scanner scanner = new Scanner(System.in);
	    	int value = scanner.nextInt();
	    	return value;
	    }
}