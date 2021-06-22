package javaPrograming.finalExam.week14;

/*
����� ����2: ������(�ϳ��� ��ü�� ���� Ÿ��(�ڷ���)���� ������ ������ ����)�� ����ϴ� ����2
 - �ڽ� Ŭ������ ��ü���� �θ�Ŭ���� Ÿ���� �迭�� �׷����� �� ����. 

�ǾƴϽ�Ʈ(Pianist) Ŭ����
 - play(): �ǾƳ븦 �����մϴ�. 
ÿ����Ʈ(Cellist) Ŭ����
 - play(): ÿ�θ� �����մϴ�. 
���̿ø��Ͻ�Ʈ(Violinist) Ŭ����
 - play(): ���̿ø��� �����մϴ�. 
 
������(Conductor) Ŭ����
 - conduct(): �Ű������� �����ڵ� �������� �޾�, �����ڵ鿡�� ������ ���� ����(��û)�Ѵ�.
 
PlayTest Ŭ����
 - �ǾƴϽ�Ʈ, ÿ����Ʈ, ���̿ø��Ͻ�Ʈ ������ ����
 - ������ �����Ͽ� ������ ������ �����ڵ鿡�� ����

* Ŭ���� �߰� �ۼ� ����
*/
class Player {
	private int year;// ���� ���

	// ����Ʈ ������, ���ְ���� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	Player() {
		this(2);
	}

	Player(int year) {
		if (year >= 0)
			this.year = year;
		else
			this.year = 1;
	}

	void play() {
		System.out.println("�����մϴ�.");
	}

	int getYear() {
		return year;
	}

}

class Pianist extends Player {
	private String brand;// ������ ���� �ǾƳ��� �귣��

	Pianist() {
		this(2, "��â");
	}

	// �͵���Ʈ ������, �ο��ְ��, �귣�带 �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	Pianist(int year, String brand) {
		super(year);
		this.brand = brand;
	}

	// Object Ŭ������ equals()�޼ҵ带 ���ְ�°� �ǾƳ��� �귣�尡 ���ٸ� ���� �ǾƴϽ�Ʈ�� �����ϵ��� �������Ͻÿ�: ���� ���ܰ�
	// �߻����� �ʵ��� �ۼ�!
	public boolean equals(Object o) {// p1.equals(p2)
		if (o instanceof Pianist) {
			Pianist p = (Pianist) o;
			return this.getYear() == p.getYear() && this.brand.equals(p.brand);
		} else
			return false;
	}

	@Override
	void play() {
		System.out.print("�ǾƳ븦 ");
		super.play();
	}
}

class Cellist extends Player {
	void play() {
		System.out.print("ÿ�θ� ");
		super.play();
	}
}

class Violinist extends Player {
	void play() {
		System.out.print("���̿ø��� ");
		super.play();
	}
}

class Conductor {/*
					 * void conduct(Pianist p){ p.play(); } void conduct(Cellist c){ c.play(); }
					 * void conduct(Violinist v){ v.play(); }
					 */
	void conduct(Player[] players) {
		for (Player p : players) {
			p.play();// �������� �Ƿ���, Player Ŭ������ play()�޼ҵ尡 �����ؾ� ��.
						// ����ɶ��� p�� ���� ��ü�� play()�޼ҵ尡 ȣ���.
		}
	}
}

class PlayTest {
	public static void main(String[] args) {
		Player[] players = { new Pianist(), new Cellist(), new Violinist(), new Cellist(), new Cellist(),
				new Violinist(), new Pianist(), new Violinist(), new Cellist(), new Pianist(), new Violinist(),
				new Pianist(), new Violinist(), new Cellist() };
		Conductor conductor = new Conductor();
		conductor.conduct(players);
		Pianist p1 = new Pianist();
		Pianist p2 = new Pianist(8, "�߸���");
		System.out.println(p1.equals(p2));
		p1.equals(p2);

		/*
		 * Pianist p1 = new Pianist(); Pianist p2 = new Pianist(); Pianist p3 = new
		 * Pianist(); Violinist v1 = new Violinist(); Violinist v2 = new Violinist();
		 * Violinist v3 = new Violinist(); Violinist v4 = new Violinist(); Violinist v5
		 * = new Violinist(); Cellist c1 = new Cellist(); Cellist c2 = new Cellist();
		 * Cellist c3 = new Cellist(); Cellist c4 = new Cellist();
		 */
		// �迭: ���� �ڷ����� �ڷḦ �׷����� �� ����.

		// Conductor conductor = new Conductor();
		/*
		 * ������.����(�����ڵ�); conductor.conduct(p1); conductor.conduct(p2);
		 * conductor.conduct(p3); conductor.conduct(v1); conductor.conduct(v2);
		 * conductor.conduct(v3); conductor.conduct(v4); conductor.conduct(v5);
		 * conductor.conduct(c1); conductor.conduct(c2); conductor.conduct(c3);
		 * conductor.conduct(c4);
		 */
	}
}
