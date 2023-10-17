package book;

public class Main {

	
	public Main() {
		
	}

	public static void main(String[] args) {
		Book a;
		Book b;
		Book c;
		a=new Book("a", "a");
		b=new Book("b","b");
		c=new Book("a","a");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());


	}

}
