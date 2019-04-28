import java.util.ArrayList;
import java.util.Scanner;

/*
정수 n이 주어지면, n개의 여는 괄호 "("와 n개의 닫는 괄호 ")"로 만들 수 있는 괄호 조합을 모두 구하시오. (시간 복잡도 제한 없습니다).
Given an integer N, find the number of possible balanced parentheses with N opening and closing brackets.

예제)
Input: 1
Output: ["()"]

Input: 2
Output: ["(())", "()()"]

Input: 3
Output: ["((()))", "(()())", "()(())", "(())()", "()()()"]
 */

public class week03 {
	
	static void brackets(int n, int open, int close, String cur, ArrayList<String> answer) {
		if(cur.length() == n*2+1) {
			cur = cur+"\"";
			answer.add(cur);
		}
		if(open < n) {
			brackets(n, open + 1, close, cur + "(", answer);
		}
		if(open > close) {
			brackets(n, open, close + 1, cur + ")", answer);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		brackets(n, 0, 0, "\"", answer);
		System.out.println(answer);
		stdIn.close();
	}

}
