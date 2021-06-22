package javaPrograming.finalExam.week10;

class MethodTest{
	public static void main(String [] args){
		int a = 5;
		int [] arr = {1,2,3,4};
		
		add10(a);
		
		System.out.println(a); //15?? 
		System.out.println(add10(a));
		addArr10(arr);
		for(int i:arr){
			System.out.print(i+" "); //11, 12, 13, 14???
		}
		
	}
	//정수를 매개변수로 받아 10만큼 증가시키는 메소드 
	static int add10(int a){
		a += 10;
		return a;
	}
	//정수형 배열을 매개변수로 받아 배열의 모든 성분을 10만큼 증가시키는 메소드 
	static void addArr10(int [] a){
		for(int i=0; i<a.length; i++)
			a[i] += 10;
	}
}