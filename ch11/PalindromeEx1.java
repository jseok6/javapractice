package ch11;

import java.util.Arrays;

public class PalindromeEx1 {

	static final int MAX = 100000;

	public static void main(String[] args) {
		/*
		 * �տ������� ���� ���� �ڿ������� ���� ���� ����� ���� ���� ��Ī��(palindrome)��� �մϴ�. ��Ī��(palindrome)��
		 * 585�� 2������ ��Ÿ���� 1001001001�� �Ǿ� ������ ��Ī���Դϴ�.
		 */

		// ����1.10������ ��Ī���� 100,000 ���� ������ ���� ���Դϱ�?

		// ����2.2������ ��Ī���� 100,000 ���� ������ ���� ���Դϱ�?

		// ����3.10������ 2�������� ��� ��Ī���� 100,000 ���� ������ ���� ���Դϱ�?
		
		int[] answer = new int[3];
		PalindromeEx1 pe = new PalindromeEx1();
		for (int i = 1; i <= MAX; i++) {
			if (pe.isPalindrome(i, 10)) {
				answer[0] += i;
			}
			if (pe.isPalindrome(i, 2)) {
				answer[1] += i;
			}
			if (pe.isPalindrome(i, 2) && pe.isPalindrome(i, 10)) {
				answer[2] += i;
			}
		}
		System.out.println(Arrays.toString(answer));
	}

	public boolean isPalindrome(int x, int numberType) {
		StringBuilder sb = new StringBuilder(Integer.toString(x, numberType));
		if (sb.toString().equals(sb.reverse().toString())) {
			return true;
		}
		else
			return false;
	}
}