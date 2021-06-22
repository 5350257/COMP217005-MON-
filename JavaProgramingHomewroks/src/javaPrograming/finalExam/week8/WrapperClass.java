package javaPrograming.finalExam.week8;

public class WrapperClass {

	public static void main(String[] args) {
//		래퍼 클래스(Wrapper class)
//		프로그램에 따라 기본 타입의 데이터를 객체로 취급해야 하는 경우가 있습니다.
//		예를 들어, 메소드의 인수로 객체 타입만이 요구되면, 기본 타입의 데이터를 그대로 사용할 수는 없습니다.
//		이때에는 기본 타입의 데이터를 먼저 객체로 변환한 후 작업을 수행해야 합니다.
//		이렇게 8개의 기본 타입에 해당하는 데이터를 객체로 포장해 주는 클래스를 래퍼 클래스(Wrapper class)라고 합니다.
//		래퍼 클래스는 각각의 타입에 해당하는 데이터를 인수로 전달받아, 해당 값을 가지는 객체로 만들어 줍니다.
//		value val = (밑에꺼)
		
//		Byte.parseByte();
//
//		Short.parseShort();
//
//		Integer.parseInt();
//
//		Long.parseLong();
//
//		Float.parseFloat();
//
//		Double.parseDouble();
		
		String strNum1 = new String("1234");
		String strNum2 = new String("4321");

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		System.out.println(num1 + num2);
	}

}
