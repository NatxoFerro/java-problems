package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem037 {

	public static void main(String[] args) {
		Problem037 test = new Problem037();
		System.out.println(Arrays.asList(test.generateSet(0)) + " -> " + test.checkPowerSet(test.generateSet(0)));
		System.out.println(Arrays.asList(test.generateSet(1)) + " -> " + test.checkPowerSet(test.generateSet(1)));
		System.out.println(Arrays.asList(test.generateSet(2)) + " -> " + test.checkPowerSet(test.generateSet(2)));
		System.out.println(Arrays.asList(test.generateSet(3)) + " -> " + test.checkPowerSet(test.generateSet(3)));
		System.out.println(Arrays.asList(test.generateSet(4)) + " -> " + test.checkPowerSet(test.generateSet(4)));
	}

	List<List<Integer>> checkPowerSet(Integer[] set) {
		List<Integer> in = new ArrayList<Integer>(0);
		List<List<Integer>> out = new ArrayList<List<Integer>>(0);
		out.add(new ArrayList<Integer>(0));
		for (int item = 0; item < set.length; item++) {
			out.addAll(checkCombinations(in, set));
			in.add(set[item]);
		}
		return out;
	}

	List<List<Integer>> checkCombinations(List<Integer> array, Integer[] set) {
		List<List<Integer>> result = new ArrayList<List<Integer>>(0);
		for (int item = array.size(); item < set.length; item++) {
			List<Integer> partial = new ArrayList<Integer>(0);
			partial.addAll(array);
			partial.add(set[item]);
			result.add(partial);
		}
		return result;
	}

	Integer[] generateSet(int setSize) {
		List<Integer> result = new ArrayList<Integer>(0);
		for (int counter = 1; counter <= setSize; counter++)
			result.add(counter);
		return result.toArray(new Integer[result.size()]);
	}

}