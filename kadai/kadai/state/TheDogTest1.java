package state;

public class TheDogTest1 {

	public static void main(String[] args) {
		Dog pochi = new Dog();

		pochi.print();
		//楽しい状態

		pochi.roudou();
		pochi.print();
		//普通状態

		pochi.roudou();
		pochi.print();
		//イライラ状態
		pochi.roudou();
		pochi.print();
		//病気状態
		pochi.roudou();
		pochi.print();
		//病気状態

		pochi.shokuji();
		pochi.print();
		//普通状態
	}

}
