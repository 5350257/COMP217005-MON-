package javaPrograming.weekB;

class Dog{
	/*������: ��ü �����ÿ��� ȣ��Ǵ� Ư���� �޼ҵ�
		1. ��ü �����ÿ��� ȣ��
		2. ��ȯŸ���� ����
		3. Ŭ���� �̸��� ��ġ 
	*/
	Dog(){//����Ʈ ������: �Ű������� ���� ������
		this("������", 2);
	/*
		name = "������";
		full = 2;
		*/
	}
	Dog(String name, int full){//�Ű������� �̸��� �������� ������
		this.name = name;
		this.full = full;
	}
	
	//�ʵ�: �̸�, ������
	private String name;
	private int full;
	//�޼ҵ�: eat(����: int), eat(����)
	void eat(String food) throws Exception{
		
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
			Thread.sleep(300);
		}
		System.out.println();
		System.out.println(food+"�� �߸Ծ����ϴ�. ");
		full += 3;
	}
	void eat(int food){
		full += food;
		System.out.println("�߸Ծ����ϴ�. ");
	}
	// eat() �޼ҵ带 �ߺ� �����ߴ�. 
	
	public int getFull(){
		return full;
	}
	//toString()�޼ҵ� ����: ��ü�� ��� ������ ���ڿ��� ��ȯ
	public String toString(){
		return String.format("�� �������� �̸��� %s�̰�, �������� %d�Դϴ�.", name, full);
		//"�� �������� �̸��� "+name+"�̰�, �������� "+full+"�Դϴ�.";
	}
}
class DogTest{
	public static void main(String [] args) throws Exception{
	//1.������ �Ѹ��� ���� �� ������ ���
		Dog myDog = new Dog();
		System.out.println(myDog.toString());
		System.out.println(myDog);//��ü�� ����ض� ��� �ϸ� �ڵ����� toString()ȣ���ϰ� �� ��� ���
		//�������� 10�� �����
		Dog myDog2 = new Dog("�����", 10);
		//�������� 0�� �ǻ�
		Dog myDog3 = new Dog("�ǻ�", 0);
		System.out.println(myDog2);
		System.out.println(myDog3);
		
		
		System.out.println(myDog.getFull());
	//2.���� 5��ŭ �ְ� ������ ���
		myDog.eat(5);
		System.out.println(myDog.getFull());	
		myDog.eat("����");
		System.out.println(myDog.getFull());	


		
	}
}