import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PrimesTest {

    @Test
    public void testListPrimeNumbers() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(10);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingOne() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(1);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingTwo() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(2);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingThree() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(3);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingFour() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(4);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingFive() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(5);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingSix() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(6);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingSeven() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(7);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingEight() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(8);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingNine() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(9);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingTen() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(10);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingEleven() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(11);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingTwelve() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(12);
        ArrayList<Integer> expectedPrimes = new ArrayList<>();
        expectedPrimes.add(2);
        expectedPrimes.add(3);
        expectedPrimes.add(5);
        expectedPrimes.add(7);
        expectedPrimes.add(11);
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingThirteen() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(13);
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
    public void testListPrimeNumbersWithCeilingFourteen() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(14);
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
    public void testListPrimeNumbersWithCeilingFifteen() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(15);
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
    public void testListPrimeNumbersWithCeilingSixteen() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(16);
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
    public void testListPrimeNumbersWithCeilingSeventeen() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(17);
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
    public void testListPrimeNumbersWithCeilingEighteen() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(18);
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
    public void testListPrimeNumbersWithCeilingNineteen() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(19);
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
    public void testListPrimeNumbersWithCeilingTwenty() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(20);
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
    public void testListPrimeNumbersWithCeilingTwentyOne() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(21);
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
    public void testListPrimeNumbersWithCeilingTwentyTwo() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(22);
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
    public void testListPrimeNumbersWithCeilingTwentyThree() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(23);
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
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingTwentyFour() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(24);
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
        Assertions.assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testListPrimeNumbersWithCeilingTwentyFive() {
        ArrayList<Integer> primes = Primes.listPrimeNumbers(25);
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
        Assertions.assertEquals(expectedPrimes, primes);
    }
}