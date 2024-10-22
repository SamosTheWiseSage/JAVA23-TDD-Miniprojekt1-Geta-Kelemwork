package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.example.PrimeNumbers.isPrime;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {
    @Test
    public void testCounterIsNotPrime() {
        int counterValue = 4;
        boolean result = isPrime(counterValue);
        assertFalse(result, "Counter should not be a prime number");
    }

    @Test
    public void testCounterIsPrime() {
        int counterValue = 5;
        boolean result = isPrime(counterValue);
        assertTrue(result, "Counter should be a prime number");
    }
    @Test
    public void testZeroIsNotPrime() {
        int counterValue = 0;
        boolean result = isPrime(counterValue);
        assertFalse(result, "0 should not be a prime number");
    }

    @Test
    public void testOneIsNotPrime() {
        int counterValue = 1;
        boolean result = isPrime(counterValue);
        assertFalse(result, "1 should not be a prime number");
    }

    @Test
    public void testTwoIsPrime() {
        int counterValue = 2;
        boolean result = isPrime(counterValue);
        assertTrue(result, "2 should be a prime number");
    }

    @Test
    public void testNegativeNumberIsNotPrime() {
        int counterValue = -5;
        boolean result = isPrime(counterValue);
        assertFalse(result, "-5 should not be a prime number");
    }

    @Test
    public void testLargePrimeNumber() {
        int counterValue = 997;
        boolean result = isPrime(counterValue);
        assertTrue(result, "997 should be a prime number");
    }

    @Test
    public void testLargeNonPrimeNumber() {
        int counterValue = 1000;
        boolean result = isPrime(counterValue);
        assertFalse(result, "1000 should not be a prime number");
    }

    @Test
    public void testAnotherNonPrime() {
        int counterValue = 9;
        boolean result = isPrime(counterValue);
        assertFalse(result, "9 should not be a prime number");
    }

    @Test
    public void testAnotherPrime() {
        int counterValue = 11;
        boolean result = isPrime(counterValue);
        assertTrue(result, "11 should be a prime number");
    }

    // Test for printCount
    @Test
    public void testPrintCount() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        PrimeNumbers.printCount();
        String output = outContent.toString();
        assertTrue(output.contains("Prime numbers between 0 and 1000:"));
        assertTrue(output.contains("Hej, det finns"));
        assertTrue(output.contains("primtal mellan 0 och 1000"));
        System.setOut(System.out);
    }
    @Test
    public void testPrintSum() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int sum = 17;
        PrimeNumbers.printSum(sum);
        String expectedOutput = "Och den totala summan av dessa primtal är 17";
        assertEquals(expectedOutput, outContent.toString().trim());
        // Reset the standard output
        System.setOut(System.out);
    }
}
