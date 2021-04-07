package com.tackinghome;

public class Main {
  private static final Biz biz = new Biz();

  public static void main(String... args) {
    biz.printStuff();

    int sum = biz.addStuff(5, 7);
    System.out.println("The sum of 5 and 7 is: " + sum);

    System.exit(0);
  }
}
