package state;

class Dog {
	private DogState myState;

	public Dog() {
		myState = TanoshiiState.getInstance();
	}

	public void roudou() {
		myState.tukareta(this);
	}

	public void shokuji() {
		myState.tabeta(this);
	}
	public void changeState(DogState d) {
		myState = d;
	}
	public void print() {
		System.out.print("現在、わたしは「");
		System.out.print(myState.toString());
		System.out.println("」です。");

	}
	/*
	public void print() {
		sSystem.out.println("楽しい状態");
		System.out.println("普通状態");
		System.out.println("いらいら状態");
	}*/

}
