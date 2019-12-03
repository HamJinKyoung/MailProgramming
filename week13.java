import java.util.Arrays;

/*
���� �迭(int array)�� ���� N�� �־�����, N��°�� ū �迭 ���Ҹ� ã���ÿ�.
Given an integer array and integer N, find the Nth largest element in the array.

����)
Input: [-1, 3, -1, 5, 4], 2
Output: 4

Input: [2, 4, -2, -3, 8], 1
Output: 8

Input: [-5, -3, 1], 3
Output: -5
*/

public class week13 {
	static int Mysolution(int[] arr, int n) {
		int find;
		Arrays.sort(arr); // �������� ����
		int len = arr.length;
		find = arr[len-n];
		return find;
	}

	public static void main(String[] args) {
		int[] input = {-5, -3, 1};
		int n = 3;
		
		System.out.println("n��°�� ū ��: " + Mysolution(input, n));
	}

}
