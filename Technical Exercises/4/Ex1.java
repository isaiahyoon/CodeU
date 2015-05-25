class Ex1 {

    // Done using method 1A, ignoring leading zeros
    public static int kPalindrome(int k) {
        int i = 0;
        while (k > 0) {
            i++;
            if (isPalindrome(Integer.toBinaryString(i))) {
                k--;
            }
        }
        return i;
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < (str.length()/2)+1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        // 1 -> 1
        // 2 -> 3
        // 3 -> 5
        // 4 -> 7
        // 5 -> 9
        // 6 -> 15
        // 7 -> 17
        // 8 -> 21
        // 9 -> 27
        System.out.print("Testing 1: ");
        System.out.println(kPalindrome(1));
        System.out.print("Testing 2: ");
        System.out.println(kPalindrome(2));
        System.out.print("Testing 3: ");
        System.out.println(kPalindrome(3));
        System.out.print("Testing 4: ");
        System.out.println(kPalindrome(4));
        System.out.print("Testing 5: ");
        System.out.println(kPalindrome(5));
        System.out.print("Testing 6: ");
        System.out.println(kPalindrome(6));
        System.out.print("Testing 7: ");
        System.out.println(kPalindrome(7));
        System.out.print("Testing 8: ");
        System.out.println(kPalindrome(8));
        System.out.print("Testing 9: ");
        System.out.println(kPalindrome(9));
    }
}