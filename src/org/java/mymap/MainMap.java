package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainMap {
	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		
		Map<String, Integer> mapArr = new HashMap<>();
			
		for (String c : Arrays.asList(str.split(" "))) {
			if (mapArr.containsKey(c)) {
				
				mapArr.put(c, mapArr.get(c) + 1);
			} else {
				
				mapArr.put(c, 1);
			}
		}
		System.out.println(mapArr);
		
		System.out.println("----------------");
		
		mapArr.clear();
		
		String newstr = removeAllNonAlphaNumeric(str);
		
		for (String c : Arrays.asList(newstr.split(" "))) {
			if (mapArr.containsKey(c)) {
				
				mapArr.put(c, mapArr.get(c) + 1);
			} else {
				
				mapArr.put(c, 1);
			}
		}
		System.out.println(mapArr);
		
	}
	
	public static String removeAllNonAlphaNumeric(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[^A-Za-z0-9] ", "");
    }
}
