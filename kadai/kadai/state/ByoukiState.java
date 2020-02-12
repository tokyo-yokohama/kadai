package state;

class ByoukiState extends DogState{
	private static ByoukiState s = new ByoukiState();
	private ByoukiState() {}

	public static DogState getInstance() {
		return s;
	}
	public void tukareta(Dog moto) {
		//自分に戻る為何もしない
	}
	public void tabeta(Dog moto) {
		//食事したら普通状態に戻る
		moto.changeState(FutsuuState.getInstance());
	}
	public String toString() {
		return "病気状態";
	}
}
