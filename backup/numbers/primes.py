import math
import time

def list_prime_numbers(ceiling):
    if ceiling < 2:
        return []

    is_prime = [True] * (ceiling + 1)
    is_prime[0] = False
    is_prime[1] = False

    for i in range(2, int(math.sqrt(ceiling))+1):
        if is_prime[i]:
            for j in range(i*i, ceiling+1, i):
                is_prime[j] = False

    primes = []
    for i in range(2, ceiling+1):
        if is_prime[i]:
            primes.append(i)

    return primes

def run():
    ceiling = 10000000
    start_time = int(round(time.time() * 1000))
    primes = list_prime_numbers(ceiling)
    end_time = int(round(time.time() * 1000))
    duration = end_time - start_time
    print(f"Prime numbers up to {ceiling}:")
    # print(primes)
    print(f"Computation took {duration} milliseconds.")

run()