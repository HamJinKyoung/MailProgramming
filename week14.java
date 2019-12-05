import java.util.Arrays;
import java.util.Comparator;

/*
���ڿ� �迭(string array)�� �־�����, ���� �� ����� ���λ�(prefix)�� ���̸� ã���ÿ�.
Given an array of strings, find the longest common prefix of all strings.

����)
Input: [��apple��, ��apps��, ��ape��]
Output: 2 // ��ap��

Input: [��hawaii��, ��happy��]
Output: 2 // ��ha��

Input: [��dog��, ��dogs��, ��doge��]
Output: 3 // ��dog��
*/

public class week14 {
	
	static int Mysolution(String[] array) {
		Arrays.sort(array, new Comparator<String>() {	// ���ڿ�  �����ϱ�
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();	// ���ڿ��� ���̰� ª���� �տ� ������
            }
        });

		int check=0;	// ��� ���ڿ��� ���λ簡 �������� Ȯ���ϱ� ���� ����
		int longest = array[0].length();	// ���� �� ���λ��� ���̴� ���� ª�� ���ڿ��� ����
		while(true) {	// ���� ���λ縦 ã�� ������ �ݺ�
			int i=1;
			if(check==array.length) {	// check�� �迭�� ���̿� ������ ��� ���ڿ��� ���λ簡 �ִٴ� �ǹ��̹Ƿ�
				System.out.println("���� ���λ�: " + array[0].substring(0, longest));
				return longest;
			}
			
			if(array[i].contains(array[0].substring(0, longest))) {	// ���ڿ��� ���� ª�� ���ڿ�(ù��°���ڿ�)�� ���꽺Ʈ��(���λ�)�� ������
				check++;
				i++;
			}
			else {	// ������ �ʱ�ȭ
				i=1;
				check=0;
				longest--;	// ���λ��� ���̸� �ϳ��� ����
			}
		}
		
	}

	public static void main(String[] args) {
		String[] input = {"apple", "apps", "ape"};
		
		System.out.println(Mysolution(input));
	}

}
