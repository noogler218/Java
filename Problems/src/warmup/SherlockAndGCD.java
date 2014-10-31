package warmup;

import java.math.BigInteger;
import java.util.Scanner;

public class SherlockAndGCD {

	/*
	 * Sherlock is stuck. He has an array A1,A2,⋯,AN. He wants to know if there
	 * exists a subset, B={Ai1,Ai2,…,Aik} where 1≤i1<i2<…<ik≤N, of this array
	 * which follows the property
	 * 
	 * B is non-empty subset. There exists no integer x(x>1) which divides all
	 * elements of B. Note that x may or may not be an element of A. Input
	 * Format First line contains T, the number of testcases. Each testcase
	 * consists of N in one line. The next line contains N integers denoting the
	 * array A.
	 * 
	 * Output Print YES or NO, if there exists any such subset or not,
	 * respectively.
	 * 
	 * Constraints 1≤T≤10 1≤N≤100 1≤Ai≤105 ∀1≤i≤N
	 * 
	 * Sample input
	 * 
	 * 2 3 1 2 3 2 2 4 Sample output
	 * 
	 * YES NO Explanation In first testcase, S={1},S={1,2},S={1,3},S={2,3} and
	 * S={1,2,3} are all the possible subsets which satisfy the given condition.
	 * In second testcase, no non-empty subset exists which satisfies the given
	 * condition.
	 */

	public static int findGCD(int a, int b) {
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}

	public boolean isGCDPresent(int[] testSet) {
		
		if(testSet.length==1){
			return false;
		}
		
		boolean result = true;
		int gcd = findGCD(testSet[0], testSet[1]);

		if (gcd == 1) {
			result = false;
		} else {
			for (int i = 1; i < testSet.length; i++) {
				if (i != testSet.length - 1) {
					int resultGCD = findGCD(testSet[i], testSet[i + 1]);
					
					if(resultGCD==1){
						result=false;
						break;
					}
					
					int gcdCommon = findGCD(gcd, resultGCD); 
					
					if (gcdCommon==1) {
						result = false;
						break;
					} else if(gcdCommon == resultGCD){
						gcd = resultGCD;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		int testCases = Integer.parseInt(myScan.nextLine());

		for (int i = 0; i < testCases; i++) {

			int elements = Integer.parseInt(myScan.nextLine());

			int[] testSet = new int[elements];
			String[] valString = myScan.nextLine().split("\\s+");

			for (int j = 0; j < valString.length; j++) {
				testSet[j] = Integer.parseInt(valString[j]);
			}
			boolean result = new SherlockAndGCD().isGCDPresent(testSet);
			if (result == false) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		myScan.close();
	}

}
