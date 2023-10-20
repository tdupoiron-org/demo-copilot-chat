
import math
import time

def is_prime_number(num):
    if num <= 1:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

def next_prime_number(num):
    next_num = num + 1
    while not is_prime_number(next_num):
        next_num += 1
    return next_num

def list_primes_until(ceiling):
    primes = []
    is_prime = [True] * (ceiling + 1)
    is_prime[0] = False
    is_prime[1] = False
    for i in range(2, int(math.sqrt(ceiling)) + 1):
        if is_prime[i]:
            for j in range(i * i, ceiling + 1, i):
                is_prime[j] = False
    for i in range(2, ceiling + 1):
        if is_prime[i]:
            primes.append(i)
    return primes

def run():
    ceiling = 10000000
    start_time = int(round(time.time() * 1000))
    primes = list_primes_until(ceiling)
    end_time = int(round(time.time() * 1000))
    print(f"The prime numbers up to {ceiling}")
    print(f"Computed in {end_time - start_time}ms")

run()