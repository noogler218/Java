package warmup;

import java.util.Scanner;

/*Watson gives two integers A & B to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

 A square integer is an integer which is the square of any integer. For example, 1, 4, 9, 16 are some of the square integers as they are squares of 1, 2, 3, 4 respectively.

 Input Format 
 First line contains T, the number of testcases. T test cases follow, each in a newline. 
 Each testcase contains two space separated integers denoting A and B.

 Output Format 
 For each testcase, print the required answer in a new line.

 Constraints 
 1 ≤ T ≤ 100 
 1 ≤ A ≤ B ≤ 109

 Sample Input

 2
 3 9
 17 24
 Sample output

 2
 0*/

public class SherlockAndSquares {

	public boolean IsSquare(int target) {
		return Math.sqrt((double) target) % 1f == 0f;
	}

	public void printPerfectSquaresBetween(int a, int b) {
		int count = 0;

		if (IsSquare(a)) {
			count++;
		}

		if (b != a) {
			
			int numbers = (int) (Math.floor(Math.sqrt(b))-Math.floor(Math.sqrt(a)));
			count+=numbers;
		}

		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < testCases; i++) {
			String[] valString = scanner.nextLine().split("\\s+");

			int a = Integer.parseInt(valString[0]);
			int b = Integer.parseInt(valString[1]);

			new SherlockAndSquares().printPerfectSquaresBetween(a, b);
		}
		scanner.close();
	}
}
