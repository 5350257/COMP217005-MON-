package javaPrograming.week8.midterm1;

import java.util.*;

public class PP2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ܾ �Է��ϼ��� : ");
		String eng = sc.next(); // �Է� ���� �ܾ ������ String ����
		char[] alphabet = new char[26]; // ���ĺ� �迭 - ũ�� : 52 (�빮�� 26��, �ҹ��� 26��)
		int[] count = new int[alphabet.length]; // �� ���ĺ��� ��� Ƚ�� ī��Ʈ - ũ�� : ���ĺ� �迭�� ũ�⸸ŭ
		eng = eng.toUpperCase();
		// �迭 �ʱ�ȭ
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (i + 65); // �빮�� ���� - �빮�ڴ� �ƽ�Ű �ڵ� 65���� 26��
		}

		// ī��Ʈ ����
		for (int i = 0; i < eng.length(); i++){
			for (int j = 0; j < alphabet.length; j++){
				if (eng.charAt(i) == alphabet[j]){
					count[j]++; // ī��Ʈ �迭�� j��° ī��Ʈ�� 1 ����
				}
			}
		}

		// ������ ���ĺ��� ���� Ƚ�� ���
		System.out.println("���ĺ��� ���� Ƚ���� ����մϴ�.");
		for (int i = 0; i < alphabet.length; i++) {
			if (count[i] != 0) {
				System.out.println(alphabet[i] + " = " + count[i]);
			}

		}
	}
}