package dreamschool.cscourse.chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol [] id = new Idol [4];
		id[0] = new Idol("¼Ò³à½Ã´ë ", "ÅÂ¿¬");
		id[1] = new Idol("¾¾½ºÅ¸ ", "º¸¶ó");
		id[2] = new Idol("ºò¹ð ", "Áöµå·¡°ï");
		id[3] = new Idol("ºñ½ºÆ® ", "¾ç¿ä¼·");
		
		for(int i = 0; i < id.length; i++) {
			System.out.println( id[i].getName() + " : " + id[i].getGroup() );
	
		}
	}
}
