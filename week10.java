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
	
	static int Mysolution(String str) {
		int longest=1;
		String temp = str.substring(0,1);
		
		for(int i=0; i<str.length(); i++) {
			if(str.substring(i+longest).contains(temp)) {
				// temp�� �ڿ� ������..?
			}
		}
		
		return longest;

	}

	public static void main(String[] args) {
		String str = "aabcbcbc";
		System.out.println(Mysolution(str));
	}

}
