package javaPrograming.weekC;

class Bike{
	private String color;
	private int numOfWheels;
	
	//이제까지 생성된 자전거 개수를 저장하는 필드 
	private static int numOfBikes;
	//필드는 객체마다 개별적으로 가지고 있음. 
	//공유하고 싶은 필드는 static을 붙여줌. 
	//static 멤버는 클래스명.멤버로 접근
	//static 메소드는 공유되는 메소드가 아니라 결과가 항상 동일한 메소드 : 수학 관련 메소드 

	//static 메소드에서는 non-static 멤버를 호출 할 수 없음:  
	static int getNumOfBikes(){
//		System.out.println("자전거 색상: "+this.color);
		return numOfBikes;
	}
	
	Bike(){
		this("파란색", 2);
	}
	Bike(String color, int numOfWheels){
		numOfBikes++;
		this.color = color;
		this.numOfWheels = numOfWheels;
	}
}
class BikeTest{
	public static void main(String [] args){
		System.out.print("지금까지 생성된 자전거 : ");
		System.out.println(Bike.getNumOfBikes()+" 대");// 0
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		Bike b4 = new Bike("초록색", 4);
		Bike b5 = new Bike("노란색", 3);
		
		System.out.printf("이제까지 생성된 자전거: %d 대\n", Bike.getNumOfBikes());//5
		
	}
}






