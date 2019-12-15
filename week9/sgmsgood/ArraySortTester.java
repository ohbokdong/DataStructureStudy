package chap06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num]; //�迭�� ũ��� num�Դϴ�.
		
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		Arrays.parallelSort(x);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
		
		sc.close();
	}
}
