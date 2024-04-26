package basic.practice;

public class Dice {
	private int value;
	String name;
	
	public Dice(String name) {
		this.name = name;
	}

	public void roll() {
		this.value = (int) (Math.random() * 6) + 1;
		System.out.print(name + "= " + value + " ");
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
