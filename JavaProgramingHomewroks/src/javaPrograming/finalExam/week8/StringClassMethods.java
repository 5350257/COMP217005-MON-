package javaPrograming.finalExam.week8;

public class StringClassMethods {

	public static void main(String[] args) {
//		CharAt(); 메소드
//		CharAt() 메소드는 해당 문자열의 특정 인덱스에 해당하는 문자를 반환
//		문자열 길이 <인덱스 or 음수 전달 시 IndexOutOfBoundsException 발생
		String str = "ClassOfJavaPrograming";
		System.out.println("원래 문자열 : " + str);
		for(int i =0;i<str.length();i+=5) {
			System.out.printf("%d번째 문자 = %s  ",i+1,str.charAt(i));
		}

//		equals()
//		객체의 주소 비교
//		a.equals(b)
		boolean b = str.equals("asndasd");
		
		
//		compareTo() 메소드
//		해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교
//		문자열을 비교할 때 대소문자를 구분
//		만약 두 문자열이 같다면 0을 반환하며
//		해당 문자열이 인수로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환
//		만약 문자열을 비교할 때 대소문자를 구분하지 않기를 원한다면
//		compareToIgnoreCase() 메소드를 사용	
		String s = "abcde";
		System.out.println("원래 문자열 : " + s);
		System.out.println(s.compareTo("abcdE"));
		System.out.println(s.compareToIgnoreCase("abcdE"));
		System.out.println((int)'A' +" "+ (int)'a');
		
//		indexOf() 메소드
//		해당 문자열에서 특정 문자나 문자열이 처음으로 등장하는 위치의 인덱스를 반환
//		만약 해당 문자열에 전달된 문자나 문자열이 포함되어 있지 않으면 -1을 반환
		String st = new String("Oracle Java");
		
		System.out.println("원본 문자열 : " + st);
		
		System.out.println(st.indexOf('o'));
		System.out.println(st.indexOf('a'));
		System.out.println(st.indexOf("Java"));
		
//		toLowerCase()와 toUpperCase() 메소드
//		toLowerCase() 메소드는 해당 문자열의 모든 문자를 소문자로 변환
//		toUpperCase() 메소드는 해당 문자열의 모든 문자를 대문자로 변환
		String ss = "aBcDeF";
		System.out.println("원본 문자열 : " + ss);

		System.out.println(ss.toLowerCase());
		System.out.println(ss.toUpperCase());

//		subString(int index) 메소드
//		subString하고자 하는 문자열 앞에서 몇번째 위치인가를 지정
//		index로 해당 위치를 포함하여 이후의 모든 문자열을 리턴
		String string = "0123456789";
		System.out.println(string.substring(5));
		
//		subString(int startindex, int endindex) 메소드
//		첫번째 값은 몇번째 위치인가
//		두번째 값은 endindex 전 위치까지 값을 선택 
		System.out.println(string.substring(4,9));
		
	}
	
	

}
