package chap03;

import java.util.Scanner;

public class SeqSearch {

	static int seqSearch(int[] a, int n, int key) {
		/*int i =0; // �迭 ����Ž�� while������� ���
		
		while(true) {
			if (i == n) {
				return -1;
			}
			if (a[i] == key) {
				return i;
			}
			i++;
		}*/
		for(int i=0; i<n; i++) { // for���� �̿��� �迭 ����Ž��
			if (a[i] == key) 
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();
		int idx = seqSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("�˻����� ����");
		} else {
			System.out.println(key+"�� x["+idx+"]�� ����");
		}
		
		
		
	}
}
