package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {
			"abstract", "assert", "boolean", "break", "byte",
			"case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else",
			"enum", "extends", "final", "finally", "float",
			"for", "goto", "if", "implements", "import",
			"instanceof", "int", "interface", "long", "native",
			"new", "package", "private", "protected", "public",
			"return", "short", "static", "strictfp", "super",
			"switch", "synchronized", "this", "throw", "throws",
			"transient", "try", "void", "volatile", "while"
		};
		
		System.out.print("���ϴ� Ű���带 �Է��ϼ��� : ");
		String key = sc.next();
		
		int idx = Arrays.binarySearch(arr, key);
		
		if (idx < 0) {
			System.out.println("�ش� Ű���� ����");
		} else {
			System.out.println("�ش� Ű����� arr["+idx+"]�� ����");
		}
	}
}
