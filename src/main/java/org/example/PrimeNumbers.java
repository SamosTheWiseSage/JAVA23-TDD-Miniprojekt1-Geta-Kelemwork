package org.example;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PrimeNumbers {
static Random rand = new Random();
static int counter = rand.nextInt(1000)+1;
    static int amount = 0;
    public static void printCount(){
        System.out.println("Prime numbers between 0 and 1000:");

        int sumOfAll = 0;
        for (counter = 0; counter <= 1000; counter++) {
            if (counter >= 1 && isPrime(counter)) {
                sumOfAll += counter;
                amount += 1;
            }
        }
        System.out.println("Hej, det finns "+ amount +" primtal mellan 0 och 1000");
        printSum(sumOfAll);
    }
    public static void printSum( int sumOfAll){

        System.out.println("Och den totala summan av dessa primtal är " + sumOfAll);

    }
    public static void main(String[] args) {
printCount();
    }

    public static boolean isPrime(int num) {
       // System.out.println("hey this is used " + num);
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
