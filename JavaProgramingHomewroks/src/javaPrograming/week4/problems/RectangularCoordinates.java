package javaPrograming.week4.problems;

import java.util.*;

public class RectangularCoordinates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점1의 x좌표 : ");
		double x1 = sc.nextDouble();
		System.out.print("점1의 y좌표 : ");
		double y1 = sc.nextDouble();
		System.out.print("점2의 x좌표 : ");
		double x2 = sc.nextDouble();
		System.out.print("점2의 y좌표 : ");
		double y2 = sc.nextDouble();
		
		if(x1==x2 || y1==y2) {
			System.out.println("직사각형이 아닙니다.");
			return;
		}else{
			double ab2 = 2*(Math.sqrt(Math.pow(x1-x2,2))+Math.sqrt(Math.pow(y1-y2,2)));
			double C = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
			double area = Math.sqrt(Math.pow(x1-x2,2))*Math.sqrt(Math.pow(y1-y2,2));
			System.out.printf("둘레의 길이 : %.2f\n",ab2);
			System.out.printf("대각선의 길이 : %.2f\n",C);
			System.out.printf("넓이 : %.2f",area);
		}
	}
	//다른 방법
//	width = x1-x2;
//	height = y1-y2;
//	
//	if(x1<x2){//가로 길이가 음수
//		width *= -1; //양수로 변환
//	}
//	
//	if(y1<y2){
//		width *= -1; 
//	}
//	
//	if((width==0)||(height==0))	System.out.println("직사각형이 아닙니다.");//가로나 세로가 0이면 직사각형이 아니라고 출력
//	else{
//		System.out.format("둘레의 길이: %.2f\n", 2*(width+height));
//		System.out.format("대각선의 길이: %.2f\n", Math.sqrt(Math.pow(width,2)+Math.pow(height,2)));
//		System.out.format("넓이: %.2f\n",width*height);
}
