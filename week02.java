import java.util.Scanner;

/*
 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다.
 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers.
Given an integer N, find the sum of all even fibonacci numbers.

예제)
Input: N = 12
Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
 */

public class week02 {
	
	/*
	 * mail_solution
	 * 이 문제는 N보다 클때까지 피보나치의 수를 구하며 짝수인 피보나치 수를 다 더해주면 됩니다.
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
	 * 여기서 피보나치 수가 0이 아니고 1부터 시작하는 이유는 x가 0일 경우 sum에 더해도 도움이 되지 않기 때문입니다.
	 */
	
	// my_solution
	static int result(int n) {
		int[] fibonacci = new int[n];	// 피보나치 배열
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for(int i = 2; ; i++) {
			fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
			if(fibonacci[i] >= n) break;
		}
		
		int sum = 0;	// 짝수 피보나치 수의 합
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
