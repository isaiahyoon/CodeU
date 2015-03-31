class Collatz {
  // Consider a sequence of positive integers starting with x. If x is
  // even, the next integer in the sequence is x/2. If x is odd, the
  // next integer in the sequence is 3*x+1. The sequence stops when it
  // reaches 1.
  //
  // For example, if x is 7, the sequence is
  //
  // 7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1 
  //
  // Fill in the function loopCount so that it returns the length of
  // the sequence starting from x.
  static int loopCount(int x) {
    // STUDENTS: FILL IN CODE HERE!
    if (x == 1) {
      return 1;
    } else if (x % 2 == 0) {
      return 1 + loopCount(x/2);
    } else {
      return 1 + loopCount(3*x+1);
    }
  }

  // Using loopCount, fill in the function maxLoop so that it returns
  // the maximum sequence length for any sequence that starts with a
  // number greater than or equal to x and less than y.
  static int maxLoop(int x, int y) {
    // STUDENTS: FILL IN CODE HERE!
    int maxLength = 0;
    int currLength;
    for (int i = x; i < y; i++) {
      currLength = loopCount(i);
      if (currLength > maxLength) {
        maxLength = currLength;
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    System.out.println(maxLoop(1,100000));
  }
}
