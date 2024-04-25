package practice.goldgame;

public class Field {
	final int WIDTH = 10;
	final int HEIGHT = 10;
	String[][] field;

	public Field() {
		field = new String[WIDTH][HEIGHT];
		

	}

	public void showField() {
		System.out.println("# # # # # # # # # # # #");
		for (int i = 0; i < field.length; i++) {
			System.out.print("# ");
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j] == null) {
					field[i][j] = "  ";
				}
				System.out.print(field[i][j]);
			}
			System.out.println("#");
		}
		System.out.println("# # # # # # # # # # # #");
	}

}