class Ex3 {

    public static int uglyK(int k) {
        int i = 0;
        while (k > 0) {
            i++;
            if (isUgly(i)) {
                k--;
            }
        }
        return i;
    }

    private static boolean isUgly(int n) {
        return n == 1 || ((n%2 == 0 || n%3 == 0 || n%5 == 0));
    }

    public static void main(String[] args) {
        // Test cases
        // 1 -> 1
        // 2 -> 2
        // 3 -> 3
        // 4 -> 4
        // 5 -> 5
        // 6 -> 6
        // 7 -> 8
        // 8 -> 9
        // 9 -> 10
        // 10 -> 12
        System.out.print("Testing 1: ");
        System.out.println(uglyK(1));
        System.out.print("Testing 2: ");
        System.out.println(uglyK(2));
        System.out.print("Testing 3: ");
        System.out.println(uglyK(3));
        System.out.print("Testing 4: ");
        System.out.println(uglyK(4));
        System.out.print("Testing 5: ");
        System.out.println(uglyK(5));
        System.out.print("Testing 6: ");
        System.out.println(uglyK(6));
        System.out.print("Testing 7: ");
        System.out.println(uglyK(7));
        System.out.print("Testing 8: ");
        System.out.println(uglyK(8));
        System.out.print("Testing 9: ");
        System.out.println(uglyK(9));
        System.out.print("Testing 10: ");
        System.out.println(uglyK(10));
    }
}