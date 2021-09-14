package com.examples;

import java.util.ArrayList;
import java.util.List;

public class Problem037 {

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

}