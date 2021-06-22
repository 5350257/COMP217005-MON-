package javaPrograming.finalExam.week13;

/*
�� Ŭ����
 - eat(): �Ű������� ���� ������ �Դ� �޼ҵ�
  * eat(new Hamburger): Hamburger�� ���ֳ׿�. 
  * eat(new IceCream): IceCream�� ���ֳ׿�. 



�ܹ��� Ŭ����
���̽�ũ�� Ŭ����
���� Ŭ���� 
���� Ŭ����

�׽�Ʈ Ŭ����
 - ���� �ܹ���, ���̽�ũ��, ����, ���� �Դ� ���� �ùķ��̼�
  
*�߰� Ŭ���� �ۼ� ����






*/
class EatTest{
	public static void main(String [] args){
		I i = new I();
		Hamburger hamburger = new Hamburger();
		i.eat(hamburger);
		i.eat(new IceCream());
		i.eat(new Pizza());
		i.eat(new Bingsu());
		i.eat(new Bibimbab());
		i.eat(new Stone());
	}	
}
//���(������)�� ���� 1: �޼ҵ��� �Ű������� �θ�Ŭ���� Ÿ�����εθ� �ڽ�Ŭ���� ��ü�� ��� ���ڷ� ���� �� �ִ�. 
class Stone{}
class I{
	void eat(Object o){//Object o= new Stone();
		//o�� �����̶�� �԰� �ƴ϶�� ������ �ƴѰ� �ȸԾ��~�� ����ϵ��� �ۼ�
		if(o instanceof Food)
			System.out.printf("%s�� �Խ��ϴ�. \n", o.getClass().getName());
		else
			System.out.printf("%s�� ������ �ƴ϶� ���� �ʽ��ϴ�.\n", o.getClass().getName());
	}
	/*
	void eat(Hamburger hamburger){
		System.out.println("�ܹ��Ÿ� �Խ��ϴ�. ");
	}
	void eat(IceCream iceCream){
		System.out.println("���̽�ũ���� �Խ��ϴ�. ");
	}
	void eat(Pizza pizza){
		System.out.println("pizza�� �Խ��ϴ�. ");
	}
	void eat(Bingsu bingsu){
		System.out.println("bingsu�� �Խ��ϴ�. ");
	}
	void eat(Bibimbab bibimbab){
		System.out.println("bibimbab�� �Խ��ϴ�. ");
	}
	*/
}
class Food{}
class Hamburger extends Food{}
class IceCream extends Food{}
class Pizza extends Food{}
class Bingsu extends Food{}
class Bibimbab extends Food{}






