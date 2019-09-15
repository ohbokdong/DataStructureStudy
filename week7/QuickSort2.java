package chap06;

import java.util.Scanner;

import chap04.IntStack;

public class QuickSort2 {
	
	//�迭 ��� arr[i]�� arr[j]�� ���� �ٲ�
	static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	static void quickSort(int[] arr, int left, int right) {
		IntStack lstack = new IntStack(right-left+1);
		IntStack rstack = new IntStack(right-left+1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int pivot = arr[(left+right)/2];
			
			do {
				while(arr[pl] < pivot) pl++;
				while(arr[pr] > pivot) pr--;
				
				if(pl <= pr) {
					swap(arr, pl++, pr--);
				}
			} while(pl <= pr);
			
			if (left < pr) {
				lstack.push(left); // ���� �׷� ������ 
				rstack.push(pr);   // �ε����� Ǫ��
			}
			
			if (pl < right) {
				lstack.push(pl);   // ������ �׷� ������
				rstack.push(right); // �ε����� Ǫ��
			}
		}
		
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
		
		quickSort(arr, 0, n-1);
		
		System.out.println("������������ �����Ͽ����ϴ�.");
		for(int i=0; i<n; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}
