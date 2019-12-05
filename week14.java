import java.util.Arrays;
import java.util.Comparator;

/*
문자열 배열(string array)이 주어지면, 제일 긴 공통된 접두사(prefix)의 길이를 찾으시오.
Given an array of strings, find the longest common prefix of all strings.

예제)
Input: [“apple”, “apps”, “ape”]
Output: 2 // “ap”

Input: [“hawaii”, “happy”]
Output: 2 // “ha”

Input: [“dog”, “dogs”, “doge”]
Output: 3 // “dog”
*/

public class week14 {
	
	static int Mysolution(String[] array) {
		Arrays.sort(array, new Comparator<String>() {	// 문자열  정렬하기
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();	// 문자열의 길이가 짧은게 앞에 오도록
            }
        });

		int check=0;	// 모든 문자열에 접두사가 공통인지 확인하기 위한 변수
		int longest = array[0].length();	// 가장 긴 접두사의 길이는 가장 짧은 문자열의 길이
		while(true) {	// 공통 접두사를 찾을 때까지 반복
			int i=1;
			if(check==array.length) {	// check가 배열의 길이와 같으면 모든 문자열에 접두사가 있다는 의미이므로
				System.out.println("공통 접두사: " + array[0].substring(0, longest));
				return longest;
			}
			
			if(array[i].contains(array[0].substring(0, longest))) {	// 문자열에 가장 짧은 문자열(첫번째문자열)의 서브스트링(접두사)이 있으면
				check++;
				i++;
			}
			else {	// 없으면 초기화
				i=1;
				check=0;
				longest--;	// 접두사의 길이를 하나씩 줄임
			}
		}
		
	}

	public static void main(String[] args) {
		String[] input = {"apple", "apps", "ape"};
		
		System.out.println(Mysolution(input));
	}

}
