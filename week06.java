import java.util.Arrays;
import java.util.Comparator;

/*
����(interval)�� �̷���� �迭�� �־�����, ��ġ�� ���� ���ҵ��� ��ģ ���ο� �迭�� ����ÿ�. ������ ���۰� ������ �̷���� ������ ������ ������ �۰ų� �����ϴ�.

Given a list of intervals, merge intersecting intervals.

����)
Input: {{2,4}, {1,5}, {7,9}}
Output: {{1,5}, {7,9}}

Input: {{3,6}, {1,3}, {2,4}}
Output: {{1,6}}
 */

public class week06 {
	static void Mysolution(int[][] arr) {
		Arrays.sort(arr, new Comparator<int[]>() {	// ������ �������� �����ϱ�
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
                // �����ڼ� ������ �ϰ� �ʹٸ� o2�� o1�� ��ġ�� �ٲ��ݴϴ�
                // return o2[0] - o1[0];
            }
        });
		
		int[][] merge = new int[arr.length][2];
		int m=0;
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i][1] > arr[j][1]) {
					merge[m][0] = arr[i][0];
					merge[m][1] = arr[i][1];
					m++;
				}
				else if(arr[i][1] == arr[j][0] && arr[i][1] <= arr[j][1]) {
					merge[m][0] = arr[i][0];
					merge[m][1] = arr[j][1];
					m++;
				}
				else {
					merge[m][0] = arr[j][0];
					merge[m][1] = arr[j][1];
					m++;
				}
			}
		}
		
		for(int i=0;i<merge.length;i++) {
			System.out.println(merge[i][0] + ", " + merge[i][1]);
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{2,4}, {1,5}, {7,9}};
		int[][] arr2 = {{3,6}, {1,3}, {2,4}};
		
		Mysolution(arr);
		Mysolution(arr2);
	}
	

}
