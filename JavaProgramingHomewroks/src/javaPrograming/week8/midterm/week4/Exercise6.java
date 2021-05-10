package javaPrograming.week8.midterm.week4;

public class Exercise6 {

	public static void main(String[] args) {
		int x = 4;
		int y = 7;

		System.out.println("Á¦°ö±Ù x : " + Math.sqrt(x));
		System.out.println("Á¦°ö±Ù y : " + Math.sqrt(y));
		System.out.println("x^y : " + Math.pow(x, y));
		System.out.println("y^x : " + Math.pow(y, x));

		System.out.println("Math.cos(90) :" + Math.cos(90));
		System.out.println("Math.sin(180) : " + Math.sin(180));
		System.out.println("Math.cos(Math.PI/2) :" + Math.cos(Math.PI / 2));
		System.out.println("Math.sin(Math.PI) :" + Math.sin(Math.PI));

		int r = 4;

		double circleArea = Math.PI * Math.pow(r, 2);
		
		System.out.printf("¿ø³ÐÀÌ : %.2f\n", circleArea);
		System.out.println("¿ø³ÐÀÌ : " + (int) circleArea);
	}

}
