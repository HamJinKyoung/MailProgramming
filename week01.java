import java.util.Scanner;

/*
 ���� �迭(int array)�� �־����� ���� ū �̾����� ���ҵ��� ���� ���Ͻÿ�. ��, �ð����⵵�� O(n).
Given an integer array, find the largest consecutive sum of elements.

����}
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
		System.out.print("�迭�� ����: ");
		int len = stdIn.nextInt();
		System.out.print("Input: ");
		int[] array = new int[len];
		for(int i = 0; i < len; i++)
			array[i] = stdIn.nextInt();
		stdIn.close();
		
		System.out.println("Output: " + result(array));
		
	}
	
	

}
