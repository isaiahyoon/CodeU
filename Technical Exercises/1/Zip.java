public class Zip {
 
    //Fill in the method "join". It returns a boolean array. The ith
    //value is that array(i.e.,array[i]) should be true if the ith
    //value in the first argument to join is divisible by the ith value
    //in the second argument to join. The returned boolean array should
    //be exactly as long as the shorter of the two arguments.
    //
    //Reminders:
    //
    // 1.An integer p is said to be "divisible by" an integer q when there
    // is some integer k such that q * k = p. This is the same as saying
    // "the remainder of p when divided by q is 0".
    // The remainder operator in Java is written with a percent sign:
    // "a%b" is the remainder of a when divided by b.
    //
    //2.The length of an array bar is stored in bar.length.
    //
    //3.New arrays are declared with the syntax:
    // float[]foo = new float[8];
    //
 
    static boolean[] join(int[] y, int[] z) {
        //STUDENTS: WRITE YOUR CODE HERE!
        boolean[] joined = new boolean[Math.min(y.length, z.length)];

        for (int i = 0; i < joined.length; i++) {
            joined[i] = (z[i] != 0 && (y[i] % z[i] == 0));
        }
        return joined;
    }
 
    static void printZip(boolean[] joined, int testNo) {
        System.out.println("Test " + testNo);
        for (int i = 0; i < joined.length; i++) {
            if (joined[i]) {
                System.out.print("T");
            } else {
                System.out.print("F");
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        //STUDENTS, ADD ADDITIONAL TEST CASES BELOW

        // expect FFFFTFT
        int euler[] = {2, 7, 18, 28, 18, 28, 45, 90, 45};
        int jenny[] = {8, 6, 7, 5, 3, 0, 9};
        boolean divisibles[] = join(euler, jenny);
        printZip(divisibles, 1);

        // expect TTTTTTTTT
        int tens[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int ten[] = {10, 10, 10, 10, 10, 10, 10, 10, 10};
        divisibles = join(tens, ten);
        printZip(divisibles, 2);

        // expect TTTTTTTTT
        int zeros[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int natural[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        divisibles = join(zeros, natural);
        printZip(divisibles, 3);

        // expect FFFFFFFFF
        divisibles = join(natural, zeros);
        printZip(divisibles, 4);

        // expect TFFFFTF
        divisibles = join(jenny, euler);
        printZip(divisibles, 5);
    }
}