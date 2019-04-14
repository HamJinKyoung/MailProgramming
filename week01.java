import java.util.Scanner;

/*
 정수 배열(int array)가 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간복잡도는 O(n).
Given an integer array, find the largest consecutive sum of elements.

예제}
Input: [-1, 3, -1, 5]
Output: 7 // 3 + (-1) + 5

Input: [-5, -3, -1]
Output: -1 // -1

Input: [2, 4, -2, -3, 8]
Output: 9 // 2 + 4 + (-2) + (-3) + 8
 */

public class week01 {
	
	static int result(int[] array) {
		int max = array[0];
		int realmax = array[0];
		for(int i = 1; i < array.length; i++) {
			max = Math.max(max + array[i], array[i]);
			realmax = Math.max(max, realmax);
		}
		return realmax;
	}

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("배열의 길이: ");
		int len = stdIn.nextInt();
		System.out.print("Input: ");
		int[] array = new int[len];
		for(int i = 0; i < len; i++)
			array[i] = stdIn.nextInt();
		stdIn.close();
		
		System.out.println("Output: " + result(array));
		
	}
	
	

}
