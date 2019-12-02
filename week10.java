import java.util.HashMap;
import java.util.Map;

/*
String�� �־�����, �ߺ��� char�� ���� ���� �� ���꽺Ʈ�� (substring)�� ���̸� ã���ÿ�. 
Given a string, find the longest substring that does not have duplicate characters.

����)
Input: ��aabcbcbc�� 
Output: 3 // ��abc��

Input: ��aaaaaaaa�� 
Output: 1 // ��a��

Input: ��abbbcedd�� 
Output: 4 // ��bced��
*/

public class week10 {
	
//	mail_solution
//	�� ������ �ؽ����� ����Ͽ� char�� char�� �ε����� �����Ͽ� Ǯ�� �˴ϴ�.
//	string�� �� char�� ���鼭 �ؽ��ʿ� �ִٸ� substring �������� char�� �ε���+1 �� �θ� �˴ϴ�.
//	�׸��� ���� char�� �ε����� �������� �Ÿ��� ��� ����Ͽ� ���� ū ���� �����ϸ� �˴ϴ�.

	static int longestSubstringLength(String s) {
		int ret = 0;
		int start = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int j = 0; j < s.length(); j++) {
			if (map.containsKey(s.charAt(j))) {
				start = Math.max(map.get(s.charAt(j)), start);
			}
			ret = Math.max(ret, j - start + 1);
			map.put(s.charAt(j), j + 1); // ĳ���� �ε��� ����
		} 
		return ret;
	}

	
//	static int Mysolution(String str) {
//		int longest=1;
//		String temp = str.substring(0,1);
//		
//		for(int i=0; i<str.length(); i++) {
//			if(str.substring(i+longest).contains(temp)) {
//				// temp�� �ڿ� ������..?
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
