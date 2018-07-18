/**
 * 
 */
package edu.cvtc.web.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import edu.cvtc.web.model.Person;

/**
 * @author JDiederich2
 *
 */
public class WorkbookUtility {
	
	public static final String INPUT_FILE = "/assets/JavaWebProgramming.xlsx";  
	
	public static List<Person> retrievePeopleFromWorkbook(final File inputFile) throws InvalidFormatException, IOException {
		
		final List<Person> people = new ArrayList<>();
		
		// Step 1.  Create a reference to the workbook
		final Workbook workbook = WorkbookFactory.create(inputFile);		// As long as the file is an excel spreadsheet, new workbook will be created. 
		
		// Step 2.  Create a reference to the Sheet
		final Sheet sheet = workbook.getSheetAt(0);
		
		// Step 3.  Iterate over each Row in the Sheet
		for (final Row row : sheet) {						// For each loop
			
			final Cell firstNameCell = row.getCell(0);
			final Cell lastNameCell = row.getCell(1);
			final Cell ageCell = row.getCell(2);
			final Cell favoriteColorCell = row.getCell(3);
			
			// String firstName = firstNameCell.getStringCellValue().trim();			// Taking the string cell value, triming and assigning it to first name
			
			final Person person = new Person(
					firstNameCell.getStringCellValue().trim(), 
					lastNameCell.getStringCellValue().trim(), 
					(int) ageCell.getNumericCellValue(), 
					favoriteColorCell.getStringCellValue().trim());
			
			people.add(person);
		}
		
		return people;
		
	}

}
