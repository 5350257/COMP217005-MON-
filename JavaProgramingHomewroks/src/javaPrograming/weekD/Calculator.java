package javaPrograming.weekD;


public class Calculator {
	static int sum(int x, int y) {
		return x + y;

	}

	int sum1(int x, int y) {
		return x + y;
	}

	double sum2(int x, int y) {
		return x + y;
	}

	int sum(double x, double y) {
		return (int) (x + y);
	}
	// method Overloading = method�� �̸��� ���� �Ű������� 1.Ÿ���� �ٸ��ų�,2.�Ű������� ���� �޶�� �Ѵ�. �ٸ���
	// ����
}

class Pet {
	static String name;

	Pet(String name) {
		this.name = name;
	}

	static double x =1;
	public static void main(String[] args) {
		System.out.println(name);
		// main method�� static method�̹Ƿ� �ν��Ͻ� �ʵ带 �׳� ����� �� ����. ��ü�� �����ϵ�,
		// �ʵ带 static �ʵ�� �ٲٵ��� �ؾ��Ѵ�.
		System.out.println(x);
	}

}

class Dog extends Pet {

	Dog(String name) {
		super(name); // �θ� Ŭ������ �����ڰ� ��õ� �������� ��� �ڽ� Ŭ������ �����ڵ� �ۼ�������Ѵ�.
	}

}