package javaPrograming.week5.problems;

import java.util.*;

public class HomeWorks4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char input;
		do {
			System.out.print("문자 : ");
			input = sc.next().charAt(0);

			if (input!='Q' && input!='q') {
				System.out.println("입력하신 문자는 \'" + input + "\'입니다.");
			}

		} while (input!='Q' && input!='q');

		System.out.println("프로그램을 종료합니다.");
		sc.close();
		return;

	}

}
/*
char c = 'a';//while문을 do-while처럼 진행하기 위해 의미는 없지만 'a'로 초기화
//do-while이나 무한반복문을 사용한다면 초기화하지 않아도 무방

while(c!='Q' && c!='q'){
	System.out.print("문자: ");
	c = s.next().charAt(0);
	if(c!='Q' && c!='q')
		System.out.printf("입력하신 문자는 '%c'입니다. \n", c);
}

		


// 버전 2
do{
	System.out.print("문자: ");
	c = s.next().charAt(0);
	if(c!='Q' && c!='q')
		System.out.printf("입력하신 문자는 '%c'입니다. \n", c);
}while(c!='Q' && c!='q');



//버전3
while(true){
	System.out.print("문자: ");
	c = s.next().charAt(0);
	if(c=='Q' || c=='q')
		break;
	System.out.printf("입력하신 문자는 '%c'입니다. \n", c);
} 

System.out.println("프로그램을 종료합니다. ");
*/