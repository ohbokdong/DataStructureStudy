package chap08;

import java.util.Scanner;

public class BFmatch {
	
	static int bfMatch(String str, String pattern) {
		int pString = 0;  // ���� Ŀ��
		int pPattern = 0; // ���� Ŀ��
		
		while(pString != str.length() && pPattern != pattern.length()) {
			if (str.charAt(pString) == pattern.charAt(pPattern)) {
				pString++;
				pPattern++;
			} else {
				pString = pString - pPattern + 1;
				pPattern = 0;
			}
		}
		
		if (pPattern == pattern.length()) // �˻� ����
			return pString - pPattern;
		return -1; // �˻� ����
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String : ");
		String str = sc.next(); // ���� ���ڿ�
		
		System.out.print("Pattern : ");
		String pattern = sc.next(); // ���Ͽ� ���ڿ�
		
		sc.close();
		int idx = bfMatch(str, pattern); // brute-force
		
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
