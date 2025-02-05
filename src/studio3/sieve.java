package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Pick a whole number (n): ");
		int n = in.nextInt(); 

		if (n < 2) {
			System.out.println("No primes available");
		}

		boolean[] SievePrime = new boolean[n+1];

		for (int i = 2; i <= n; i++) {
			SievePrime[i] = true; 
		}

		for (int i = 2; i * i <= n; i++) {
			if (SievePrime[i]) { 
				for(int s = i * i; s<=n; s += i) {
					SievePrime[s] = false; 
				}
			}

		}
		for (int i = 2; i<= n; i++) {
			if (SievePrime[i] == true) {
				System.out.print(i + ", ");

			}

		}


	}
}