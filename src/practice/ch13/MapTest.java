package practice.ch13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		String names[] = { new String("Kim"), new String("Choi"), new String("Park"), new String("Kim"), new String("Kim"), new String("Park"), };
		Map<String, Integer> counts = new HashMap<String, Integer>();
		for (String string : names) {
			if (counts.containsKey(string)) {
				counts.replace(string, counts.get(string) + 1);
			} else {
				counts.put(string, 1);
			}
		}
		for (String string : counts.keySet()) {
			System.out.println(string + " : " + counts.get(string) + "회");
		}
	}

}
