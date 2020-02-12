package FactoryMethod;

class Client {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Koujyou koujyou1 = new TvKoujyou();
		Koujyou koujyou2 = new RadioKoujyou();

		//ここで必要な情報を出力する
		Seihin[] array = new Seihin[3];
		array[0] = koujyou1.create();
		array[1] = koujyou2.create();
		array[2] = koujyou1.create();

		for(int i = 0; i < array.length; ++i) {
			array[i].print();
		}
	}

}
