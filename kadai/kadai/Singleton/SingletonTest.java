package Singleton;

public class SingletonTest {
	public static void main(String[] args) {
	Renban renban1 = Renban.getInstance();
	renban1.print();
	}
}

class Renban{
	private static Renban seizou = new Renban();


	public static Renban getInstance() {
		return seizou;
	}
	public void s(int ren) {
		for(int i=1; i<=9999; i++) {
			System.out.println(String.format("%04d",i));
		}
	}
	public void print() {
		System.out.println("+---------------+");

		for(int i=1; i<=9999; i++) {
			System.out.println(String.format( "製造番号:"+ "%04d",i));
		}
	}
}
