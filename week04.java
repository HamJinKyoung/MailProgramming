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
	static boolean result(int n) {
		if(n < 0) {
			return false;
		}
		
		int revertedHalf = 0;
	    while(n > revertedHalf) {
	        revertedHalf = revertedHalf * 10 + n % 10;
	        n /= 10;
	    }
	    
	    if(n == revertedHalf || n == revertedHalf/10) {
	    	return true;
	    }
	    else return false;
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		System.out.println(result(n));
		stdIn.close();
	}

}
