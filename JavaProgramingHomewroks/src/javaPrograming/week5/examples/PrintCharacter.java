package javaPrograming.week5.examples;

//문자하나를 입력받아 대문자/소문자/숫자/기타문자 중 하나 출력하기
//문자 하나 입력받기 : nextChar();는 없다. 그래서 문자열로 생각 s.next(); or s.nextLine();
/*
	#String class's methods
	-문자열1.equals(문자열);
	-문자열1.equalsIgnoreCase(문자열);
	-문자열1.charAt({index0~n-1}); : index+1 번째 문자 반환, index는 0부터 시작
	-문자열1.length(); : 문자열의 길이 반환. 
										ex) "JAVA".length(); = 4;
										String s = "Hello";
										s.charAt(4)= o;
*/
import java.util.*;

public class PrintCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 하나 : ");
		char c = sc.next().charAt(0);

		System.out.print(c + " ");

		if (c >= 'a' && c <= 'z') { 	   // == if(Character.isUpperCase(c)==true){
			System.out.print("소문자.");
		} else if (c >= 'A' && c <= 'Z') { // == if(Character.isLowerCase(c)==true){
			System.out.print("대문자");
		} else if (c >= '0' && c <= '9') { // == if(Character.isDigit(c)==true){
			System.out.print("숫자");
		} else {
			System.out.print("기타문자");
		}

	}
}