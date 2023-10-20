import java.util.ArrayList;

public class PrimeNumbers {
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

    public static int nextPrimeNumber(int num) {
        int nextNum = num + 1;
        while (!isPrimeNumber(nextNum)) {
            nextNum++;
        }
        return nextNum;
    }

    public static ArrayList<Integer> listPrimesUntil(int ceiling) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
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
        ArrayList<Integer> primes = listPrimesUntil(ceiling);
        long endTime = System.currentTimeMillis();
        System.out.println("The prime numbers up to " + ceiling);
        System.out.println("Computed in " + (endTime - startTime) + "ms");
    }
}