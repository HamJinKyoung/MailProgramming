import java.util.Arrays;

/*
정수 배열(int array)과 정수 N이 주어지면, N번째로 큰 배열 원소를 찾으시오.
Given an integer array and integer N, find the Nth largest element in the array.

예제)
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
		Arrays.sort(arr); // 오름차순 정렬
		int len = arr.length;
		find = arr[len-n];
		return find;
	}

	public static void main(String[] args) {
		int[] input = {-5, -3, 1};
		int n = 3;
		
		System.out.println("n번째로 큰 수: " + Mysolution(input, n));
	}

}
