package iterator;

public class IteratorSampleX {

	public static void main(String[] args) {
		GameList glist = new GameList(20);
		glist.add(new Game("PUBG" , 10800));
		glist.add(new Game("荒野行動" , 7800));
		glist.add(new Game("Days Gone" , 5900));

		for(int i=0;i<glist.getNumberOfStock(); i++) {
			System.out.println(glist.getGame(i).getName());
		}
	}

}
