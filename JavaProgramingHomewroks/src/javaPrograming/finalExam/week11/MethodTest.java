package javaPrograming.finalExam.week11;

class MethodTest{
	public static void main(String [] args){
		int a = 5;
		int [] arr = {1,2,3,4};
		sub(1,2,3); //1 2 3
		sub(1,2,3, 1,2,3); //1 2 3 1 2 3
		sub(1,2,3, 1,2,3, 1,2,3, 1,2,3, 1,2,3, 1,2,3, 1,2,3); //1 2 3 1 2 3
		
		
		add10(a);
		System.out.println(a); //15?? 5��. 
		addArr10(arr);
		for(int i:arr){
			System.out.print(i+" "); //11, 12, 13, 14???
		}
		System.out.println();
		for(int i:addArr100ver2(arr)) {
			System.out.print(i+" ");
		}
		
	}
	
	static void sub(int ... integers){//���� ���� ���� �޼ҵ� 
		for(int a:integers ){
			System.out.print(a+" ");
			
		}System.out.println();
			
	}
	
	//������ �Ű������� �޾� 10��ŭ ������Ű�� �޼ҵ� 
	static void add10(int a){
		a += 10;
	}
	//������ �迭�� �Ű������� �޾� �迭�� ��� ������ 10��ŭ ������Ű�� �޼ҵ� 
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
	
	
	
	