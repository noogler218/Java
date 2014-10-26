package warmup;

import java.util.ArrayList;
import java.util.Scanner;


//You are given N sticks, where each stick is of positive integral length. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.
//
//Suppose we have 6 sticks of length
//
//5 4 4 2 2 8
//then in one cut operation we make a cut of length 2 from each of the 6 sticks. For next cut operation 4 sticks are left (of non-zero length), whose length are
//
//3 2 2 6
//Above step is repeated till no sticks are left.
//
//Given length of N sticks, print the number of sticks that are cut in subsequent cut operations.
//
//Input Format 
//The first line contains a single integer N. 
//The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.
//
//Output Format 
//For each operation, print the number of sticks that are cut in separate line.
//
//Constraints 
//1 ≤ N ≤ 1000 
//1 ≤ ai ≤ 1000


public class CutTheStick {

	private int findMinStick(ArrayList<Integer> sticksLength){
		
		int min = sticksLength.get(0);
		for(int i=1;i<sticksLength.size();i++){
			int val = sticksLength.get(i);
			if(val==0){
				continue;
			}
			if(val<min||min==0){
				min = sticksLength.get(i);
			}
		}
		return min;
	}
	
	private void printCutStickOperation(ArrayList<Integer> sticksLength){
		if(sticksLength==null||sticksLength.isEmpty()){
			System.out.println("Check arrayList. Can't be empty");
			return;
		}
		boolean allSticksReduced = false;
		
		while(!allSticksReduced){
			
			int min = findMinStick(sticksLength);
			if(min==0){
				allSticksReduced=true;
				break;
			}else{
				int totalSticks = 0;
				for(int i =0;i<sticksLength.size();i++){
					int val = sticksLength.get(i);
					if(val!=0){
					totalSticks++;
					sticksLength.set(i, sticksLength.get(i)-min);
					}
				}
				System.out.println(totalSticks);
			}
		}
	}
	
	public void prepareCutStickOperations(){
		 Scanner in = new Scanner(System.in);
		 int totalSticks = Integer.parseInt(in.nextLine());
		 ArrayList<Integer> sticksLength = new ArrayList<Integer>(totalSticks);
		 
		 String[] sticks= in.nextLine().split("\\s+");
		 for(String len :sticks){
			 sticksLength.add(Integer.parseInt(len));
		 }
		 printCutStickOperation(sticksLength);
	     in.close();
	}
	
	public static void main(String[] args) {
		new CutTheStick().prepareCutStickOperations();
	}
}
