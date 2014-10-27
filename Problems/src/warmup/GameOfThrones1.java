package warmup;

import java.util.HashMap;
import java.util.Scanner;


/*King Robert has 7 kingdoms under his rule. He finds out from a raven that the Dothraki are soon going to wage a war against him. But, he knows the Dothraki need to cross the Narrow River to enter his realm. There is only one bridge that connects both banks of the river which is sealed by a huge door.

door

The king wants to lock the door so that the Dothraki can't enter. But, to lock the door he needs a key that is an anagram of a certain palindrome string.

The king has a string composed of lowercase English letters. Help him figure out if any anagram of the string can be a palindrome or not.

Input Format 
A single line which contains the input string

Constraints 
1<=length of string <= 10^5 
Each character of the string is a lowercase English letter.

Output Format 
A single line which contains YES or NO in uppercase.

Sample Input : 01

aaabbbb
Sample Output : 01

YES*/


public class GameOfThrones1 {

	public boolean isAnagramOfPalindrom(String text){
		boolean result = false;
		
		HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
		
		for(char c : text.toCharArray()){
			Integer val = characterMap.get(c);
			if (val==null) {
				characterMap.put(c, 1);
			}else{
				characterMap.put(c, val+1);
			}
		}
		if(text.length()%2==0){
			boolean containoddCharacter = false;
			
			for(char c: characterMap.keySet()){
				if(characterMap.get(c)%2!=0){
					containoddCharacter = true;
					break;
				}
			}
			if(!containoddCharacter){
				result = true;
			}
		}else{
			int multipleOddCount = 0;
			for(char c: characterMap.keySet()){
				if(characterMap.get(c)%2!=0){
					multipleOddCount++;
				}
			}
			if(multipleOddCount==1){
				result = true;
			}
			
		}
		
		return result;
	}
	
	
	 public static void main(String[] args) {
	        Scanner myScan = new Scanner(System.in);
	        String inputString = myScan.nextLine();
	       
	        boolean ans = new GameOfThrones1().isAnagramOfPalindrom(inputString);
	        if (ans) {
	        	System.out.println("YES");	
			}else{
				System.out.println("NO");
			}
	        myScan.close();
	    }
}
