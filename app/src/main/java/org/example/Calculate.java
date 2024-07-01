package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave1(int a, int b) {
    return (a + b) / 2.0;
  }

  public int allSum(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public double ave2(int start, int end) {
    int sum = allSum(start, end);
    int count = end - start + 1;
    return (double) sum / count;
  }

  public int oddSum(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int evenSum(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

}
