package javaPrograming.finalExam.week14;

/*
상속의 장점2: 다형성(하나의 객체를 여러 타입(자료형)으로 참조가 가능한 성질)을 사용하는 이유2
 - 자식 클래스의 객체들을 부모클래스 타입의 배열로 그룹핑할 수 있음. 

피아니스트(Pianist) 클래스
 - play(): 피아노를 연주합니다. 
첼리스트(Cellist) 클래스
 - play(): 첼로를 연주합니다. 
바이올리니스트(Violinist) 클래스
 - play(): 바이올린을 연주합니다. 
 
지휘자(Conductor) 클래스
 - conduct(): 매개변수로 연주자들 여러명을 받아, 연주자들에게 연주할 것을 지휘(요청)한다.
 
PlayTest 클래스
 - 피아니스트, 첼리스트, 바이올리니스트 여러명 생성
 - 지휘자 생성하여 위에서 생성한 연주자들에게 지휘

* 클래스 추가 작성 가능
*/
class Player {
	private int year;// 연주 경력

	// 디폴트 생성자, 연주경력을 매개변수로 받아 초기화하는 생성자
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
		System.out.println("연주합니다.");
	}

	int getYear() {
		return year;
	}

}

class Pianist extends Player {
	private String brand;// 본인이 가진 피아노의 브랜드

	Pianist() {
		this(2, "영창");
	}

	// ⓐ디폴트 생성자, ⓑ연주경력, 브랜드를 매개변수로 받아 초기화하는 생성자
	Pianist(int year, String brand) {
		super(year);
		this.brand = brand;
	}

	// Object 클래스의 equals()메소드를 연주경력과 피아노의 브랜드가 같다면 같은 피아니스트로 간주하도록 재정의하시오: 실행 예외가
	// 발생하지 않도록 작성!
	public boolean equals(Object o) {// p1.equals(p2)
		if (o instanceof Pianist) {
			Pianist p = (Pianist) o;
			return this.getYear() == p.getYear() && this.brand.equals(p.brand);
		} else
			return false;
	}

	@Override
	void play() {
		System.out.print("피아노를 ");
		super.play();
	}
}

class Cellist extends Player {
	void play() {
		System.out.print("첼로를 ");
		super.play();
	}
}

class Violinist extends Player {
	void play() {
		System.out.print("바이올린을 ");
		super.play();
	}
}

class Conductor {/*
					 * void conduct(Pianist p){ p.play(); } void conduct(Cellist c){ c.play(); }
					 * void conduct(Violinist v){ v.play(); }
					 */
	void conduct(Player[] players) {
		for (Player p : players) {
			p.play();// 컴파일이 되려면, Player 클래스에 play()메소드가 존재해야 함.
						// 실행될때는 p의 실제 객체의 play()메소드가 호출됨.
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
		Pianist p2 = new Pianist(8, "야마하");
		System.out.println(p1.equals(p2));
		p1.equals(p2);

		/*
		 * Pianist p1 = new Pianist(); Pianist p2 = new Pianist(); Pianist p3 = new
		 * Pianist(); Violinist v1 = new Violinist(); Violinist v2 = new Violinist();
		 * Violinist v3 = new Violinist(); Violinist v4 = new Violinist(); Violinist v5
		 * = new Violinist(); Cellist c1 = new Cellist(); Cellist c2 = new Cellist();
		 * Cellist c3 = new Cellist(); Cellist c4 = new Cellist();
		 */
		// 배열: 같은 자료형의 자료를 그룹핑할 수 있음.

		// Conductor conductor = new Conductor();
		/*
		 * 지휘자.지휘(연주자들); conductor.conduct(p1); conductor.conduct(p2);
		 * conductor.conduct(p3); conductor.conduct(v1); conductor.conduct(v2);
		 * conductor.conduct(v3); conductor.conduct(v4); conductor.conduct(v5);
		 * conductor.conduct(c1); conductor.conduct(c2); conductor.conduct(c3);
		 * conductor.conduct(c4);
		 */
	}
}
