package chap02;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0; // ���� Ƚ��
		int ptr = 0; // ã�� �Ҽ��� ��(+ prime �迭�� �ε���)
		int[] prime = new int[500]; // �Ҽ��� �����ϴ� �迭
		
		prime[ptr++] = 2; // 2�� �Ҽ�
		
		for(int n=3; n<=1000; n+=2) { // Ȧ���� ���
			int i;
			for(i =1; i<ptr; i++) {
				counter++;
				if(n%prime[i] == 0) { // ã�� �Ҽ��� ��
					break;
				}
			}
			if (ptr == i) { // ���������� ������������ ������ 
				prime[ptr++] = n; // �Ҽ��̹Ƿ� �迭�� ����, �ݺ�
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]); // ã�� �Ҽ� ���
		}
		System.out.println("�������� ������ �� : " + counter);
	}
}
