package Sequence;

import java.util.*;

public class Sequence {
		
	private int size;
	private ArrayList<Integer> a; 
	public Sequence(int length) {
		size = length;
	}
	
	public void GenerateSequence() {
		Random random = new Random();
		a = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			a.add(random.nextInt(200));
		}
	}
	
	public ArrayList<Integer> getSequence(){
		return a;
	}
	
	public void printSequence() {
		System.out.println(a);
	}
}