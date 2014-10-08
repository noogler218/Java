package base;

public class TowerOfHanoi {

   void TOH(int n, int A , int B , int C){
	    if (n>0){
	        TOH(n-1,A,C,B);
	        System.out.println("Move a disk from tower " + A +" to tower " + C);
	        TOH(n-1,B,A,C);
	    }
	}

	public static void main(String[] args) {
	    new TowerOfHanoi().TOH(3, 1, 2, 3);
	}   
}
