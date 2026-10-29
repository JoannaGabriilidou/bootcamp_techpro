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
	}
}
