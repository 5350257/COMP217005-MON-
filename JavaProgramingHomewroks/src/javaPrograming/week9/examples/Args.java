package javaPrograming.week9.examples;

public class Args {

	public static void main(String[] args) {

		for (String x : args) {
			System.out.print(x + " ");
		}
	}

	static void sortArr(String[] args) {
		for (int i = 0; i < args.length; i++) {
			for (int j = i + 1; j < args.length; j++)
				if (args[i].compareToIgnoreCase(args[j]) > 0) {
					String t = args[i];
					args[i] = args[j];
					args[j] = t;
				}
		}
	}
}