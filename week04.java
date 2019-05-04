import java.util.Scanner;

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
