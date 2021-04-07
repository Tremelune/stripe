package com.tackinghome;

public class Main {
  private static final Biz biz = new Biz();

  public static void main(String... args) {
    biz.printStuff();

    int a = 2;
    int b = 18;
    int sum = biz.addStuff(a, b);
    printSum(a, b, sum);

    System.exit(0);
  }

  private static void printSum(int a, int b, int sum) {
    String s = String.format("The sum of %s and %s is: %s", a, b, sum);
    System.out.println(s);
  }
}
