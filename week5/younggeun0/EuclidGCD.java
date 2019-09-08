package chap05;

import java.util.Scanner;

public class EuclidGCD { // GCD(Greatest Common Divisor)
	// ��Ŭ���� ȣ�������� �ִ����� ���ϱ�
	
	static int gcd(int x, int y) {
		//���� x,y�� �ִ������� ���ϸ� ��ȯ
		if (y == 0)
			return x;
		else
			return gcd(y, x%y);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ����");
		
		System.out.print("������ �Է��ϼ��� : "); int x = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : "); int y = sc.nextInt();

		sc.close();
		
		System.out.println("�ִ� ������� "+gcd(x,y)+"�Դϴ�.");
	}
}
