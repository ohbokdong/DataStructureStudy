package chap08;

import java.util.Scanner;

public class KMPmatch {
	static int kmpMatch(String txt, String pattern) {
		int pText = 1;    // ���� Ŀ��
		int pPattern = 0; // ���� Ŀ��
		int[] skip = new int[pattern.length() + 1]; // �ǳʶٱ� ǥ
		
		// �ǳʶٱ� ǥ �����
		skip[pText] = 0;
		while(pText != pattern.length()) {
			if (pattern.charAt(pText) == pattern.charAt(pPattern))
				skip[++pText] = ++pPattern;
			else if (pPattern == 0) 
				skip[++pText] = pPattern;
			else
				pPattern = skip[pPattern];
		} 
		
		// �˻�
		pText = pPattern = 0;
		while (pText != txt.length() && pPattern != pattern.length()) {
			if (txt.charAt(pText) == pattern.charAt(pPattern)) {
				pText++;
				pPattern++;
			} else if (pPattern == 0) {
				pText++;
			} else {
				pPattern = skip[pPattern];
			}
		}
		
		if (pPattern == pattern.length()) // pText - pPattern�� ��ȯ
			return pText - pPattern;
		return -1; // �˻� ����
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String : ");
		String str = sc.next(); // ���� ���ڿ�
		
		System.out.print("Pattern : ");
		String pattern = sc.next(); // ���Ͽ� ���ڿ�
		
		sc.close();
		int idx = kmpMatch(str, pattern); // KMP
		
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
