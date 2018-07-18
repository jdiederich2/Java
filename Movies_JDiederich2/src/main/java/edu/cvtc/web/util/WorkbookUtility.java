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

import edu.cvtc.web.model.Movie;

/**
 * @author JDiederich2
 *
 */
public class WorkbookUtility {

public static final String INPUT_FILE = "/assets/Movies.xlsx";  
	
	public static List<Movie> retrieveMoviesFromWorkbook(final File inputFile) throws InvalidFormatException, IOException {
		
		final List<Movie> movies = new ArrayList<>();
		
		// Step 1.  Create a reference to the workbook
		final Workbook workbook = WorkbookFactory.create(inputFile);
		
		// Step 2.  Create a reference to the Sheet
		final Sheet sheet = workbook.getSheetAt(0);
		
		// Step 3.  Iterate over each Row in the Sheet
		for (final Row row : sheet) {						
			
			final Cell titleCell = row.getCell(0);
			final Cell directorCell = row.getCell(1);
			final Cell lengthInMinutesCell = row.getCell(2);
			final Cell movieDescCell = row.getCell(3);

			final Movie movie = new Movie(
					titleCell.getStringCellValue().trim(), 
					directorCell.getStringCellValue().trim(), 
					(int) lengthInMinutesCell.getNumericCellValue(), 
					movieDescCell.getStringCellValue().trim());
			
			movies.add(movie);
		}
		
		return movies;
		
	}
}
