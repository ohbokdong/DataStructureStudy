package chap02;

public class PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0; // ������ ������ Ƚ��
		int ptr = 0; // ã�� �Ҽ��� ����
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3; // 2�� 3�� �Ҽ�
		
		for (int n=5; n<=1000; n += 2) { // ����� Ȧ����
			boolean flag = false;
			for(int i=1; prime[i]*prime[i] <= n; i++) { // �Ҽ������� ���� ������ �ݺ�
				counter += 2; // ���ϰ� �����ϱ� 2
				if (n % prime[i] == 0) { // ���� �������� �Ҽ��� �ƴ�
					flag = true;
					break;
				}
			}
			if (!flag) { // ���������� ������������ ����
				prime[ptr++] = n; // �Ҽ��� �迭�� ����
				counter++;
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("������ ������ Ƚ�� : "+counter); // 3774
	}
}
