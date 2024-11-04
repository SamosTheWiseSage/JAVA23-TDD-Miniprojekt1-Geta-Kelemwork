package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.example.PrimeNumbers.isPrime;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {
    @Test
    @DisplayName("Testing that counter is not prime number")
    public void testCounterIsNotPrime() {
        int counterValue = 4;
        boolean result = isPrime(counterValue);
        assertFalse(result, "Counter should not be a prime number");
    }

    @Test
    @DisplayName("testing that counter is prime number")
    public void testCounterIsPrime() {
        int counterValue = 5;
        boolean result = isPrime(counterValue);
        assertTrue(result, "Counter should be a prime number");
    }
    @Test
    @DisplayName("testing that 0 is not prime number")
    public void testZeroIsNotPrime() {
        int counterValue = 0;
        boolean result = isPrime(counterValue);
        assertFalse(result, "0 should not be a prime number");
    }

    @Test
    @DisplayName("testing one is not a prime number")
    public void testOneIsNotPrime() {
        int counterValue = 1;
        boolean result = isPrime(counterValue);
        assertFalse(result, "1 should not be a prime number");
    }

    @Test
    @DisplayName("testing that 2 should be prime number")
    public void testTwoIsPrime() {
        int counterValue = 2;
        boolean result = isPrime(counterValue);
        assertTrue(result, "2 should be a prime number");
    }

    @Test
    @DisplayName("testing negative non prime numbers")
    public void testNegativeNumberIsNotPrime() {
        int counterValue = -5;
        boolean result = isPrime(counterValue);
        assertFalse(result, "-5 should not be a prime number");
    }

    @Test
    @DisplayName("Testing large prime number")
    public void testLargePrimeNumber() {
        int counterValue = 997;
        boolean result = isPrime(counterValue);
        assertTrue(result, "997 should be a prime number");
    }

    @Test
    @DisplayName("Testing larger non prime number")
    public void testLargeNonPrimeNumber() {
        int counterValue = 1000;
        boolean result = isPrime(counterValue);
        assertFalse(result, "1000 should not be a prime number");
    }

    @Test
    @DisplayName("Testing non prime numbers")
    public void testAnotherNonPrime() {
        int counterValue = 9;
        boolean result = isPrime(counterValue);
        assertFalse(result, "9 should not be a prime number");
    }

    @Test
    @DisplayName("testing Prime numbers")
    public void testAnotherPrime() {
        int counterValue = 11;
        boolean result = isPrime(counterValue);
        assertTrue(result, "11 should be a prime number");
    }

    // Test for printCount
    @Test
    @DisplayName("testing the print count")
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
    @DisplayName("testing to print the sum in console")
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
