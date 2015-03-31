public class Filter {
    // Write a function named "evens" that takes as input an array of
    // ints and returns a different array of ints containing
    // only the even elements of the input.
    public static int[] evens(int[] input) {
        // Here are some reminders:
        //
        // You can find input's length using input.length.
        // You can find the remainder of a division using %. For instance,
        // 11 % 3 ⇒ 2
        // 25 % 4 ⇒ 1
        //
        // You can declare a new array of integers with the syntax:
        // int[]var_name = new int[n];
        //
        // For example:
        // int[] clown = new int[10]; //creates an array named clown of 10 integers(clown[0] through clown[9])
        //
        //STUDENTS,WRITE CODE HERE.

        int[] temp = new int[input.length];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if (input[i] % 2 == 0) {
                temp[j] = input[i];
                j++;
            }
        }

        // adjust array size
        int[] evenArray = new int[j];
        for (int k = 0; k < evenArray.length; k++) {
            evenArray[k] = temp[k];
        }
        return evenArray;
    }
 
    public static void main(String[] args) { //
        // Expected output:
        // test1 results:
        // 8
        // 6
        // 0
        // test2 results:
        // 2
        // 18
        // 28
        // 18
        // 28
        // 90
        // test3 results:
        // test4 results:
        // 0
        // test5 results:
        // //STUDENTS, ADD ADDITIONAL TEST CASES BELOW
        int[] test1 = {8, 6, 7, 5, 3, 0, 9};
        int[] ans = evens(test1);
        System.out.println("test1results:");
        for (int i = 0; i < ans.length; ++i) {
            System.out.println(ans[i]);
        }
        int[] test2 = {2, 7, 18, 28, 18, 28, 45, 90, 45};
        ans = evens(test2);
        System.out.println("test2results:");
        for (int i = 0; i < ans.length; ++i) {
            System.out.println(ans[i]);
        }
        int[] test3 = {};
        ans = evens(test3);
        System.out.println("test3results:");
        for (int i = 0; i < ans.length; ++i) {
            System.out.println(ans[i]);
        }
        int[] test4 = {0};
        ans = evens(test4);
        System.out.println("test4results:");
        for (int i = 0; i < ans.length; ++i) {
            System.out.println(ans[i]);
        }
        int[] test5 = {1};
        ans = evens(test5);
        System.out.println("test5results:");
        for (int i = 0; i < ans.length; ++i) {
            System.out.println(ans[i]);
        }
    }
}