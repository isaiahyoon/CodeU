import java.util.Arrays;

class Vector {
    int[] array;

    public Vector(int[] nums) {
        array = nums;
    }

    public int[] getArray() {
        return array;
    }

    public int nthLargest(int n) {
        int[] arr = getArray();

        // sort array
        Arrays.sort(arr);

        // get nth largest
        return arr[arr.length - n];
    }

    public static void main(String[] args) {
        // Test cases
        int[] test = {5, 3, 9, 4, 3, 3, 8, 3, 3};
        Vector v = new Vector(test);
        System.out.println("Test array: " + Arrays.toString(test));
        System.out.print("nthLargest(1) (Should be 9): ");
        System.out.println(v.nthLargest(1));
        System.out.print("nthLargest(4) (Should be 4): ");
        System.out.println(v.nthLargest(4));
    }
}   