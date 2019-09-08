package chap06;

import java.util.Scanner;

public class BubbleSort3 {
// ���� ����(���� 3)
	
	// a[idx1]�� a[idx2]�� ���� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// ���� ����
	static void bubbleSort(int[] a, int n) {
		int k = 0; // a[k]���� ������ ���ĵ� ����, k�� ���ĵ� ����ū ���� ����Ű�� �ε���
		
		while(k < n-1) {
			int last = n-1;
			for(int j=n-1; j>k; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					last = j; 
				}
			}
			k = last; // swap�� �Ǹ�  last���� n-1�� �ƴϰ� ��
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����(����1)");
		System.out.print("��ڼ� : ");
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, n);
		
		System.out.println("������������ ���ĵ�");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
		
	}
	

}
