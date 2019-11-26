import java.util.LinkedList;
import java.util.Queue;

/*
정수 배열(int array)이 주어지면 0이 아닌 정수 순서를 유지하며 모든 0을 배열 오른쪽 끝으로 옮기시오. 단, 시간복잡도는 O(n), 공간복잡도는 O(1)여야 합니다.

Given an integer array, move all the 0s to the right of the array without changing the order of non-zero elements.

예제)
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
		int[] arr2 = {3,0,3};
		
		int[] answer = Mysolution(arr2);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i] + " ");
		}
	}

}
