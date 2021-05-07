package pl.michalrola._5_Generics.Item26;

import java.util.*;

public class Main {
    // Raw collection type - don't do this!
    // My stamp collection. Contains only Stamp instances.
    private final Collection stamps = new ArrayList();

    // Fails at runtime - unsafeAdd method uses a raw type (List)!
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0); // Has compiler-generated cast
    }

    private void dontUseRawTypes() {
        // Erroneous insertion of coin into stamp collection
        stamps.add(new Coin()); // Emits "unchecked call" warning

        // Raw iterator type - don't do this!
//        for (Iterator i = stamps.iterator(); i.hasNext(); )
//            Stamp stamp = (Stamp) i.next(); // Throws ClassCastException stamp.cancel();
    }

    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    // Use of raw type for unknown element type - don't do this!
//    static int numElementsInCommon(Set s1, Set s2) {
//        int result = 0;
//        for (Object o1 : s1)
//            if (s2.contains(o1))
//                result++;
//        return result;
//    }

    // Uses unbounded wildcard type - typesafe and flexible
    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        // Legitimate use of raw type - instanceof operator
        Set o = new TreeSet<>();
        if (o instanceof Set) { // Raw type
            Set<?> s = (Set<?>) o; // Wildcard type
        }
        return 0;
    }

    private static class Coin {
    }

    private class Stamp {
    }
}
