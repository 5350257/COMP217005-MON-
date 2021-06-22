package javaPrograming.weekE_1;

class Vehicle{
	protected int wheel;
	protected int m;
	
	Vehicle(){
		this(4,0);
	}
	Vehicle(int wheel, int m){
		this.wheel = wheel;
		this.m= m;
	}
	protected void print(int r){
		m+=r;
		System.out.printf("���� %s�̰�, %dm��ŭ �����մϴ�. �������� �� %dm��ŭ �����߽��ϴ�.\n",this.getClass().getName(),r,m);
	}
}
class Car extends Vehicle{
	protected String brand;
	Car(){
		this(4,0,"�����ڵ���");
	}
	Car(int wheel, int m, String brand){
		super(wheel,m);
		this.brand = brand;
	}
}
class Bike extends Vehicle{
	Bike(){
		this(2,0);
	}
	Bike(int wheel, int m){
		super(wheel,m);
		
	}
}
class Stone{}
class Garage{
	protected int num;
	protected void park(Object v){
		if(v instanceof Vehicle){
			num++;
			System.out.printf("%s�� �����߽��ϴ�(�� %d�� ������)\n",v.getClass().getName(),num);
		}else{
			System.out.printf("%s�� ������ �� ����\n",v.getClass().getName()); 
		}
	}
}
class ParkTest{
	public static void main(String [] args)throws Exception{
		Vehicle vehicles [] = {new Bike(), new Bike(3, 50), new Bike(4, 1000), new Bike(), new Car(), new Car(4, 0, "����")};
		Garage g = new Garage();
		vehicles[0].print(30);
		vehicles[5].print(30);
		
		for(Vehicle v:vehicles){
			g.park(v);
		}
		g.park(new Stone());
		g.park(new Garage());
	}
}