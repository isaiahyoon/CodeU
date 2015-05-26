import java.util.Arrays;

class Ex1 {

    // find word using binary search
    public static boolean isInDictionary(String word) {
        int low = 0;
        int high = TrivialDictionary.size();

        while (high >= low) {
            int mid = (low + high) / 2;
            int comparison = word.compareTo(TrivialDictionary.wordAt(mid);
            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}