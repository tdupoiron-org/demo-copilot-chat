import java.util.ArrayList;

public class Primes {
    /**
     * Checks if a given number is a prime number.
     * Vérifie si un nombre donné est un nombre premier.
     * @param num - The number to check. Le nombre à vérifier.
     * @return True if the number is prime, false otherwise. Vrai si le nombre est premier, faux sinon.
     */
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Generates a prime number within a given range.
     * Génère un nombre premier dans une plage donnée.
     * @param min - The minimum value of the range. La valeur minimale de la plage.
     * @param max - The maximum value of the range. La valeur maximale de la plage.
     * @return A prime number within the range, or null if no prime number is found. Un nombre premier dans la plage, ou null s'il n'y en a pas.
     */
    public static Integer generatePrimeNumber(int min, int max) {
        for (int num = min; num <= max; num++) {
            if (isPrimeNumber(num)) {
                return num;
            }
        }
        return null;
    }

    /**
     * Lists all prime numbers up to a given ceiling value using the Sieve of Eratosthenes algorithm.
     * @param ceiling - The maximum value to check for prime numbers.
     * @return An array of all prime numbers up to the ceiling value.
     */
    public static ArrayList<Integer> listPrimeNumbers(int ceiling) {
        boolean[] isPrime = new boolean[ceiling + 1];
        for (int i = 0; i <= ceiling; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(ceiling); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= ceiling; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i <= ceiling; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        int ceiling = 10000000;
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> primes = listPrimeNumbers(ceiling);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Prime numbers up to " + ceiling + ":");
        System.out.println("Computation took " + duration + " milliseconds.");
    }
}