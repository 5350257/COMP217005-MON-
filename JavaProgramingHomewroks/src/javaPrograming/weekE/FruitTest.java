package javaPrograming.weekE;

/*
1. Animal a = new Dog();//����
Dog d = new Animal();//�Ұ���
2. �������� instanceof Ŭ������
a instanceof Dog: a�� Dog��?
//������ �Ұ�, ������ ����(true, false)
3. 
4. Object Ÿ��
*/
class Fruit{
	void print(){
		System.out.println("���� "+this.getClass().getName());
	}
}
class Grape extends Fruit{
	/*void print(){
		super.print();
		System.out.println("����");
	}
	*/
}
class Apple extends Fruit{
	
	/*void print(){
		super.print();
		System.out.println("���");
	}
	*/
}
class Pear extends Fruit{/*
	void print(){
		super.print();
		System.out.println("��");
	}*/
}
class FruitTest{
	public static void main(String [] args){
		Fruit [] f = {new Grape(), new Apple(), new Pear()};
		for(Fruit fr:f) fr.print();
	}
}





