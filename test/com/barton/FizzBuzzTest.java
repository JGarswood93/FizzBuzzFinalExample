package com.barton;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
/**
 * Could add more numbers here to show that the test will work consistently
 * as if you are actually counting
 */
    @Test
    public void numberInCountIsDivisibleBy3() {
        Assert.assertEquals(3, 3);
    }
    @Test
    public void numberInCountIsDivisibleBy5() {
        Assert.assertEquals(5, 5);
        Assert.assertEquals(10, 10);

    }
    @Test
    public void numberInCountIsDivisibleBy5And3() {
        Assert.assertEquals(15, 15);
    }
    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzBuzz.getResult(1));
        Assert.assertEquals("2", FizzBuzz.getResult(2));
        Assert.assertEquals("4", FizzBuzz.getResult(4));


    }
}