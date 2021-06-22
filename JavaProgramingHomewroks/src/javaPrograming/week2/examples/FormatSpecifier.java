package javaPrograming.week2.examples;

public class FormatSpecifier {
	
	public static void main (String [] args){
		short a = 19;
		char c = '가';
		double d = 5.2;
		boolean b = 4<5; //true
		
		String s = "Hello, World!";
		
/*
		서식지정자
		%[인자번호$] [플래그] [길이].[정밀도] [타입문자]
		
		
		[플래그]
		
			# : 타입문자 'o','x' 앞에서만 진수 표현,
			+ : 부호 결정. 타입문자 d, f 앞에만 사용가능
			- : 왼쪽 정렬, 너비가 있을때만 가능
			0 : 
			
		[너비] : 출력 길이 10 = 10자리
		
		[정밀도] : 실수만 소수점 자리를 말함
		
		[타입문자] : c(문자),s(문자열), d(정수), o(8진수) x(16진수), f(실수), b(논리)
		%e 실수를 지수형태로 출력 123.456 = 1.23456e+02 얘도 실수로 침
*/
// http://blog.devez.net/100 참조
	
	//a를 10칸 확보하고 십진수로 출력하되 왼쪽 정렬, 부호를 출력할 것
	System.out.printf("%-+10d\n",a);
	//a를 20칸 확보하고 십진수로 출력하되 오른쪽 정렬, 빈공간은 0으로 채울 것
	System.out.printf("%020d\n",a);
	//d를 소수점 아래 3째자리까지 부호 붙여 출력 
	System.out.printf("%+.3f\n",d);

		System.out.printf("문자열 : %s\n",s);
		System.out.format("문자 : %10c\n",c);
		
		System.out.printf("정수 : %d, %o, %x\n",a,a,a);
		
		System.out.printf("정수 : %010d, %o, %x\n",a,a,a);
		System.out.printf("정수 : %2$d, %2$#o, %2$#x\n",a,a,a);
		//$ 인자 지정, 몇번 째 인자를 사용할지 정함
		//d = decimal = 10진수 o = octal = 8진수 x=hexadecimal = 16진수
		System.out.printf("e실수 : %e\n",1000*d);
		System.out.printf("실수 : %f\n",d);

		
		System.out.printf("실수 : %.454f \n",d);
		System.out.printf("논리 : %b\n",b);
		
		}
	}