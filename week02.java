import java.util.Scanner;

/*
 �Ǻ���ġ �迭�� 0�� 1�� �����ϸ�, ���� �Ǻ���ġ ���� �ٷ� ���� �� �Ǻ���ġ ���� ���� �ȴ�.
 ���� N�� �־�����, N���� ���� ��� ¦�� �Ǻ���ġ ���� ���� ���Ͽ���.
Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers.
Given an integer N, find the sum of all even fibonacci numbers.

����)
Input: N = 12
Output: 10 // 0, 1, 2, 3, 5, 8 �� ¦���� 2 + 8 = 10.
 */

public class week02 {
	
	static int result(int n) {
		int[] fibonacci = new int[n];	// �Ǻ���ġ �迭
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for(int i = 2; ; i++) {
			fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
			if(fibonacci[i] >= n) break;
		}
		
		int sum = 0;	// ¦�� �Ǻ���ġ ���� ��
		for(int i = 0; i < fibonacci.length; i++) {
			if(fibonacci[i] % 2 == 0)
				sum += fibonacci[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("N = ");
		int n = stdIn.nextInt();
		System.out.println(result(n));
		stdIn.close();
	}

}
