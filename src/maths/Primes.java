package maths;

public class Primes {

	public static boolean isPrime(double value) {
		for (long i = 2; i < Math.sqrt(value); i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}
