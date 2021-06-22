package javaPrograming.finalExam.week11;

import java.util.Scanner;

class Student {
	private String name;
	private int age;
	private double score;

	Student() {
		this("ȫ�浿", 20, 3.0);
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
		return String.format("�̸� : %s, ���� : %d, ���� : %.2f",getName(),getAge(),getScore());
	}

}

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.print("����: ");
		double score = sc.nextDouble();

		Student st = new Student(name, age, score);//�ֿܼ��� �Է¹��� ������ �л� ��ü ����
		System.out.println("�Է¹��� ������ �л� ���� �Ϸ�, �л� ���� -> "+st);
		
		System.out.println("�л��� ������ 5.7���� �����մϴ�. ");
		st.setScore(5.7);//������ 5.7���� �� ����		

		System.out.println("����� �л����� -> "+st);
	}
}