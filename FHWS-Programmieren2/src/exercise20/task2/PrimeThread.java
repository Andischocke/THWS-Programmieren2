package exercise20.task2;

import java.util.*;

public class PrimeThread extends Thread {
	public List<Integer> numberList = new ArrayList<>();
	public Map<Integer, Boolean> primeMap = new HashMap<>();

	public PrimeThread() {
	}

	public PrimeThread(List<Integer> numberList) {
		this.numberList.addAll(numberList);
	}

	@Override
	public void run() {
		calculatePrimeMap();
	}

	public void calculatePrimeMap() {
		Iterator<Integer> iterator = numberList.iterator();
		while (iterator.hasNext()) {
			int number = iterator.next();
			boolean isPrime = isPrime(number);
			primeMap.put(number, isPrime);
		}
	}

	public boolean isPrime(int number) {
		boolean prime = true;
		if (number < 2) {
			prime = false;
		} else {
			for (int divisor = 2; divisor < number; divisor++) {
				if (number % divisor == 0) {
					prime = false;
					break;
				}
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		List<Integer> numberList0 = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			numberList0.add(i);
		}
		List<Integer> numberList1 = new ArrayList<Integer>();
		for (int i = 10; i < 20; i++) {
			numberList1.add(i);
		}

		PrimeThread prime0 = new PrimeThread(numberList0);
		PrimeThread prime1 = new PrimeThread(numberList1);
		try {
			prime0.start();
			prime1.start();
			prime0.join();
			prime1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Map<Integer, Boolean> primeMap = new HashMap<>();
		primeMap.putAll(prime0.primeMap);
		primeMap.putAll(prime1.primeMap);
		System.out.println(primeMap);
	}
}