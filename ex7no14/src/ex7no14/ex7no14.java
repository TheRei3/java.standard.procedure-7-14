package ex7no14;

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s==null)
			s = new Singleton();
		
		return s;
	}
}

public class ex7no14 {  //  352p
	public static void main(String[] args) {
//		Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
	}

}
