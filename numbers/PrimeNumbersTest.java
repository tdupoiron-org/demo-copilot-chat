import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PrimeNumbersTest {

    @Test
    public void testListPrimesUntilWithCeilingOne() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(1);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingTwo() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(2);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingThree() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(3);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingFour() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(4);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingFive() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(5);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingSix() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(6);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingSeven() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(7);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingEight() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(8);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingNine() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(9);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingTen() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(10);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingEleven() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(11);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingTwelve() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(12);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingThirteen() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(13);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingFourteen() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(14);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingFifteen() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(15);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingSixteen() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(16);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingSeventeen() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(17);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        expectedPrimes.add(17);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingEighteen() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(18);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        expectedPrimes.add(17);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingNineteen() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(19);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        expectedPrimes.add(17);
        expectedPrimes.add(19);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingTwenty() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(20);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        expectedPrimes.add(17);
        expectedPrimes.add(19);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingThirty() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(30);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        expectedPrimes.add(17);
        expectedPrimes.add(19);
        expectedPrimes.add(23);
        expectedPrimes.add(29);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingForty() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(40);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        expectedPrimes.add(17);
        expectedPrimes.add(19);
        expectedPrimes.add(23);
        expectedPrimes.add(29);
        expectedPrimes.add(31);
        expectedPrimes.add(37);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimesUntilWithCeilingFifty() {
        ArrayList<Integer> primes = PrimeNumbers.listPrimesUntil(50);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        expectedPrimes.add(13);
        expectedPrimes.add(17);
        expectedPrimes.add(19);
        expectedPrimes.add(23);
        expectedPrimes.add(29);
        expectedPrimes.add(31);
        expectedPrimes.add(37);
        expectedPrimes.add(41);
        expectedPrimes.add(43);
        expectedPrimes.add(47);
        Assertions.assertEquals(expectedPrimes, primes);
    }
}