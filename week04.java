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
	
	static boolean Mysolution(int n) {
		if(n < 0) return false;	// ������ ������ false
		
		String origin = Integer.toString(n);	// ���ڿ��� �ٲٸ� �ȵ�!!!
		String reverse = new StringBuilder(origin).reverse().toString();
		return origin.equals(reverse);
		
	}
	
//	static boolean solution(int n) {
//		if(n < 0) {
//			return false;
//		}
//		
//		int revertedHalf = 0;
//	    while(n > revertedHalf) {
//	        revertedHalf = revertedHalf * 10 + n % 10;
//	        n /= 10;
//	    }
//	    
//	    if(n == revertedHalf || n == revertedHalf/10) {
//	    	return true;
//	    }
//	    else return false;
//		
//	}

	public static void main(String[] args) {
		int test1 = 12345;
		int test2 = -101;
		int test3 = 11111;
		int test4 = 12421;
		System.out.println(Mysolution(test1));
		System.out.println(Mysolution(test2));
		System.out.println(Mysolution(test3));
		System.out.println(Mysolution(test4));
	}

}
