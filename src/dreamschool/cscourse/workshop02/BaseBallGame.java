package dreamschool.cscourse.workshop02;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	
	public static void main(String[] args) {
		//숫자의 자리가 모두 다른 숫자가 나올때 까지 계속 돌린다. 
		int compNum = getHiddenNumber();
		while (true) {
	    if(checkNumber(compNum)) {
			break;
	    }else{
	    	compNum = getHiddenNumber();
	    }
		}
		
		System.out.println(compNum);
			
		int count = 0;//맞춘 횟수를 넣는다. x번만에 맞춘 횟수
		int myNum = 0;
		while(true) {
	    while(true){
		System.out.println("숫자를 입력세요 :");
		myNum = getUserInput();
		if(checkNumber(myNum)) {
		while(checkNumber(myNum)) {
				break;
			}else {
				System.out.println("세 자리 숫자들을 각각 다르게 입력해 주세요.");
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

		
		//compNum & myNum 비교
		//출력형식 ========== 1s 2b
		//맞았으면 == 축하합니다. ===== x번만에 맞추셨습니다.
		
	}
	
	public static boolean checkNumber(int number) {
		//세자리수 모두 다른 숫자인가 체크하는 문제
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