package javaPrograming.weekD_1;

import java.util.*;

public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student();
		Subject subject [] = {new Korean(), new Engilsh(77), new Mathematics(), new Science(97)};
		for(Subject x : subject ) {
			student.report(x);
		}
		
	}

}

class Student {
	void report(Subject s) {
		System.out.format("%s: %d\n", s.getClass().getName(), s.getScore());
	}
}

class Subject {
	static Random rn = new Random();
	private int score;

	Subject() {
		this(rn.nextInt(100));
	}

	Subject(int score) {
		this.score = score;
	}

	int getScore() {
		return score;
	}
}

class Korean extends Subject {
	Korean() {
	}

	Korean(int score) {
		super(score);
	}
}

class Engilsh extends Subject {
	Engilsh() {
	}

	Engilsh(int score) {
		super(score);
	}
}

class Mathematics extends Subject {
	Mathematics() {
	}

	Mathematics(int score) {
		super(score);
	}
}

class Science extends Subject {
	Science() {
	}

	Science(int score) {
		super(score);
	}

}
