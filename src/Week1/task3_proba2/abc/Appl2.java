package Week1.task3_proba2.abc;

import java.util.Arrays;
import java.util.List;

public class Appl2 {
    public static void main(String[ ] args) {
        String[ ] sa = { "one", "two", "three", "four" };
        List sList = Arrays.asList(sa); 		// make a List
        System.out.println("size " + sList.size( ));
        System.out.println("idx2 " + sList.get(2));
        sList.set(3, "six"); 			// change List
        sa[1] = "five"; 				// change array
        for (String s : sa) {
            System.out.print(s + " "); }
        System.out.println("\nsl[1] " + sList.get(1));
    }
}
