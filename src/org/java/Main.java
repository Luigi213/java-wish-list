package org.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> wishList = new ArrayList<>();
		
		while(true) {
			System.out.println("Cosa desideri");
			String wish = in.nextLine();
			wishList.add(wish);
			
			System.out.println("Ecco la tua lista:");
			for (String val : wishList) {
				System.out.println(val);
			}
			
			System.out.println("1 - vuoi continuare");
			System.out.println("2 - vuoi uscire");
			
			int choise = in.nextInt();
			if(choise < 1 && choise > 2) {
				continue;
			}
			if(choise == 2) break;
			in.nextLine();
		}
		System.out.println(wishList);
	}
}
