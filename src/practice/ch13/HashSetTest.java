package practice.ch13;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = new HashSet<>();
		s1.add("A");
		s1.add("B");
		s1.add("C");
		s2.add("A");
		s2.add("D");
		s1.addAll(s2);
		for (String string : s1) {
			System.out.print(string + " ");
		}
		System.out.println();
		System.out.println("------------------------");
		s1.remove("D");
		s1.retainAll(s2);
		for (String string : s1) {
			System.out.println(string + " ");
		}
	}

}
