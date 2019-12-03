/*
정수로된 배열이 주어지면, 각 원소가 자신을 뺀 나머지 원소들의 곱셈이 되게하라.
단, 나누기 사용 금지, O(n) 시간복잡도
Given an integer array, make each element a product of all element values without itself.

예제)
input: [1, 2, 3, 4, 5]
output: [120, 60, 40, 30, 24]
*/

public class week12 {
	static int[] Mysolution(int[] arr) {
		int len = arr.length;
		int[] result = new int[len];
		int mul=1;
//		result[0] = arr[1]*arr[2]*arr[3]*arr[4]
//		result[1] = arr[0]*arr[2]*arr[3]*arr[4]
//		result[2] = arr[0]*arr[1]*arr[3]*arr[4]
//		result[3] = arr[0]*arr[1]*arr[2]*arr[4]
//		result[4] = arr[0]*arr[1]*arr[2]*arr[3]
		int[] asc = new int[len]; // {1, arr[0], arr[0]*arr[1], arr[0]*arr[1]*arr[2], arr[0]*arr[1]*arr[2]*arr[3]}
		for(int i=0; i<len; i++) {
			asc[i] = mul;
			mul *= arr[i];
		}
		
		mul=1;
		int[] des = new int[len]; // {arr[1]*arr[2]*arr[3]*arr[4], arr[2]*arr[3]*arr[4], arr[3]*arr[4], arr[3], 1}
		for(int i=len-1; i>=0; i--) {
			des[i] = mul;
			mul *= arr[i];
		}
		
		for(int i=0; i<len; i++) {
			result[i] = asc[i] * des[i];
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] input = {1,2,3,4,5};
		int[] output = Mysolution(input);
		
		System.out.println("결과확인");
		for(int i : output) {
			System.out.print(i+" ");
		}
	}

}
