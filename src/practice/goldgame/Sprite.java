package practice.goldgame;

public abstract class Sprite {
	final String UP = "w";
	final String LEFT = "a";
	final String RIGHT = "d";
	final String DOWN = "s";
	int x;
	int y;
	String image;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	abstract void move(String c);
}