package javaPrograming.finalExam.week8;

public class StringClassMethods {

	public static void main(String[] args) {
//		CharAt(); �޼ҵ�
//		CharAt() �޼ҵ�� �ش� ���ڿ��� Ư�� �ε����� �ش��ϴ� ���ڸ� ��ȯ
//		���ڿ� ���� <�ε��� or ���� ���� �� IndexOutOfBoundsException �߻�
		String str = "ClassOfJavaPrograming";
		System.out.println("���� ���ڿ� : " + str);
		for(int i =0;i<str.length();i+=5) {
			System.out.printf("%d��° ���� = %s  ",i+1,str.charAt(i));
		}

//		equals()
//		��ü�� �ּ� ��
//		a.equals(b)
		boolean b = str.equals("asndasd");
		
		
//		compareTo() �޼ҵ�
//		�ش� ���ڿ��� �μ��� ���޵� ���ڿ��� ���� ���� ������ ��
//		���ڿ��� ���� �� ��ҹ��ڸ� ����
//		���� �� ���ڿ��� ���ٸ� 0�� ��ȯ�ϸ�
//		�ش� ���ڿ��� �μ��� ���޵� ���ڿ����� ������ ������, ũ�� ����� ��ȯ
//		���� ���ڿ��� ���� �� ��ҹ��ڸ� �������� �ʱ⸦ ���Ѵٸ�
//		compareToIgnoreCase() �޼ҵ带 ���	
		String s = "abcde";
		System.out.println("���� ���ڿ� : " + s);
		System.out.println(s.compareTo("abcdE"));
		System.out.println(s.compareToIgnoreCase("abcdE"));
		System.out.println((int)'A' +" "+ (int)'a');
		
//		indexOf() �޼ҵ�
//		�ش� ���ڿ����� Ư�� ���ڳ� ���ڿ��� ó������ �����ϴ� ��ġ�� �ε����� ��ȯ
//		���� �ش� ���ڿ��� ���޵� ���ڳ� ���ڿ��� ���ԵǾ� ���� ������ -1�� ��ȯ
		String st = new String("Oracle Java");
		
		System.out.println("���� ���ڿ� : " + st);
		
		System.out.println(st.indexOf('o'));
		System.out.println(st.indexOf('a'));
		System.out.println(st.indexOf("Java"));
		
//		toLowerCase()�� toUpperCase() �޼ҵ�
//		toLowerCase() �޼ҵ�� �ش� ���ڿ��� ��� ���ڸ� �ҹ��ڷ� ��ȯ
//		toUpperCase() �޼ҵ�� �ش� ���ڿ��� ��� ���ڸ� �빮�ڷ� ��ȯ
		String ss = "aBcDeF";
		System.out.println("���� ���ڿ� : " + ss);

		System.out.println(ss.toLowerCase());
		System.out.println(ss.toUpperCase());

//		subString(int index) �޼ҵ�
//		subString�ϰ��� �ϴ� ���ڿ� �տ��� ���° ��ġ�ΰ��� ����
//		index�� �ش� ��ġ�� �����Ͽ� ������ ��� ���ڿ��� ����
		String string = "0123456789";
		System.out.println(string.substring(5));
		
//		subString(int startindex, int endindex) �޼ҵ�
//		ù��° ���� ���° ��ġ�ΰ�
//		�ι�° ���� endindex �� ��ġ���� ���� ���� 
		System.out.println(string.substring(4,9));
		
	}
	
	

}
