import java.util.Arrays;

/*
���� �迭(int array)�� �־����� �ι�°�� ū ���� ����Ʈ�Ͻÿ�.

Given an integer array, find the second largest element.

����)

Input: [10, 5, 4, 3, -1]
Output: 5

Input: [3, 3, 3]
Output: Does not exist.
*/

public class week08 {
	
	static void Mysolution(int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		if(arr[len-1] == arr[len-2])
			System.out.println("Does not exist.");
		else System.out.println(arr[len-2]);
	}

	public static void main(String[] args) {
		int[] arr = {10,5,4,3,-1};
		int[] arr2 = {3,3,3};
		Mysolution(arr);
		Mysolution(arr2);
	}

}
