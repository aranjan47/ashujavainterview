package CollectionInterview.HashSet;

import java.util.Set;

public class duplicateKey {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3};

        Set<Integer> seen = new HashSet<>();

        for (int value : arr) {

            if (!seen.add(value)) {
                System.out.println("Duplicate: " + value);
            }
        }
    }
}
