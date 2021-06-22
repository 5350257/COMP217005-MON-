package javaPrograming.finalExam.week11;

class MethodTest{
	public static void main(String [] args){
		int a = 5;
		int [] arr = {1,2,3,4};
		sub(1,2,3); //1 2 3
		sub(1,2,3, 1,2,3); //1 2 3 1 2 3
		sub(1,2,3, 1,2,3, 1,2,3, 1,2,3, 1,2,3, 1,2,3, 1,2,3); //1 2 3 1 2 3
		
		
		add10(a);
		System.out.println(a); //15?? 5다. 
		addArr10(arr);
		for(int i:arr){
			System.out.print(i+" "); //11, 12, 13, 14???
		}
		System.out.println();
		for(int i:addArr100ver2(arr)) {
			System.out.print(i+" ");
		}
		
	}
	
	static void sub(int ... integers){//가변 길이 인자 메소드 
		for(int a:integers ){
			System.out.print(a+" ");
			
		}System.out.println();
			
	}
	
	//정수를 매개변수로 받아 10만큼 증가시키는 메소드 
	static void add10(int a){
		a += 10;
	}
	//정수형 배열을 매개변수로 받아 배열의 모든 성분을 10만큼 증가시키는 메소드 
	static void addArr10(int [] a){
		for(int i=0; i<a.length; i++)
			a[i] += 10;
	}
	static int[] addArr100ver2(int [] a) {
		for(int i=0; i<a.length; i++)
			a[i] += 10;
		return a;
	}
}
	
	
	
	