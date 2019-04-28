import java.util.ArrayList;
import java.util.Scanner;

/*
���� n�� �־�����, n���� ���� ��ȣ "("�� n���� �ݴ� ��ȣ ")"�� ���� �� �ִ� ��ȣ ������ ��� ���Ͻÿ�. (�ð� ���⵵ ���� �����ϴ�).
Given an integer N, find the number of possible balanced parentheses with N opening and closing brackets.

����)
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
