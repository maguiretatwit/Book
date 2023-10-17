/**
 * 
 */
package book;

/**
 * 
 */
public class Book {

	final private String Title;
	final private String Auther;
	private static int copies=0;
	public Book(String t, String a) {
		 Title=t;
		 Auther=a;
		 copies++;
	}
	public String getTitle() {
		return Title;
	}
	public String getAuther() {
		return Auther;
	}
	public static int getCopiesSold() {
		return copies;
	}
	public String toString() {
		String returner=Title+" by "+Auther+" with "+copies+" copies sold";
		return(returner);
	}

}
