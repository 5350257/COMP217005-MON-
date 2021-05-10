package javaPrograming.week8.midterm1;

import java.util.*;

public class PP2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 단어를 입력하세요 : ");
		String eng = sc.next(); // 입력 받은 단어를 저장할 String 변수
		char[] alphabet = new char[26]; // 알파벳 배열 - 크기 : 52 (대문자 26개, 소문자 26개)
		int[] count = new int[alphabet.length]; // 각 알파벳의 사용 횟수 카운트 - 크기 : 알파벳 배열의 크기만큼
		eng = eng.toUpperCase();
		// 배열 초기화
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (i + 65); // 대문자 저장 - 대문자는 아스키 코드 65부터 26개
		}

		// 카운트 시작
		for (int i = 0; i < eng.length(); i++){
			for (int j = 0; j < alphabet.length; j++){
				if (eng.charAt(i) == alphabet[j]){
					count[j]++; // 카운트 배열의 j번째 카운트를 1 증가
				}
			}
		}

		// 각각의 알파벳이 사용된 횟수 출력
		System.out.println("알파벳이 사용된 횟수를 출력합니다.");
		for (int i = 0; i < alphabet.length; i++) {
			if (count[i] != 0) {
				System.out.println(alphabet[i] + " = " + count[i]);
			}

		}
	}
}