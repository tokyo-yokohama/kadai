package adapter;

class PrintBank extends Bank implements Print{
	public PrintBank(int deposit, int debt) {
		super(deposit, debt);
	}
	public void printDeposit() {
		System.out.println("貯金:" + this.getDeposit() + "円");
	}
	public void printDebt() {
		System.out.println("借金:" + this.getDebt() + "円");
	}
}
