import java.util.HashMap;
import java.util.Map;

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
	
//	mail_solution
//	이 문제는 해쉬맵을 사용하여 char와 char의 인덱스를 저장하여 풀면 됩니다.
//	string의 각 char를 보면서 해쉬맵에 있다면 substring 시작점을 char의 인덱스+1 로 두면 됩니다.
//	그리고 현재 char의 인덱스와 시작점의 거리를 계속 계산하여 가장 큰 값을 리턴하면 됩니다.

	static int longestSubstringLength(String s) {
		int ret = 0;
		int start = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int j = 0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j))) {
				start = Math.max(map.get(s.charAt(j)), start);
			}
			ret = Math.max(ret, j - start + 1);
			map.put(s.charAt(j), j + 1); // 캐릭터 인덱스 저장
		} 
		return ret;
	}

	
//	static int Mysolution(String str) {
//		int longest=1;
//		String temp = str.substring(0,1);
//		
//		for(int i=0; i<str.length(); i++) {
//			if(str.substring(i+longest).contains(temp)) {
//				// temp가 뒤에 있으면..?
//			}
//		}
//		
//		return longest;
//
//	}

	public static void main(String[] args) {
		String str = "aabcbcbc";
		System.out.println(longestSubstringLength(str));
	}

}
