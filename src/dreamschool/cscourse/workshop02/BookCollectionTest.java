package dreamschool.cscourse.workshop02;

public class BookCollectionTest {
    
    public static void main( String[] args ) {
     
    	Book [] book = {new Book( "���� �Ƿ��� ����", "���׳�" ),
        new Book( "�̰��� �۾��� ", "��Ű ���ν�" ),
        new Book( "9788946061392", "�α��� ã�Ƽ� ", "��ȿ��", 19500 ),
        new Book( "9788964150719", "�ι��� ���� ����", "������", 14800 ),
        new Book( "9791186561188", "ȥ�ڰ� �Ǵ� å��", "�ֿ�ȣ", 15000, "2016-02-29" ),
        new Book( "9788954637169", "���� ������ �ູ", "����", 14000, "2016-01-25" ),
        new Book( "9791185392080", "�Ϲ��� ���� 4�� ��", "���̽���", 14000, "2014-12-29" ),
    	};
    	
    	
    	System.out.println( "\n>> ���� ���" );
        for (int i = 0; i < book.length; i++) {
        book[i].printBookInfo();     
        }    
        
        System.out.println( "\n>> ������ 15000�� ������ ���� ã��" );
        for (int i = 0; i < book.length; i++) {
        	if (book[i].getPrice() <= 15000 && book[i].getPrice() > 0) {
        	book[i].printBookInfo();  
        	}
        }
        
        System.out.println( "\n>> ISBN ��ȣ�� 9788964150719�� ���� �����ϱ��ϰ� ��Ͽ��� �����ϱ�" );
        for (int i = 0; i < book.length; i++) {
        	if (book[i].getIsbn() == "9788964150719") 
            book[i].printBookInfo();     
            } 
        
        System.out.println( "\n>> ���� ���" );
        for (int i = 0; i < book.length; i++) {
        	if (book[i].getIsbn() != "9788964150719") 
            book[i].printBookInfo();    
        }
        
    }
}
