package FactoryMethod;

class Date{
	public static String today() {
		//製造年月日
		return "2020/01/20";

	}
}
class Counter{
	//製造番号
	private static int tvNum = 100;
	private static int radioNum = 76;
	public static int getTvNumber() {
		return tvNum++;
	}
	public static int getRadioNumber() {
		return radioNum++;
	}
}