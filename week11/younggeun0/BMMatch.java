package chap08;

import java.util.Scanner;

public class BMMatch {
	
	static int bmMatch(String txt, String pattern) {
		int pText; 		// txt Ŀ��
		int pPattern;	// pattern Ŀ��
		int txtLength = txt.length();
		int patternLength = pattern.length();
		
		int[] skip = new int[Character.MAX_VALUE+1]; // �ǳʶٱ� ǥ
		
		// �ǳʶٱ� ǥ ����
		for(pText = 0; pText <= Character.MAX_VALUE; pText++) {
			skip[pText] = patternLength; // �ϴ� ������ ���̸�ŭ �ǳʶٱ� ǥ ���� �ʱ�ȭ
		}
		for(pText = 0; pText < patternLength-1; pText++) {
			// ������ ����ִ� ���ڸ� ���� ��� 
			// �������� ������ ��ġ�� �ε����� pText�̸� ������ �ű� ũ��� ������ ���� - pText - 1
			skip[pattern.charAt(pText)] = patternLength - pText - 1; // pText == patternLength - 1
		}
		
		// �˻�
		while(pText < txtLength) {
			pPattern = patternLength - 1; // pattern�� �� ���ڿ� �ָ�
			
			while (txt.charAt(pText) == pattern.charAt(pPattern)) {
				if (pPattern == 0) {
					return pText; // �˻� ����
				}
				
				pPattern--;
				pText--;
			}
			pText += (skip[txt.charAt(pText)] > patternLength - pPattern) ?
					skip[txt.charAt(pText)] : patternLength - pPattern;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String : ");
		String str = sc.next(); // ���� ���ڿ�
		
		System.out.print("Pattern : ");
		String pattern = sc.next(); // ���Ͽ� ���ڿ�
		
		sc.close();
		int idx = bmMatch(str, pattern); // brute-force
		
		if (idx == -1) 
			System.out.println("�Է��� ������ ����");
		else {
			int len = 0;
			for(int i=0; i<idx; i++) {
				len += str.substring(i, i+1).getBytes().length;
			}
			len += pattern.length();
			
			System.out.println((idx+1)+"��° ���ں��� ��ġ");
			System.out.println("���� : "+str);
			System.out.printf(String.format("���� : %%%ds\n", len), pattern);
		}
	}
}
