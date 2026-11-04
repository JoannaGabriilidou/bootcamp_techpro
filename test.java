public class test {
	public static void main(String[] args) {
		double pi = 3.14;
		double r = 5;
		double temp;
		int year = 2008;

		System.out.printf("Hello backend  %.2f\n", 2 * pi * r);
		System.out.printf("pi: %.2f\nr: %.2f\n", pi, r);

		temp = pi;
		pi = r;
		r = temp;

		System.out.printf("pi: %.2f\nr: %.2f\n", pi, r);

		temp = year / 4;

		if (temp % 2 == 0) {
			System.out.printf("%d is a leap year!\n", year);
		} else {
			System.out.printf("%d is not a leap year!\n", year);
		}

		int age = 20;
		if (age >= 21) {
			System.out.println("You are an adult");
		} else if (age >= 18) {
			System.out.println("You are almost an adult.");
		} else {
			System.out.println("You are a minor");
		}

		int n1 = 3;
		int n2 = 1;
		int n3 = 9;

		if (n1 >= n2 && n1 >= n3) {
			System.out.printf("The largest number between %d, %d and %d is: %d\n", n1, n2, n3, n1);
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.printf("The largest number between %d, %d and %d is: %d\n", n1, n2, n3, n2);
		} else {
			System.out.printf("The largest number between %d, %d and %d is: %d\n", n1, n2, n3, n3);
		}

		int i;

		for (i = 1; i <= 20; i++) {
			System.out.printf("%d\n", i);
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
				continue;
			}
			if (i % 3 == 0) {
				System.out.println("fizz");
			}
			if (i % 5 == 0) {
				System.out.println("buzz");
			}
		}
		// This is a test !
		int input1 = 5;
		int output1 = factorial(input1);
		System.out.println(output1);

		int input2 = 5;
		int output2 = factorial_re(input2);
		System.out.println(output2);

		int[] array = { 5, 9, 12, 16, 19 };
		System.out.printf("%d\n", binary_find(array, 16));

	}

	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

	public static int factorial_re(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial_re(n - 1);
	}

	public static int linear_find(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return 1;
			}
		}
		return 0;
	}

	public static int binary_find(int[] array, int key) {
		int start = 0;
		int stop = array.length - 1;
		if (array[start] == key)
			return 1;
		if (array[stop] == key)
			return 1;
		if (array[start] > key)
			return 0;
		if (array[stop] < key)
			return 0;

		int midpoint = (start + stop) / 2;

		while (array[midpoint] == key) {
			if (array[midpoint] > key) {
				stop = midpoint;
			} else {
				start = midpoint;
			}
			midpoint = (start + stop) / 2;
			if (midpoint == start || midpoint == stop)
				return 0;
		}

		return 1;
	}
}
