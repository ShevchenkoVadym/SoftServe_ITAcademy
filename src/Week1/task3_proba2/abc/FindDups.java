package Week1.task3_proba2.abc;

import java.util.*;

public class FindDups {
	public static void main(String args[]) {
		// Set s = new HashSet();
		List s = new ArrayList();
		for (int i = 0; i < args.length; i++) {
			if (!s.add(args[i])) {
				System.out.println("Duplicate detected: " + args[i]);
			}
		}
		System.out.println(s.size() + " distinct words detected: " + s);
	}
}
