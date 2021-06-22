package javaPrograming.finalExam.week14;

//파일에 학생의 이름, 점수 출력
import java.io.*;

class WriteTest {
	public static void main(String[] args) throws Exception {
		File file = new File("성적.txt");
		PrintWriter pw = new PrintWriter(file); // file 스트림에 연결

		pw.print("홍길동 ");
		pw.println("75");
		// pw.printf("%s %d\r\n", "둘리", 100);
		pw.println(String.format("%s %d", "둘리", 100));// 서식 지정이 필요할 경우
		pw.println(String.format("%s %d", "장발장", 50));// 서식 지정이 필요할 경우

		/*
		 * 파일 개행 - 윈도우즈: \r\n - 리눅스: \n - 맥: \r
		 */
		pw.close();// 자원 정리
		System.out.printf("%s 파일을 확인해주세요.\n", file.getName());
	}
}
