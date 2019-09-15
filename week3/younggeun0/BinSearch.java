package chap03;

import java.util.Scanner;

public class BinSearch {

	static int binSearch(int[] arr, int n, int key) {
		int left = 0;
		int right = n -1;
		
		do {
			int center = (left+right) / 2;
			if (arr[center] == key) {
				return center;
			} else if (key > arr[center]) {
				left = center + 1;
			} else {
				right = center - 1;
			} 
		} while (left <= right);
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.println("������������ �Է�!");
		
		System.out.print("arr[0] : ");
		arr[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("arr["+i+"] : ");
				arr[i] = sc.nextInt();
				
			} while(arr[i] < arr[i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();
		
		int idx = binSearch(arr, num, key);
		
		if (idx == -1) {
			System.out.println("����");
		} else {
			System.out.println(key+"�� arr["+idx+"]�� ����");
		}
		
	}
	
}
