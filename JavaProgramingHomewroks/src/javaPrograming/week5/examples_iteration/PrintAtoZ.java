package javaPrograming.week5.examples_iteration;

public class PrintAtoZ {

	public static void main(String[] args) {

		char alpha = 'A';
		for(int i = 0; i<26; i++) {
			System.out.print(alpha+ " ");
			alpha+=1;
		}
	}

}
