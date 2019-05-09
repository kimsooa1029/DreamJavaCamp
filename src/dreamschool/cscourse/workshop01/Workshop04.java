package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// 문제 4.
// 커피 주문을 하려고 한다.
// 메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
// 그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
// 총 금액 12000원 이상 : 구매 금액의 1% 적립
// 총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );
        int americano = getUserInput();
        System.out.println(americano);
        System.out.print( " 카페라떼 주문 수량 : " );
        int cafelatte = getUserInput();
        System.out.println(cafelatte);
        System.out.print( " 베이글 주문 수량 : " );
        int bagel = getUserInput();
        System.out.println(bagel);
        System.out.print( " 크림치즈 주문 수량 : " );
        int creamcheese = getUserInput();
        System.out.println(creamcheese);
        
        System.out.println( "========= 금액 =========" );
        int americanoPrice = 2000 * americano;
        int cafelattePrice = 3000 * cafelatte;
        int bagelPrice = 1500 * bagel;
        int creamcheesePrice = 500 * creamcheese;
        System.out.println("아메리카노 :" + americanoPrice + "원");
        System.out.println("카페라떼 :" + cafelattePrice + "원");
        System.out.println("베이글 :" + bagelPrice + "원");
        System.out.println("크림치즈 :" + creamcheesePrice + "원");
        
        int total = americanoPrice + cafelattePrice + bagelPrice + creamcheesePrice;
       
        System.out.println( "======================" );
        System.out.println("총 구매 금액 :" + total);
        
        if (total < 12000) {
        	System.out.println("포인트 적립 : 0점");
        }else if (total >= 30000){
        	System.out.println("포인트 적립 :" + total / 100 * 2);
        }else if (total >= 12000) {
        	System.out.println("포인트 적립 : " + total / 100 * 1);
        
        }
       
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
