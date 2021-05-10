package javaPrograming.week8.midterm.week6;

public class Exercise6 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("~~");
		}

		int[] arr = new int[args.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);

		}
		
		System.out.println("Â¦¼ö");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
