package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {

  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve1() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.ave1(2, 3), 0.01);
  }

  @Test
  public void allSum() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.allSum(1, 10), 0.01);
  }

  @Test
  public void testAve2() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.ave2(1, 10), 0.01);
  }

  @Test
  public void oddSum() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.oddSum(1, 10), 0.01);
  }

  @Test
  public void evenSum() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.evenSum(1, 10), 0.01);
  }

}
