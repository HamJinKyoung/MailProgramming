import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
���̰� ���� �� ���ڿ�(string) A �� B�� �־�����, A �� B �� 1:1 ��ȣȭ �������� ã���ÿ�.
Given two strings of equal length, check if two strings can be encrypted 1 to 1.

����
Input: ��EGG��, ��FOO�� 
Output: True // E->F, G->O

Input: ��ABBCD��, ��APPLE�� 
Output: True // A->A, B->P, C->L, D->E

Input: ��AAB��, ��FOO�� 
Output: False
*/

public class week11 {
	
	static boolean Mysolution(String a, String b) {
		HashMap<Character, Character> map1 = new HashMap<>();
		HashMap<Character, Character> map2 = new HashMap<>();
		for(int i=0; i<a.length(); i++) {
			map1.put(a.charAt(i), b.charAt(i));
			map2.put(b.charAt(i), a.charAt(i));
		}
		
//		// key, value Ȯ��
//		for (Character i : map1.keySet()) {
//		      System.out.println("key: " + i + " value: " + map1.get(i));
//		      
//		    }
//		System.out.println("--------------------");
//		for (Character i : map2.keySet()) {
//		      System.out.println("key: " + i + " value: " + map2.get(i));
//		    }
		
		// �ߺ��� value�� ������ false
		Set<Character> set = new HashSet<>();
		for(Character v : map1.values()) {
			if(!set.add(v)) {	// add operation? set�� v�� ������ true, v�� ������ false�� ��ȯ���ش�.
				return false;
			}
		}
		
		// �� ���� ũ�Ⱑ �ٸ��� false
		if(map1.size() != map2.size()) return false;
		
		// map1�� map2�� value�� ���� key�� ������ false
		for(Character i : map2.keySet()) {
			if(!map1.containsKey(map2.get(i))) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String A = "AAB";
		String B = "FOO";
		
		System.out.println(Mysolution(A, B));
	}

}
