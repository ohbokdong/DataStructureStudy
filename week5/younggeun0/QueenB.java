package chap05;

public class QueenB {
// �� ���� 1���� ���� ��ġ�ϴ� ������ ��������� ����
	
	static int[] pos = new int[8]; // �� ���� �� ��ġ
	
	// �� ���� ���� ��ġ�� ���
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d",pos[i]);
		}
		System.out.println();
	}
	
	static void set(int i) { // i���� ���� ����
		for(int j=0; j<8; j++) {
			pos[i] = j;	// ���� j�࿡ ��ġ
			if (i == 7) {// ��� ���� ��ġ�Ǹ�
				print(); // ���
			} else {
				set(i+1); // ���� ���� �� ��ġ
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		set(0); // 0 ���� ���� ��ġ
	}

}
