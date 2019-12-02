import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
길이가 같은 두 문자열(string) A 와 B가 주어지면, A 가 B 로 1:1 암호화 가능한지 찾으시오.
Given two strings of equal length, check if two strings can be encrypted 1 to 1.

예제
Input: “EGG”, “FOO” 
Output: True // E->F, G->O

Input: “ABBCD”, “APPLE” 
Output: True // A->A, B->P, C->L, D->E

Input: “AAB”, “FOO” 
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
		
//		// key, value 확인
//		for (Character i : map1.keySet()) {
//		      System.out.println("key: " + i + " value: " + map1.get(i));
//		      
//		    }
//		System.out.println("--------------------");
//		for (Character i : map2.keySet()) {
//		      System.out.println("key: " + i + " value: " + map2.get(i));
//		    }
		
		// 중복된 value가 있으면 false
		Set<Character> set = new HashSet<>();
		for(Character v : map1.values()) {
			if(!set.add(v)) {	// add operation? set에 v가 없으면 true, v가 있으면 false를 반환해준다.
				return false;
			}
		}
		
		// 두 맵의 크기가 다르면 false
		if(map1.size() != map2.size()) return false;
		
		// map1에 map2의 value와 같은 key가 없으면 false
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
