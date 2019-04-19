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
	
	/*
	 * mail_solution
	 * �� ������ N���� Ŭ������ �Ǻ���ġ�� ���� ���ϸ� ¦���� �Ǻ���ġ ���� �� �����ָ� �˴ϴ�.
	 * int evenFibSum(int N) {
		  int sum = 0;
		  int x = 1;
		  int y = 2;
		  while (x <= N) {
		    if (x % 2 == 0) {
		      sum += x;
		    }
		    int z = x + y;
		    x = y;
		    y = z;
		  }
		  return sum;
		}
	 * ���⼭ �Ǻ���ġ ���� 0�� �ƴϰ� 1���� �����ϴ� ������ x�� 0�� ��� sum�� ���ص� ������ ���� �ʱ� �����Դϴ�.
	 */
	
	// my_solution
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
