package javaPrograming.weekB;

//자동차를 프로그래밍하겠다 = 자동차 클래스를 작성하겠다
class Car{
	//필드
	private int mileage;//주행거리
	//메소드
	public void goStraight(int distance){
		System.out.println(distance+"m 직진했습니다.");
		mileage += distance;
	}
	public void turnLeft(){
		System.out.print("좌회전 후 ");
	}
	public void turnRight(){
		System.out.print("우회전 후 ");
	}
	public int getMileage(){//getter
		return mileage;
	}
	
}
public class CarTest{
	public static void main(String [] args){
		Car c = new Car();
		c.goStraight(25);
		c.turnLeft();
		c.goStraight(30);
		c.turnRight();
		c.goStraight(15);
		c.turnLeft();
		c.goStraight(20);
		System.out.println("총 주행 거리는 "+c.getMileage()+"m 입니다. ");
	}
}









