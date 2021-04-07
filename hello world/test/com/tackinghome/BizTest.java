package com.tackinghome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BizTest {
  @Test
  void addStuff() {
    Biz biz = new Biz();
    
    assertEquals(0, biz.addStuff(0, 0));
    assertEquals(12, biz.addStuff(5, 7));
    assertEquals(-12, biz.addStuff(-5, -7));
    assertEquals(2, biz.addStuff(-5, 7));
  }
}
