package adapter;

public class AdapterDemo {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Print p = new PrintBank(300,100);
		//貯金額を表示
		p.printDeposit();
		//借金額を表示
		p.printDebt();

	}

}
