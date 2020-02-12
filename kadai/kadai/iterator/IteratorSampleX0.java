package iterator;

public class IteratorSampleX0 {

	public static void main(String[] args) {
		Game[] games = new Game[20];
		int num = 0;

		games[num] = new Game("どうぶつの森",5400);
		num += 1;
		games[num] = new Game("マインクラフト",3300);
		num += 1;
		games[num] = new Game("モンスターハンター",5500);
		num += 1;

		for (int i=0; i <num; i++) {
			System.out.println(games[i].getName());
		}
	}

}
