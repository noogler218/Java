package base;

public class Factorial {
	
	int getFactorial(int n){
		if(n==1)
			return 1;
		else if(n==0)
			return 1;
		else 
			return n*getFactorial(n-1);
	}
	public static void main(String[] args) {
		System.out.println(new Factorial().getFactorial(5));
	}
}