/**
 * Checks if a given number is prime.
 * @param {number} num - The number to check.
 * @returns {boolean} - True if the number is prime, false otherwise.
 * 
 * Vérifie si un nombre donné est premier.
 * @param {number} num - Le nombre à vérifier.
 * @returns {boolean} - Vrai si le nombre est premier, faux sinon.
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
 * Finds the next prime number after a given number.
 * @param {number} num - The number to start from.
 * @returns {number} - The next prime number.
 * 
 * Trouve le prochain nombre premier après un nombre donné.
 * @param {number} num - Le nombre à partir duquel commencer.
 * @returns {number} - Le prochain nombre premier.
 */
function nextPrimeNumber(num) {
  let nextNum = num + 1;
  while (!isPrimeNumber(nextNum)) {
    nextNum++;
  }
  return nextNum;
}

/**
 * Generates a list of prime numbers up to a given ceiling.
 * @param {number} ceiling - The maximum number to check for primality.
 * @returns {number[]} - An array of prime numbers up to the ceiling.
 * 
 * Génère une liste de nombres premiers jusqu'à un plafond donné.
 * @param {number} ceiling - Le nombre maximum à vérifier pour la primalité.
 * @returns {number[]} - Un tableau de nombres premiers jusqu'au plafond.
 */
function listPrimesUntil(ceiling) {
  const primes = [];
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
  const primes = listPrimestil(ceiling);
  const endTime = Date.now();
  console.log(`The prime numbers up to ${ceiling}`);
  console.log(`Computed in ${endTime - startTime}ms`);
}

run();