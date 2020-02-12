package iterator;

public class IteratorSample1 {

	public static void main(String[] args) {
		GameListAggregate gameListAggregate = new GameListAggregate();
		Iterator iterator = gameListAggregate.createIterator();
		gameListAggregate.add(new Game("ぷよぷよクエスト",3700));
		gameListAggregate.add(new Game("スプラチューン",7300));
		gameListAggregate.add(new Game("ロックマン",5400));
		gameListAggregate.add(new Game("電車でGO",5200));

		iterator.first();
		while(! iterator.isDone()) {
			Game game = (Game)iterator.getItem();
			System.out.println(game.getName());
			iterator.next();
		}
	}
}
