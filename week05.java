import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
���� �迭�� Ÿ�� ���ڰ� �־�����, ���� Ÿ�ٰ��� �Ǵ� �� ������ �ε����� ã���ÿ�.
��, �ð����⵵ O(n) ���� �մϴ�.

Given an array of integers and a target integer, find two indexes of the array element that sums to the target number.

����)
Input: [2, 5, 6, 1, 10], Ÿ�� 8
Output: [0, 2] // �迭[0] + �迭[2] = 8
 */

public class week05 {
	
	static void solution(int[] input, int target) {
		Map map = new HashMap();
		for (int i = 0; i < input.length; i++) {
			int complement = target - input[i];
			if (map.containsKey(complement)) {
				System.out.println("[" + map.get(complement) + ", " + i + "]" );
			}
			map.put(input[i], i);
		}
	}


	public static void main(String[] args) {
		int[] input = {2,5,6,1,10};
		int target = 8;
		
		solution(input, target);

	}

}
