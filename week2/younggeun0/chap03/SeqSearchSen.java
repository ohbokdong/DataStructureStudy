package chap03;

import java.util.Scanner;

public class SeqSearchSen { // �迭 ����Ž�� ���ʹ�
	// �Ϲ� ����Ž������ ���������� ���� �ε����� ������(1), Ű���� �����ϴ���(2) �ΰ����� üũ����  
	// �ݺ��ϸ� �ι��� ��� ����� �߻�
	// ���ʹ��� �� �������� ã�� ���� �־� ã�� ���� �������ε����� ������� ���������� �ϳ��� ���̴� ���
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;
		
		while(true) {
			if (a[i] == key)
				break;
			i++;
		}
		
		return i == n ? -1 : i; // �������� ���� ���� ������ ��(����)
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		
		int[] x = new int[num+1]; // ���ʸ� �ֱ⶧���� +1
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		
		if (idx == -1) {
			System.out.println("����");
		} else {
			System.out.println(key+"�� x["+idx+"]�� ����");
		}
	}
}
