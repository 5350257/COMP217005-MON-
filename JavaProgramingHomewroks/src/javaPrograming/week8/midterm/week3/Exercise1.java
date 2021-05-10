package javaPrograming.week8.midterm.week3;

import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int a = sc.nextInt();

		System.out.println("입력받은 정수의 2진수 표현 : " + Integer.toBinaryString(a));
//		>> , >>> 는 둘 다 비트 이동 연산자다. 그런데 >>>같은 경우 최상위 비트가 1이든 0이든 관계 없이 무조건 0으로 최상위 비트를 채운다.
		if(a!=0) {
			if (a >>> 31 == 0) {
				System.out.printf("%d는(은) 양수입니다. 이 수의 절댓값은 %d이고, %d/4는 %d이며, 나머지는 %d입니다.",a,Math.abs(a),a,a/4,a%4);
			}else {
				System.out.printf("%d는(은) 음수입니다. 이 수의 절댓값은 %d이고, %d/4는 %d이며, 나머지는 %d입니다.",a,Math.abs(a),Math.abs(a),(Math.abs(a))/4,(Math.abs(a))%4);
			}
		}else {System.out.println("a는 0이다. 0은 양의 정수도, 음의 정수도 아니다. 0은 0. ");}
		
	}
}
