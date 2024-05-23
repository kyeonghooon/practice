package practice;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FileInputStream in = null;
		try {
			while (in.read() != -1) {
				System.out.println((char)in.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
