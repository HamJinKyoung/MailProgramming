/*
String이 주어지면, 중복된 char가 없는 가장 긴 서브스트링 (substring)의 길이를 찾으시오. 
Given a string, find the longest substring that does not have duplicate characters.

예제)
Input: “aabcbcbc” 
Output: 3 // “abc”

Input: “aaaaaaaa” 
Output: 1 // “a”

Input: “abbbcedd” 
Output: 4 // “bced”
*/

public class week10 {
	
	static int Mysolution(String str) {
		int longest=1;
		String temp = str.substring(0,1);
		
		for(int i=0; i<str.length(); i++) {
			if(str.substring(i+longest).contains(temp)) {
				// temp가 뒤에 있으면..?
			}
		}
		
		return longest;

	}

	public static void main(String[] args) {
		String str = "aabcbcbc";
		System.out.println(Mysolution(str));
	}

}
