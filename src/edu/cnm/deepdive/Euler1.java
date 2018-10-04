package edu.cnm.deepdive;

public class Euler1 {

  public static void main(String[] args) {
    System.out.println(Sum(1000));
  }

  public static int Sum(int total) {
    int sum = 0;
    for (int i = 0; i < total; i++) {
      if (i % 5 == 0 || i % 3 == 0)
      sum += i;

    }

      return sum;
    }
}