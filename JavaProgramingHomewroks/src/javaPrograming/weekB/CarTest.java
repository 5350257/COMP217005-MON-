package javaPrograming.weekB;

//�ڵ����� ���α׷����ϰڴ� = �ڵ��� Ŭ������ �ۼ��ϰڴ�
class Car{
	//�ʵ�
	private int mileage;//����Ÿ�
	//�޼ҵ�
	public void goStraight(int distance){
		System.out.println(distance+"m �����߽��ϴ�.");
		mileage += distance;
	}
	public void turnLeft(){
		System.out.print("��ȸ�� �� ");
	}
	public void turnRight(){
		System.out.print("��ȸ�� �� ");
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
		System.out.println("�� ���� �Ÿ��� "+c.getMileage()+"m �Դϴ�. ");
	}
}









