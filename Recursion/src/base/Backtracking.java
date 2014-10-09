package base;

//Generating all string of n bits assuming A[0..n-1] is array of size n
public class Backtracking {

	int[] A;
	
	void Binary(int n){
		if(n<1){
			for(int i : A)
			System.out.print(i);
			System.out.println();
		}else{
			A[n-1] = 0;
			Binary(n-1);
			A[n-1] = 1;
			Binary(n-1);
		}
	}
	public static void main(String[] args) {
		int n = 3;
		Backtracking backtracking = new Backtracking();
		backtracking.A = new int[n];
		backtracking.Binary(n);
	}
}
