package org.example;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    /*
     * 1. accept empty string
     * 2. accept one number in input string
     * 3. accept two numbers in input string
     * 4. throw error if numbers in string are more than two
     * 5. throw an error if a non-number is passed in string
     * */

    @Test
    public void inputStringIsEmptyAndShouldReturnZero() {
        Assert.assertEquals(0, StringCalculator.sum(""));
    }

    @Test
    public void inputStringIsHavingOneNumberAndShouldReturnThatNumber() {
        Assert.assertEquals(1, StringCalculator.sum("1"));
        Assert.assertEquals(2, StringCalculator.sum("2"));
        Assert.assertEquals(100, StringCalculator.sum("100"));
    }

    @Test
    public void inputStringIsHavingTwoNumberAndShouldReturnTheirSum() {
        Assert.assertEquals(3, StringCalculator.sum("1,2"));
    }

    @Test
    public void throwAnExceptionIfStringHasMoreThanTwoNumbers() {
        Assert.assertThrows(RuntimeException.class, () -> StringCalculator.sum("1,2,3"));
    }

    @Test
    public void throwAnExceptionIfStringHasNonNumericValue() {
        Assert.assertThrows(RuntimeException.class, () -> StringCalculator.sum("1,x"));
    }

}
