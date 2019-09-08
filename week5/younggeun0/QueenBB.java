package chap05;

public class QueenBB {
// �� ���� 1���� ���� ��ġ�ϴ� ������ ��������� ����
	
	static boolean[] flag = new boolean[8]; // �� �࿡ ���� ��ġ�ߴ��� üũ
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
				flag[j] = true;
				set(i+1); // ���� ���� �� ��ġ
				flag[j] = false;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		set(0); // 0 ���� ���� ��ġ
	}

}
