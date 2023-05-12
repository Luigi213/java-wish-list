package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainMap {
	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		List<String> split = Arrays.asList(str.split(" "));
		
		Map<String, Integer> mapArr = new HashMap<>();
			
		for (String c : split) {
			if (mapArr.containsKey(c)) {
				
				mapArr.put(c, mapArr.get(c) + 1);
			} else {
				
				mapArr.put(c, 1);
			}
		}
		System.out.println(mapArr);
		
		System.out.println("----------------");
		
		for (String c : split) {
			if(c.equals("#")) {
				mapArr.remove(c, mapArr.get(c));
			} else if(c.equals("-")) {
				mapArr.remove(c, mapArr.get(c));
			} else if(c.equals("!")) {
				mapArr.remove(c, mapArr.get(c));
			} else if(c.equals(";")) {
				mapArr.remove(c, mapArr.get(c));
			}
		}
		System.out.println(mapArr);

	}
}
