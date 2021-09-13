package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem037 {

	public static void main(String[] args) {
		Problem037 test = new Problem037();
		System.out.println(Arrays.asList(test.generateSet(0)) + " -> " + test.generatePowerSet(test.generateSet(0)));
		System.out.println(Arrays.asList(test.generateSet(1)) + " -> " + test.generatePowerSet(test.generateSet(1)));
		System.out.println(Arrays.asList(test.generateSet(2)) + " -> " + test.generatePowerSet(test.generateSet(2)));
		System.out.println(Arrays.asList(test.generateSet(3)) + " -> " + test.generatePowerSet(test.generateSet(3)));
		System.out.println(Arrays.asList(test.generateSet(4)) + " -> " + test.generatePowerSet(test.generateSet(4)));
		System.out.println(test.generateList(0) + " -> " + test.generatePowerSet(test.generateList(0)));
		System.out.println(test.generateList(1) + " -> " + test.generatePowerSet(test.generateList(1)));
		System.out.println(test.generateList(2) + " -> " + test.generatePowerSet(test.generateList(2)));
		System.out.println(test.generateList(3) + " -> " + test.generatePowerSet(test.generateList(3)));
		System.out.println(test.generateList(4) + " -> " + test.generatePowerSet(test.generateList(4)));
	}

	List<List<Integer>> generatePowerSet(Integer[] set) {
		return generatePowerSet(set, set.length);
	}
	
	private List<List<Integer>> generatePowerSet(Integer[] set, int lastItemIndex) {
		List<List<Integer>> out = new ArrayList<List<Integer>>(0);
		if (lastItemIndex == 0) {
			out.add(new ArrayList<Integer>(0));
		} else {
			int lastItem = set[lastItemIndex - 1];
			out = generatePowerSet(set, lastItemIndex - 1);
			List<List<Integer>> copy = new ArrayList<List<Integer>>(0);
			out.forEach(item -> copy.add(new ArrayList<Integer>(item)));
			for (List<Integer> data : copy) {
				data.add(lastItem);
				out.add(data);
			}
			out.sort((item1, item2) -> item1.size() - item2.size());
		}
		return out;
	}

	List<List<Integer>> generatePowerSet(List<Integer> set) {
		List<List<Integer>> out = new ArrayList<List<Integer>>(0);
		if (set.size() == 0) {
			out.add(new ArrayList<Integer>(0));
		} else {
			int lastItem = set.remove(set.size() - 1);
			out = generatePowerSet(set);
			List<List<Integer>> copy = new ArrayList<List<Integer>>(0);
			out.forEach(item -> copy.add(new ArrayList<Integer>(item)));
			for (List<Integer> data : copy) {
				data.add(lastItem);
				out.add(data);
			}
			out.sort((item1, item2) -> item1.size() - item2.size());
		}
		return out;
	}

	Integer[] generateSet(int setSize) {
		List<Integer> result = new ArrayList<Integer>(0);
		for (int counter = 1; counter <= setSize; counter++)
			result.add(counter);
		return result.toArray(new Integer[result.size()]);
	}

	List<Integer> generateList(int setSize) {
		List<Integer> result = new ArrayList<Integer>(0);
		for (int counter = 1; counter <= setSize; counter++)
			result.add(counter);
		return result;
	}

}