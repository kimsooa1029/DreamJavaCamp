package dreamschool.cscourse.workshop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double computerScience = getUserInput();
        System.out.println(computerScience);
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double javaProgramming = getUserInput();
        System.out.println(javaProgramming);
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double math = getUserInput();
        System.out.println(math);
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double opela = getUserInput();
        System.out.println(opela);
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double badminton = getUserInput();
        System.out.println(badminton);
        System.out.println( "==============================" );
        
        double total = computerScience + javaProgramming + math + opela +badminton;
        
        System.out.println( "������ " + total / 5 + "�� �Դϴ�." );
        
        if(computerScience <= 2.5 || javaProgramming <= 2.5 || math <=2.5 || opela <=2.5 || badminton <= 2.5) {
        	 System.out.println("");
        }else if (total / 5 >= 3.7 ) {
        	System.out.println("���� �б� ���б� ������Դϴ�.");
        	
        }
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}
