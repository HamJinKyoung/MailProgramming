/*
�־��� string �� ��� �ܾ �Ųٷ� �Ͻÿ�.

Reverse all the words in the given string.

����)
Input: ��abc 123 apple��
Output: ��cba 321 elppa��
 */

public class week07 {
	
	static void Mysolution(String str) {
		String[] words = str.split(" ");
		String[] reversed = words;
		for(int i=0; i<words.length; i++) {
			reversed[i] = new StringBuilder(words[i]).reverse().toString()+" ";	// �� �ڿ� ����..
		}
		for(int i=0; i<reversed.length; i++) {
			System.out.print(reversed[i]);
		}
	}

	public static void main(String[] args) {
		String str = "abc 123 apple";
		Mysolution(str);
	}

}
