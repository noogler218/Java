package warmup;

import java.util.Scanner;


/*Problem Statement
You are given a number N. Find the digits in this number that exactly divide N and display their count. For N = 24, there are 2 digits - 2 & 4. Both these digits exactly divide 24. So our answer is 2.

Note If the same number is repeated twice at different positions, it should be counted twice, e.g., For N=122, 2 divides 122 exactly and occurs at ones' and tens' position. So it should be counted twice. So for this case, our answer is 3. 
Also note that division by 0 is undefined.


Input Format
The first line contains T (number of test cases) followed by T lines (each containing an integer N).

Constraints 
1 <=T <= 15 
0 < N < 1010


Output Format
For each test case, display the count of digits in N that exactly divide N in separate line.


Sample Input
1  
12

Sample Output
2*/

public class FindDigits {
	
	public int findDivisibleDigitCount(int number){
		int count = 0;
		int testCaseNum = number;
		while(testCaseNum!=0){
			int digit = testCaseNum%10;
			testCaseNum = testCaseNum/10;
			if(digit!=0&&number%digit==0)count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		
		FindDigits findDigits = new FindDigits();
		
		for(int i=0;i<testCases;i++){
			int number = scanner.nextInt();
			System.out.println(findDigits.findDivisibleDigitCount(number));
		}
		scanner.close();
	}
}
