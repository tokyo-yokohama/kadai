package adapter;

class Bank {
	private int deposit;
	private int debt;

	public Bank(int deposit, int debt) {
		this.deposit = deposit;
		this.debt = debt;
	}
	public int getDeposit() {
		return this.deposit;
	}
	public int getDebt() {
		return this.debt;
	}
}
