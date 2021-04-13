package javaPrograming.week5.examples;

public class PrintHello5Times {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello World!");
		}
		System.out.println("----------------------------------");
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n----------------------------------");

		for (char a = 'A'; a <= 'Z'; a++) {
			System.out.print(a);
		}
		System.out.println("\n----------------------------------");

		for (int i = 11; i <= 127; i += 4) {
			System.out.print(i + " ");
		}
		System.out.println("\n----------------------------------");
		for (int i = 1; i <= 30; i++) {
			System.out.print(4 * i + 7 + " ");
		}

	}

}