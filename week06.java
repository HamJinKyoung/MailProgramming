import java.util.Arrays;
import java.util.Comparator;

/*
간격(interval)로 이루어진 배열이 주어지면, 겹치는 간격 원소들을 합친 새로운 배열을 만드시오. 간격은 시작과 끝으로 이루어져 있으며 시작은 끝보다 작거나 같습니다.

Given a list of intervals, merge intersecting intervals.

예제)
Input: {{2,4}, {1,5}, {7,9}}
Output: {{1,5}, {7,9}}

Input: {{3,6}, {1,3}, {2,4}}
Output: {{1,6}}
 */

public class week06 {
	static void Mysolution(int[][] arr) {
		Arrays.sort(arr, new Comparator<int[]>() {	// 시작점 기준으로 정렬하기
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
                // 내림자순 정렬을 하고 싶다면 o2와 o1의 위치를 바꿔줍니다
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
