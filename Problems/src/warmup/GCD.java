package warmup;
import java.math.BigInteger;
import java.util.Scanner;

//Find Greatest Common Divisor

public class GCD {
	
	public int findGCDApproachBasic(int a , int b){
		if(b==0) return a;
		else {return findGCDApproachBasic(b,a%b);}
	}
	
	public int findGCDApproachFunctional(int a , int b){
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Basic Approach : "+new GCD().findGCDApproachBasic(a, b));
		System.out.println("Functional Approach : "+new GCD().findGCDApproachFunctional(a, b));
		
		scanner.close();
		
	}
}
