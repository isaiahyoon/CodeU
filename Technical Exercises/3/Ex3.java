class Ex3 {
    int[] array;
    int size;

    public Ex3(int[] nums) {
        array = nums;
    }

    public int getSize() {
        return array.length;
    }

    public int nthLargest(int n) {
        if (n <= 0 || n > getSize()) {
            throw new Exception();
        } else {
            
        }
    }

    public static void main(String[] args) {

    }
}