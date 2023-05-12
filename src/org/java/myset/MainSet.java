package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		Random rdm = new Random();
		
		int low = 2;
		int high = 13;

		Set<Integer> mySet = new HashSet<>();
		int i = 5;
		while(mySet.size() < i) {	
			int randomNumber = rdm.nextInt(high - low) + low;
			mySet.add(randomNumber);
		};
		System.out.println(mySet);
	}
}
