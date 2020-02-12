package iterator;

public class GameList {
	private Game[] list;
	private int numberOfStock;

	public GameList(int number) {
		list = new Game[number];
		numberOfStock = 0;
	}

	public void add(Game game) {
		list[numberOfStock] = game;
		numberOfStock += 1;
	}
	public Game getGame(int number) {
		return list[number];
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
}
