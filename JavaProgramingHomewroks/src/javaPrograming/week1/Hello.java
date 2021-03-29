package javaPrograming.week1;

//환경 설정 해주면 코딩하기 좋은 메모장 = Notepad++

class Hello{
	public static void main ( String [] args){

	
		System.out.print("자바"); //줄넘김 미제공
		System.out.print("프로그래밍");
	
		
  
		System.out.println("자바"); //줄넘김 제공
		System.out.println("프로그래밍"); 

		System.out.println(3+5);
		System.out.println("3+5="+3+5);
		System.out.println("3+5="+(3+5));
		System.out.println("안녕"+"하세요");
		
		
		System.out.printf("3 + 5 = %10d\n" , 3+5);
		//format specifier(서식 지정자) %d %s %f %c etc..  //사용 시 printf 사용
		System.out.printf("/'3 - 5 = %5d\n", 3-5);
		System.out.printf("3  5 = %10d\n", 35);
		System.out.format("3  5 = %d\n", 35);
	// format, printf 서식지정 가능
		 System.out.printf("Hello, World!");
		 System.out.print("\n");
		 System.out.printf("이호철");
		//객체 지향 언어이기 때문에 모니터한테 출력해달라고 부탁해야한다.
		//모니터  표준출력장치 == System.out
	
	}
}

	//콘솔창 명령어
	//컴파일  javac 컴파일할 파일명.java
	//하면 클래스 파일 생성
	//class 파일 실행  java class 파일명만 입력
