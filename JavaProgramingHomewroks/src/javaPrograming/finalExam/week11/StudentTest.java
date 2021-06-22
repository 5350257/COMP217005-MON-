package javaPrograming.finalExam.week11;

import java.util.Scanner;

class Student {
	private String name;
	private int age;
	private double score;

	Student() {
		this("홍길동", 20, 3.0);
	}

	Student(String name, int age, double score) {
		setName(name);
		setAge(age);
		setScore(score);
	}
	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	double getScore() {
		return score;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		if (age >= 0 && age < 200) {
			this.age = age;
		} else {
			this.age = 20;
		}
	}

	void setScore(double score) {
		if (score >= 0 && score <= 4.3) {
			this.score = score;
		} else {
			this.score = 3.0;
		}

	}
	public String toString() {
		return String.format("이름 : %s, 나이 : %d, 학점 : %.2f",getName(),getAge(),getScore());
	}

}

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("학점: ");
		double score = sc.nextDouble();

		Student st = new Student(name, age, score);//콘솔에서 입력받은 정보로 학생 객체 생성
		System.out.println("입력받은 정보로 학생 생성 완료, 학생 정보 -> "+st);
		
		System.out.println("학생의 학점을 5.7으로 변경합니다. ");
		st.setScore(5.7);//학점을 5.7으로 재 설정		

		System.out.println("변경된 학생정보 -> "+st);
	}
}