package javaPrograming.week8.midterm.week6;

public class Exercise4 {

	public static void main(String[] args) {
		int c = 0;
		int a = 0;

		for (int i = 2; i < 100; i++) {
			a = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					a++;
				}
			}
				if (a == 2) {
					c++;
					System.out.printf("%2d ",i);
					if (c % 5 == 0)
						System.out.println();
				}

			}
		}

	

}
