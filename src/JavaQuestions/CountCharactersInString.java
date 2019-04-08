package JavaQuestions;

import java.util.HashMap;

public class CountCharactersInString {
	
	//write a method that count all characters in your name
	public static void countChars(String s) {
		HashMap<Character, Integer> charMap = new HashMap<>();
		for (char  c : s.toCharArray()) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		System.out.println(charMap);
	}
	
	
	
	
	public static void main(String[] args) {
		countChars("Jazgul");
		
		HashMap<String, String> studentInfo = new HashMap<>();
		studentInfo.put("firstName", "John");
		studentInfo.put("lastName", "Doe");
		studentInfo.put("age", "24");
		studentInfo.put("Batch", "10");
		
		System.out.println(studentInfo.get("John"));
		
	}
}
