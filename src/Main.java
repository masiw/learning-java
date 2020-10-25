import maths.Primes;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Is Prime:");
		long max = Long.parseLong(args[0]);
		for (long i = 2; i <= max; i++) {
			if (Primes.isPrime(i)) {
				System.out.println(i);
			}
		}
	}

}
