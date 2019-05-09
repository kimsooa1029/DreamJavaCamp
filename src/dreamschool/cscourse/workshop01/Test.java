package dreamschool.cscourse.workshop01;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	

	public static void main(String[] args) {
		
		int comNum = getHiddenNumber();
		
		
		
		
		int count = 1;
		
		
		if(checkNumber(comNum)) {
			
			while(checkNumber(comNum)) {
				comNum = getHiddenNumber();
				
			}
			System.out.println(comNum);
			
		}else {
			System.out.println(comNum);
		}
		
		
		System.out.print("숫자를 입력하세요 : ");
		int myNum = getUserInput();
		
		if(checkNumber(myNum)) {
			
			while(checkNumber(myNum)) {
				System.out.print("모든 자리수가 다르도록 입력하여 주세요  : ");
				myNum = getUserInput();
				
			}
			System.out.println(myNum);
			
		}
		
		
		
		int strike = 0;
		
		int ball = 0;
		
		while(true) {
			
			
			int number1 = comNum / 100;
			int number2 = (comNum % 100 ) / 10;
			int number3 = comNum % 10;
			
			
			int mynum1 = myNum / 100;
			int mynum2 = (myNum % 100 ) / 10;
			int mynum3 = myNum % 10;
			
			
			
			if(checkNumber(myNum)) {
				
				while(checkNumber(myNum)) {
					System.out.print("모든 자리수가 다르도록 입력하여 주세요  : ");
					myNum = getUserInput();
					
				}
				System.out.println(myNum);
				
			}
			
			
			
			
			if(number1 == mynum1) {
				strike++;
				
				
			}
			if(number2 == mynum2) {
				strike++;
			}
			
			if(number3 == mynum3) {
				strike++;
			}
			if(number1 == mynum2 || number1 == mynum3){
				ball++;
			}
			if(number2 == mynum1 || number2 == mynum3){
				ball++;
			}
			if(number3 == mynum2 || number3 == mynum1){
				ball++;
			}
			
			System.out.println(strike + "S," + ball + "B");
			
			
			
			if(number1 == mynum1 && number2 == mynum2 && number3 == mynum3 ) {
				System.out.println("축하합니다." + count + "번 만에 맟추셨군요");
				break;
				
				
			}
			if(strike >= 3) {
				System.out.println("축하합니다." + count + "번 만에 맟추셨군요");
				break;
			}
			
			System.out.print(" 틀렸습니다. 다시 숫자를 입력하세요 : ");
			myNum = getUserInput();
			
			
			strike = 0;
			ball = 0;
			
			count++;
		}	
		
		
		//conNum 과 myNum을 비교
		//출력형식 --> 1S 2B
		//맞았으면 => 축하합니다.~~~ X 번 만에 맟우셨군요.
		
		
	}	
	public static boolean checkNumber(int number) {
		
		int number1 = number / 100;
		int number2 = (number % 100 ) / 10;
		int number3 = number % 10;
		
		if(number1 == number2 || number2 == number3 || number3 == number1 || number1 == 0) {
			
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
        
       	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
	}}