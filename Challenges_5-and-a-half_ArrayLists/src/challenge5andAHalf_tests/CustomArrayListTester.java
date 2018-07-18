package challenge5andAHalf_tests;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import challenge5andAHalf.CustomArrayList;


public class CustomArrayListTester {
	
	private CustomArrayList	arrayList;
	
	
	private String testString = "test";
	
	
	@Before
	public void setUp() throws Exception {
		arrayList = new CustomArrayList();
	}
	
	
	@Test
	public void testCustomArrayListCreatedWithDefaultArraySize() {
		assertThat(arrayList.arraySize(), is(CustomArrayList.DEFAULT_STARTING_ARRAY_SIZE));
	}
	
	
	@Test
	public void testCustomArrayListCreatedWithSizeIsSpecifiedArraySize() {
		arrayList = new CustomArrayList(15);
		assertThat(arrayList.arraySize(), is(15));
	}
	
	
	@Test
	public void testCanAddObjectToCustomArrayList() {
		assertThat(arrayList.add(testString), is(true));
	}
	
	
	@Test
	public void testAddingObjectsIncreasesCustomArrayListSize() {
		arrayList = new CustomArrayList();
		arrayList.add(testString);
		assertThat(arrayList.size(), is(1));
	}
	
	
	@Test
	public void testAddingObjectsAtIndexIsPossible() {
		arrayList = new CustomArrayList();
		arrayList.add(testString);
		arrayList.add(testString);
		assertThat(arrayList.add("hello", 1), is(true));
	}
	
	
	@Test
	public void testAddingObjectsAtBeginningIsPossible() {
		arrayList = new CustomArrayList();
		arrayList.add(testString);
		arrayList.add(testString);
		assertThat(arrayList.addToBeginning("hello"), is(true));
	}
	
	
	@Test
	public void testRemovingObjectsIsPossible() {
		arrayList = new CustomArrayList();
		arrayList.add(testString);
		assertThat(arrayList.remove(testString), is(true));
	}
	
	
	@Test
	public void testRemovingObjectsAtAnIndexIsPossible() {
		arrayList = new CustomArrayList();
		arrayList.add(testString);
		arrayList.add(testString);
		assertThat(arrayList.removeAt(1), is(true));
	}
	
	
	@Test
	public void testRemovingObjectsDecreasesSize() {
		arrayList = new CustomArrayList();
		arrayList.add(testString);
		arrayList.add(testString);
		arrayList.add(testString);
		arrayList.add(testString);
		arrayList.removeAt(1);
		assertThat(arrayList.size(), is(3));
	}
	
	
	@Test
	public void testCheckingIfListContainsObjectIsPossible() {
		arrayList = new CustomArrayList();
		arrayList.add(testString);
		assertThat(arrayList.contains(testString), is(true));
	}
	
	
	@Test
	public void testArrayListArraySizeIncreasesWhenPushedBeyondLimit() {
		arrayList = new CustomArrayList();
		int current = arrayList.arraySize();
		arrayList.add(testString);
		arrayList.add(testString);
		arrayList.add(testString);
		arrayList.add(testString);
		arrayList.add(testString);
		arrayList.add(testString);
		arrayList.add(testString);
		assertTrue(arrayList.arraySize() > current);
	}
	
}
