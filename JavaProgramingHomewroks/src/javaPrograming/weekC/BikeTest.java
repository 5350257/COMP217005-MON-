package javaPrograming.weekC;

class Bike{
	private String color;
	private int numOfWheels;
	
	//�������� ������ ������ ������ �����ϴ� �ʵ� 
	private static int numOfBikes;
	//�ʵ�� ��ü���� ���������� ������ ����. 
	//�����ϰ� ���� �ʵ�� static�� �ٿ���. 
	//static ����� Ŭ������.����� ����
	//static �޼ҵ�� �����Ǵ� �޼ҵ尡 �ƴ϶� ����� �׻� ������ �޼ҵ� : ���� ���� �޼ҵ� 

	//static �޼ҵ忡���� non-static ����� ȣ�� �� �� ����:  
	static int getNumOfBikes(){
//		System.out.println("������ ����: "+this.color);
		return numOfBikes;
	}
	
	Bike(){
		this("�Ķ���", 2);
	}
	Bike(String color, int numOfWheels){
		numOfBikes++;
		this.color = color;
		this.numOfWheels = numOfWheels;
	}
}
class BikeTest{
	public static void main(String [] args){
		System.out.print("���ݱ��� ������ ������ : ");
		System.out.println(Bike.getNumOfBikes()+" ��");// 0
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		Bike b4 = new Bike("�ʷϻ�", 4);
		Bike b5 = new Bike("�����", 3);
		
		System.out.printf("�������� ������ ������: %d ��\n", Bike.getNumOfBikes());//5
		
	}
}






