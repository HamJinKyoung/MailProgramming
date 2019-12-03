/*
정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오.
팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다.

Given an integer, check if it is a palindrome.

예제)
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
		if(n < 0) return false;	// 음수는 무조건 false
		
		String origin = Integer.toString(n);	// 문자열로 바꾸면 안됨!!!
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
