/*
���� �迭(int array)�� �־����� 0�� �ƴ� ���� ������ �����ϸ� ��� 0�� �迭 ������ ������ �ű�ÿ�. ��, �ð����⵵�� O(n), �������⵵�� O(1)���� �մϴ�.

Given an integer array, move all the 0s to the right of the array without changing the order of non-zero elements.

����)
Input: [0, 5, 0, 3, -1] 
Output: [5, 3, -1, 0, 0]

Input: [3, 0, 3] 
Output: [3, 3, 0]

*/

public class week09 {
	
	static int[] Mysolution(int[] arr) {
		int len = arr.length;
		int[] result = new int[len];
		int f=0, b=len-1;
		
		for(int i=0; i<len; i++) {
			if(arr[i]==0) {
				result[b] = arr[i];
				b--;
			}
			else {
				result[f] = arr[i];
				f++;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {0,5,0,3,-1};
		
		int[] answer = Mysolution(arr);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i] + " ");
		}
	}

}
