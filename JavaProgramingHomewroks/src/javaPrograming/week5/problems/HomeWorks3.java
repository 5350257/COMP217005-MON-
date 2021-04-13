package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks3 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int dap = rd.nextInt(101) - 50;
		System.out.print("예측값 : ");
		int userInput = sc.nextInt();
		boolean run = true;
		int i = 1;
		while (run) {

			if (dap > userInput) {
				i++;
				System.out.println("난수는 더 큰 값입니다. 다시 시도해주세요");
				System.out.print("예측값 : ");
				userInput = sc.nextInt();
			} else if (dap < userInput) {
				i++;
				System.out.println("난수는 더 작은 값입니다. 다시 시도해주세요");
				System.out.print("예측값 : ");
				userInput = sc.nextInt();
			} else {
				System.out.printf("총 %d회만에 맞췄다!. dap은 %d이다.", i, dap);
				run = false;
				sc.close();
			}
		}
	}
}
/*
		//사용자로부터 예측값 입력받기: 일치할때까지
		
		while(true){
			System.out.print("예측값: ");
			usr = s.nextInt();
			cnt++;//사용자로가 입력한다면 시도 횟수 한번 증가
			if(usr==randomNbr) //생성값과 입력값이 일치한다면 탈출
				break; 
			else if(usr>randomNbr) 
				System.out.println("랜덤 넘버는 좀 더 작은 값입니다. 다시 시도해주세요. ");
			else 
				System.out.println("랜덤 넘버는 좀 더 큰 값입니다. 다시 시도해주세요. ");
		}
		
		System.out.printf("정답입니다. 총 %d회만에 맞추셨습니다.\n", cnt);
		*/