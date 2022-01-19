package longestIncreasingSubsequence;

import java.util.*;
import Sequence.*;

public class LongestIncreasingSubsequence {
	
	private Sequence s;
	public Sequence getSG() {
		return s;
	}
	
	public void getLength() {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter length of ArrayList: ");
	int input = scan.nextInt();
	s = new Sequence(input);
	s.GenerateSequence();
	scan.close();
	}
	
	public void findLIS() {
	System.out.print("Sequence: ");
	s.printSequence();
	ArrayList<Integer> sequence = s.getSequence();
				
	int start = 0, end = 0, longest = 0, tempStart = 0, tempLongest = 0;
		for (int i = 1; i < sequence.size(); i++) {			
			if (sequence.get(i) > sequence.get(i-1)) {
				if (tempLongest == 0) {
					tempStart = i;
				}
				tempLongest++;
			} 
			else if (tempLongest > longest) {
				start = tempStart;
				longest = tempLongest;
				tempLongest = 0;
				end = i;
			} 
			else {
				tempLongest = 0;
			}
		}
		
		System.out.print("Longest Subsequence: ");
		for (int j = start - 1; j < end; j++ ) {
			System.out.print(" " + sequence.get(j));
		}
		System.out.println();
	
	}

	public static void main(String [] args) {
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		lis.getLength();
		lis.findLIS();

	}
}