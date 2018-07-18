/**
 * 
 */
package edu.cvtc.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * @author JDiederich2
 *
 */
public class GroupSorter {
	
	private static final String INPUT_FILE = "roster.txt";
	private static final int NUMBER_OF_GROUPS = 5;

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// Declare variables for the program
		final File inputFile = new File(INPUT_FILE);
		final Scanner scanner = new Scanner(inputFile);
		
		final ArrayList<String> students = new ArrayList<>();
		
		// Populate the students ArrayList
		while (scanner.hasNext()) {
			final String student = scanner.nextLine();
			students.add(student);
		}
		
		// Randomize the students
		final long seed = System.nanoTime();
		Collections.shuffle(students, new Random(seed));
		Collections.shuffle(students, new Random(seed));
		
		// Create empty groups
		// Array of ArrayLists for 5 groups
		final ArrayList<ArrayList<String>> groups = new ArrayList<>();
		for (int i = 0; i < NUMBER_OF_GROUPS; i++) {
			groups.add(new ArrayList<>());
		}
		
		// Add values to the empty groups
		// Divide students into groups
		int groupIndex = 0;
		for (final String student : students) {		// For each student in Students ArrayList
			
			groups.get(groupIndex).add(student);
			
			if (groupIndex < NUMBER_OF_GROUPS - 1) {
				groupIndex += 1;	
			} else {
				groupIndex = 0;
			}
		}
		
		// Output the groups
		groupIndex = 0;
		for (final ArrayList<String> group : groups) {
			
			// Header
			System.out.println("Group " + (groupIndex + 1));
			
			for (final String student : group) {
				System.out.println(student);
			}
			
			// Insert a blank line between each group
			System.out.println();
			
			groupIndex += 1;
		}
		
		scanner.close();
		
	}

}
