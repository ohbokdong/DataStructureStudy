package chap06;

import java.util.Scanner;

public class Partition {
	
	//�迭 ��� arr[i]�� arr[j]�� ���� �ٲ�
	static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	static void partition(int[] arr, int n) {
		int left = 0; // ���� Ŀ��
		int right = n-1; //������ Ŀ��
		int pivot = arr[n/2]; // �ǹ�(��� ��ġ)
		
		do {
			while(arr[left] < pivot) left++;
			while(arr[right] > pivot) right--;
			
			if (left <= right) {
				swap(arr, left++, right--);
			}
		} while(left <= right);
		
		System.out.println("�ǹ��� ���� "+pivot+"�Դϴ�.");
		System.out.println("�ǹ� ������ �׷�");
		for(int i=0; i<=left; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		if (left > right+1) {
			System.out.println("�ǹ��� ��ġ�ϴ� �׷�");
			for(int i=right+1; i<=left-1; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("�ǹ� �̻��� �׷�");
		for(int i=right+1; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ����(����1)");
		System.out.print("��� �� : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("arr["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		
		partition(arr, n);
	}
}
