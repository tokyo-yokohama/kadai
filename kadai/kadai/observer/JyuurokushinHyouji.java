package observer;

class JyuurokushinHyouji implements Observer{
	public void update(Subject s) {
		print(((Suuchi)s).getValue());
	}
	private void print(int n) {
		System.out.println(n + "を16進数で表示します");
		//ここに16進数表示処理を作成する
		final String con = Integer.toHexString(n);
		System.out.println(con);
	}
}
