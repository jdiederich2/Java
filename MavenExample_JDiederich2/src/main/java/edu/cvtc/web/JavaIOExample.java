
package edu.cvtc.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import edu.cvtc.web.model.Person;
import edu.cvtc.web.util.WorkbookUtility;

/**
 * @author JDiederich2
 */
public class JavaIOExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	  
		
		try {			
			
			final File inputFile = new File(WorkbookUtility.INPUT_FILE); 
			final List<Person> people = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);
			
			for (final Person person : people) {
				
				if (person.getFavoriteColor().equalsIgnoreCase("green")) {
				
				System.out.println(person);
					
				}				
			}
			
		} catch (InvalidFormatException | IOException e) {
			
			e.printStackTrace();
		}		
		
	}

}
