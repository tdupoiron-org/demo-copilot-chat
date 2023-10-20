/**
 * Checks if a given number is a prime number.
 * Vérifie si un nombre donné est un nombre premier.
 * @param {number} num - The number to check. Le nombre à vérifier.
 * @returns {boolean} - True if the number is prime, false otherwise. Vrai si le nombre est premier, faux sinon.
 */
function isPrimeNumber(num) {
  if (num <= 1) {
    return false;
  }
  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
}

/**
 * Generates a prime number within a given range.
 * Génère un nombre premier dans une plage donnée.
 * @param {number} min - The minimum value of the range. La valeur minimale de la plage.
 * @param {number} max - The maximum value of the range. La valeur maximale de la plage.
 * @returns {number|null} - A prime number within the range, or null if no prime number is found. Un nombre premier dans la plage, ou null s'il n'y en a pas.
 */
function generatePrimeNumber(min, max) {
  for (let num = min; num <= max; num++) {
    if (isPrimeNumber(num)) {
      return num;
    }
  }
  return null;
}

/**
 * Lists all prime numbers up to a given ceiling value using the Sieve of Eratosthenes algorithm.
 * @param {number} ceiling - The maximum value to check for prime numbers.
 * @returns {number[]} - An array of all prime numbers up to the ceiling value.
 */
function listPrimeNumbers(ceiling) {
  const isPrime = new Array(ceiling + 1).fill(true);
  isPrime[0] = false;
  isPrime[1] = false;

  for (let i = 2; i <= Math.sqrt(ceiling); i++) {
    if (isPrime[i]) {
      for (let j = i * i; j <= ceiling; j += i) {
        isPrime[j] = false;
      }
    }
  }

  const primes = [];
  for (let i = 2; i <= ceiling; i++) {
    if (isPrime[i]) {
      primes.push(i);
    }
  }

  return primes;
}

function run() {
  const ceiling = 10000000;
  const startTime = Date.now();
  const primes = listPrimeNumbers(ceiling);
  const endTime = Date.now();
  const duration = endTime - startTime;
  console.log(`Prime numbers up to ${ceiling}:`);
  console.log(`Computation took ${duration} milliseconds.`);
}

run();