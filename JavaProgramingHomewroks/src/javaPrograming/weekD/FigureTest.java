package javaPrograming.weekD;

public class FigureTest {

	public static void main(String[] args) {
		EquilateralTriangle et1 = new EquilateralTriangle(3);
		EquilateralTriangle et2 = new EquilateralTriangle(1);
		System.out.println(et1);
		System.out.println(et2);
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(1);
		System.out.println(c1);
		System.out.println(c2);
		
	}
}

	class Figure {
		private double perimeter; // 둘레길이
		private double area; // 넓이

		Figure() {
		}

		Figure(double perimeter, double area) {
			this.perimeter = perimeter;
			this.area = area;
		}

		public String toString() {
			return String.format("둘레는 %.2f, 넓이는 %.2f입니다.", perimeter, area);
		}

	}

	class Circle extends Figure {
		private double r;

		Circle() {
		}

		Circle(double r) {
			super(2 * r * Math.PI, r * r * Math.PI);
			this.r = r;
		}

		@Override
		public String toString() {
			return String.format("이 도형은 원이고, %s 또, 반지름은 %.2f입니다.", super.toString(), r);

		}
	}

	class EquilateralTriangle extends Figure {
		private double a;

		EquilateralTriangle() {
		}

		
		EquilateralTriangle(double a) {
			super(3 * a, Math.sqrt(3) * a * a / 4);
			this.a = a;
		}
		@Override
		public String toString() {
			return String.format("이 도형은 점삼각형이고, %s\n이 정삼각형의 한변의 길이는 %.2f이고, 높이는 %.2f입니다.\n", super.toString(), a,
					Math.sqrt(3) / 2 * a);
		}
	}

