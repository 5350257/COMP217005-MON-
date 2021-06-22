package javaPrograming.weekD;

class Vehicle {
	private int numOfWheels;
	private static int numOfVehicles;

	Vehicle() {
		this(4);
	}

	Vehicle(int numOfWheels) {
		this.numOfWheels = numOfWheels;
		numOfVehicles++;
	}

	void goStraight(double dist) {
		System.out.printf("%.2fm �����մϴ�.\n", dist);
	}

	int getNumOfWheels() {
		return numOfWheels;
	}

	static int getNumOfVehicles() {
		return numOfVehicles;
	}
}

class Car extends Vehicle {
	String brand;

	Car(int numOfWheels, String brand) {
		super(numOfWheels);
		this.brand = brand;
	}

	@Override
	void goStraight(double dist) {
		System.out.printf("������ %d���� %s�� �ڵ����� ", getNumOfWheels(), brand);
		super.goStraight(dist);
	}

	public boolean equals(Object o) {// ȣ��: myCar.equals(Stone)
		// �������� �귣�尡 ���ٸ� ���� �ڵ����� �����ϵ��� ������
		if (o instanceof Car) {// o�� �ڵ������
			if (this.getNumOfWheels() == ((Vehicle) o).getNumOfWheels() && this.brand.equals(((Car) o).brand)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
/*
 * ��ü�� instanceof Ŭ������
 * 
 * 
 */

class Bike extends Vehicle {
	Bike(int numOfWheels) {
		super(numOfWheels);
	}

	@Override
	void goStraight(double dist) {
		System.out.printf("������ %d���� �����Ű� ", getNumOfWheels());
		super.goStraight(dist);
	}
}

class Rock {
}

class VehicleTest {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Bike b1 = new Bike(2);
		Bike b2 = new Bike(3);
		Bike b3 = new Bike(4);
		Car myCar = new Car(4, "�����ڵ���");
		Car yourCar = new Car(4, "����ڵ���");
		System.out.println(myCar.equals(yourCar));
		System.out.println(myCar.equals(new Rock()));

		Vehicle c1 = new Car(4, "�����ڵ���");// ��ĳ����
		Object c2 = new Car(6, "����ڵ���");// ��ĳ����
		// ��ĳ������ ��Ӱ��谡 �����ϸ� ����
		// ��ĳ������ �Ѱ�
		/*
		 * System.out.println(c1.brand);//������ �Ұ� c2.goStraight(30);//������ �Ұ�
		 */
		System.out.println(((Car) c1).brand);// �ٿ� ĳ����
		((Vehicle) c2).goStraight(30);// �ٿ� ĳ����
		((Car) c2).goStraight(30);// �ٿ� ĳ����
		Car c3 = new Car(8, "�ֿ��ڵ���");
		// ������: �ϳ��� ��ü�� ���� Ÿ������ ������ �� �ִ� ����: ��ĳ����, �ٿ�ĳ����

		System.out.println("�������� ������ Ż �� ����: " + Vehicle.getNumOfVehicles());
		c1.goStraight(30);
		b1.goStraight(30);

	}
}
