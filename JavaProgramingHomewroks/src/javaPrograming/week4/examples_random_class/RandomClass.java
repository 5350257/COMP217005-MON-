package javaPrograming.week4.examples_random_class;

import java.util.Random;

public class RandomClass{

	public static void main (String [] args){
		
		Random r = new Random();//난수 생성기를 만듦.
		
		/* (0<=x<n),, n은 괄호안의 숫자 */
		
		/* 랜덤 클래스를 이용하여 난수 생성 */
		
		//0이상 10 미만의 실수형 난수
		System.out.println(r.nextDouble()*10);
		// nextDouble()은 괄호안에 숫자를 넣을 수 없다.
		
		//0이상 9 이하의 정수형 난수
		System.out.println(r.nextInt(10));
		
		//-3이상 3이하의 정수형 난수
		System.out.println(r.nextInt(7)-3);
		
	}
}