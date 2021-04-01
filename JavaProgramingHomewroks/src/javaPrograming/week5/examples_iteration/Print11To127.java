package javaPrograming.week5.examples_iteration;

public class Print11To127 {

	public static void main(String[] args) {
		int num = 11;
		
		for(int i =0;num<128;i++) {
			System.out.println(num);
			num +=4;	
		}
//		for(int i =0;i<30;i++) {
//			num -=4;
//			System.out.println(num);
//
//		}
		for(int i =0;num>11;i++) {
			num -=4;
			System.out.println(num);

		}
	}

}
