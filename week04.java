import java.util.Scanner;

/*
����(int)�� �־�����, �Ӹ����(palindrome)���� �˾Ƴ��ÿ�.
�Ӹ�����̶�, �տ������� ������ �ڿ������� ������ ���� �ܾ ���մϴ�. ��, ������ ���ڿ��� �ٲٸ� �ȵ˴ϴ�.

Given an integer, check if it is a palindrome.

����)
Input: 12345 
Output: False

Input: -101
Output: False

Input: 11111 
Output: True

Input: 12421 
Output: True
 */

public class week04 {
	static boolean result(int n, int len) {
		if(n < 0) {
			return false;
		}
		for(int i = 0; i < len / 2; i++) {
//			if �� ���ڸ����� �ǵ��ڸ����� ������ continue;
//			else return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int len = (int)Math.log10(n) + 1; // n�� �ڸ���
		
		System.out.println(result(n, len));
		stdIn.close();
	}

}
