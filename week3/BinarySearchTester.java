package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� :");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		System.out.println("������������ �Է��ϼ���..");
		
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
		
		int idx = Arrays.binarySearch(arr, key); // �˻� ���н� -1 �Ǵ� -(���� ����Ʈ)-1 ���� ��ȯ, ������ �� ������ ��ȯ
		
		if (idx  < 0) { 
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(key+"�� arr["+idx+"]�� ����");
		}
		
	}

}
