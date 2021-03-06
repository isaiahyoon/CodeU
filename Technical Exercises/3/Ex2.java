import java.util.Arrays;

class Ex2 {

    public static boolean hasMajority(int[] nums) {
        // empty case
        if (nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);

        int count = 0;
        int currNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (currNum != nums[i]) {
                currNum = nums[i];
                count = 1;
            } else {
                count++;
            }
            if (count > nums.length/2) {
                // majority found
                return true;
            }
        }
        return false;
    }

    

    public static void main(String[] args) {

        // Exercise 2 Tests
        // expected output:
        // true
        // false
        // false
        // true

        int[] a = {1, 2, 3, 3, 3};
        System.out.println(hasMajority(a));
        int[] b = {1, 2, 3, 3, 5};
        System.out.println(hasMajority(b));
        int[] c = {1, 2, 3, 4, 5};
        System.out.println(hasMajority(c));
        int[] d = {1};
        System.out.println(hasMajority(d));
    }
}