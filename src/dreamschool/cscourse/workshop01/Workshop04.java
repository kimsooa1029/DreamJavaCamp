package dreamschool.cscourse.workshop01;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        System.out.println(americano);
        System.out.print( " ī��� �ֹ� ���� : " );
        int cafelatte = getUserInput();
        System.out.println(cafelatte);
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagel = getUserInput();
        System.out.println(bagel);
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamcheese = getUserInput();
        System.out.println(creamcheese);
        
        System.out.println( "========= �ݾ� =========" );
        int americanoPrice = 2000 * americano;
        int cafelattePrice = 3000 * cafelatte;
        int bagelPrice = 1500 * bagel;
        int creamcheesePrice = 500 * creamcheese;
        System.out.println("�Ƹ޸�ī�� :" + americanoPrice + "��");
        System.out.println("ī��� :" + cafelattePrice + "��");
        System.out.println("���̱� :" + bagelPrice + "��");
        System.out.println("ũ��ġ�� :" + creamcheesePrice + "��");
        
        int total = americanoPrice + cafelattePrice + bagelPrice + creamcheesePrice;
       
        System.out.println( "======================" );
        System.out.println("�� ���� �ݾ� :" + total);
        
        if (total < 12000) {
        	System.out.println("����Ʈ ���� : 0��");
        }else if (total >= 30000){
        	System.out.println("����Ʈ ���� :" + total / 100 * 2);
        }else if (total >= 12000) {
        	System.out.println("����Ʈ ���� : " + total / 100 * 1);
        
        }
       
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
