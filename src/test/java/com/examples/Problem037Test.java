package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class Problem037Test {

	private final Problem037 problemToTest = new Problem037();
	
	@Test
	@DisplayName("Tests for arrays")
	void arrayproblemToTests() {
		assertThat(problemToTest.generatePowerSet(generateSet(0)), is(expected0));
		assertThat(problemToTest.generatePowerSet(generateSet(1)), is(generateExpected1()));
		assertThat(problemToTest.generatePowerSet(generateSet(2)), is(generateExpected2()));
		assertThat(problemToTest.generatePowerSet(generateSet(3)), is(generateExpected3()));
		assertThat(problemToTest.generatePowerSet(generateSet(4)), is(generateExpected4()));
	}
	
	@Test
	@DisplayName("Tests for lists")
	void listproblemToTests() {
		assertThat(problemToTest.generatePowerSet(generateList(0)), is(expected0));
		assertThat(problemToTest.generatePowerSet(generateList(1)), is(generateExpected1()));
		assertThat(problemToTest.generatePowerSet(generateList(2)), is(generateExpected2()));
		assertThat(problemToTest.generatePowerSet(generateList(3)), is(generateExpected3()));
		assertThat(problemToTest.generatePowerSet(generateList(4)), is(generateExpected4()));
	}

	private Integer[] generateSet(int setSize) {
		List<Integer> result = new ArrayList<Integer>(0);
		for (int counter = 1; counter <= setSize; counter++)
			result.add(counter);
		return result.toArray(new Integer[result.size()]);
	}

	private List<Integer> generateList(int setSize) {
		List<Integer> result = new ArrayList<Integer>(0);
		for (int counter = 1; counter <= setSize; counter++)
			result.add(counter);
		return result;
	}

	List<List<Integer>> expected0 = Arrays.asList(new ArrayList<Integer>(0));
	
	private List<List<Integer>> generateExpected1() {
		List<List<Integer>> expected = new ArrayList<List<Integer>>(0);
 		List<Integer> item0 = new ArrayList<Integer>(0);
 		List<Integer> item1 = new ArrayList<Integer>(Arrays.asList(1));
 		expected.add(item0);
 		expected.add(item1);
 		return expected;
	}
	
	private List<List<Integer>> generateExpected2() {
		List<List<Integer>> expected = new ArrayList<List<Integer>>(0);
 		List<Integer> item0 = new ArrayList<Integer>(0);
 		List<Integer> item1 = new ArrayList<Integer>(Arrays.asList(1));
 		List<Integer> item2 = new ArrayList<Integer>(Arrays.asList(2));
 		List<Integer> item3 = new ArrayList<Integer>(Arrays.asList(1, 2));
 		expected.add(item0);
 		expected.add(item1);
 		expected.add(item2);
 		expected.add(item3);
 		return expected;
	}

	private List<List<Integer>> generateExpected3() {
		List<List<Integer>> expected = new ArrayList<List<Integer>>(0);
 		List<Integer> item0 = new ArrayList<Integer>(0);
 		List<Integer> item1 = new ArrayList<Integer>(Arrays.asList(1));
 		List<Integer> item2 = new ArrayList<Integer>(Arrays.asList(2));
 		List<Integer> item3 = new ArrayList<Integer>(Arrays.asList(3));
 		List<Integer> item4 = new ArrayList<Integer>(Arrays.asList(1, 2));
 		List<Integer> item5 = new ArrayList<Integer>(Arrays.asList(1, 3));
 		List<Integer> item6 = new ArrayList<Integer>(Arrays.asList(2, 3));
 		List<Integer> item7 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
 		expected.add(item0);
 		expected.add(item1);
 		expected.add(item2);
 		expected.add(item3);
 		expected.add(item4);
 		expected.add(item5);
 		expected.add(item6);
 		expected.add(item7);
 		return expected;
	}

	private List<List<Integer>> generateExpected4() {
		List<List<Integer>> expected = new ArrayList<List<Integer>>(0);
		List<Integer> item0 = new ArrayList<Integer>(0);
 		List<Integer> item1 = new ArrayList<Integer>(Arrays.asList(1));
 		List<Integer> item2 = new ArrayList<Integer>(Arrays.asList(2));
 		List<Integer> item3 = new ArrayList<Integer>(Arrays.asList(3));
 		List<Integer> item4 = new ArrayList<Integer>(Arrays.asList(4));
 		List<Integer> item5 = new ArrayList<Integer>(Arrays.asList(1, 2));
 		List<Integer> item6 = new ArrayList<Integer>(Arrays.asList(1, 3));
 		List<Integer> item7 = new ArrayList<Integer>(Arrays.asList(2, 3));
 		List<Integer> item8 = new ArrayList<Integer>(Arrays.asList(1, 4));
 		List<Integer> item9 = new ArrayList<Integer>(Arrays.asList(2, 4));
 		List<Integer> item10 = new ArrayList<Integer>(Arrays.asList(3, 4));
 		List<Integer> item11 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
 		List<Integer> item12 = new ArrayList<Integer>(Arrays.asList(1, 2, 4));
 		List<Integer> item13 = new ArrayList<Integer>(Arrays.asList(1, 3, 4));
 		List<Integer> item14 = new ArrayList<Integer>(Arrays.asList(2, 3, 4));
 		List<Integer> item15 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
 		expected.add(item0);
 		expected.add(item1);
 		expected.add(item2);
 		expected.add(item3);
 		expected.add(item4);
 		expected.add(item5);
 		expected.add(item6);
 		expected.add(item7);
 		expected.add(item8);
 		expected.add(item9);
 		expected.add(item10);
 		expected.add(item11);
 		expected.add(item12);
 		expected.add(item13);
 		expected.add(item14);
 		expected.add(item15);
 		return expected;
	}
	
}
