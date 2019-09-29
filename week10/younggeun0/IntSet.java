package chap07;

public class IntSet { // int�� ����
	private int max; // ������ �ִ� ����
	private int num; //������ ��� ����
	private int[] set; // ���� ��ü
	
	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		
		try {
			set = new int[max]; // ���� �迭 ����
		} catch (OutOfMemoryError e) { // �迭 ���� ����
			max = 0;
		}
	}
	
	public int capacity() { // ������ �ִ� ����
		return max;
	}
	
	public int size() { // ������ ��� ����
		return num;
	}
	
	public int indexOf(int n) { // ���տ��� n�� �˻�(idx��ȯ)
		for(int i=0; i<num; i++) {
			if (set[i] == n) {
				return i; // �˻� ����
			}
		}
		return -1; // �˻� ����
	}
	
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}
	
	public boolean add(int n) {
		if (num >= max || contains(n) == true) {
			// ���� á�ų� �̹� n�� �����ϸ�
			return false;
		} else {
			// ���� ������ �ڸ��� �߰�
			set[num++] = n;
			return true;
		}
	}
	
	public boolean remove(int n) { // ���տ��� n�� ����
		int idx; // n�� ����� ����� �ε���
		
		if (num <= 0 || (idx = indexOf(n)) == -1) {
			// ����ְų� n�� �������� ������
			return false;
		} else {
			// ������ ��Ҹ� ������ ������ �ű�
			set[idx] = set[--num];
			return true;
		}
	}
	
	public void copyTo(IntSet s) { // ���� s�� ����
		int n = (s.max < num) ? s.max : num; // ������ ��� ����
		for (int i=0; i<n; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}
	
	public void copyFrom(IntSet s) { // ���� s�� ����
		int n = (max < s.num)? max : s.num; // ������ ��� ����
		for (int i=0; i<n; i++) {
			set[i] = s.set[i];
		}
		num = n;
	}
	
	public boolean equalTo(IntSet s) { // ���� s�� ������ Ȯ��
		if (num != s.num) { // ��� ������ ���� ������
			return false; // ���յ� ���� ����
		}
		
		for (int i=0; i<num; i++) {
			int j = 0;
			for(; j<s.num; j++) {
				if (set[i] == s.set[j])
					break;
			}
			if (j == s.num) // set[i]�� s�� ���Ե��� ����
				return false;
		}
		
		return true;
	}
	
	public void unionOf(IntSet s1, IntSet s2) { // ���� s1�� s2�� �������� ����
		copyFrom(s1); // ���� s1�� ����
		for (int i=0; i<s2.num; i++) { // ���� s2�� ��Ҹ� �߰�
			add(s2.set[i]);
		}
	}
	
	// "{a b c}"������ ���ڿ� ǥ������ �ٲ�
	public String toString() {
		StringBuffer temp = new StringBuffer("{ ");
		for(int i=0; i<num; i++) {
			temp.append(set[i] + " ");
		}
		temp.append(" } ");
		return temp.toString();
	}
	
}
