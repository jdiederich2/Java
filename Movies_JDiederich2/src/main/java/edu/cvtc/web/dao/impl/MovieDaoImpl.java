/**
 * 
 */
package edu.cvtc.web.dao.impl;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.model.Movie;
import edu.cvtc.web.util.DBUtility;
import edu.cvtc.web.util.WorkbookUtility;

/**
 * @author Jennifer Diederich
 *
 */
public class MovieDaoImpl implements MovieDao {
	
	private static final String DROP_TABLE_MOVIE = "drop table if exists movie;";
	private static final String CREATE_TABLE_MOVIE = "create table movie (id integer primary key autoincrement, title text, director text, lengthInMinutes integer, movieDesc text);";
	private static final String SELECT_ALL_FROM_MOVIE = "select * from movie;";
	
	

	@Override
	public void populate(final String filePath) throws MovieDaoException {
		
		Connection connection = null;
		Statement statement = null;

		// Create new connection, create statement object to execute sql statements
		// Need a driver manager to do so, must register the driver we want to use.  In this case org.sql
		try {
			connection = DBUtility.createConnection();
			// create statement
			statement = connection.createStatement();
			
			// Set properties
			statement.setQueryTimeout(DBUtility.TIMEOUT);
			
			// CHECK TO SEE IF TABLE EXISTS - IF YES, TRY TO DROP
			statement.executeUpdate(DROP_TABLE_MOVIE);
			statement.executeUpdate(CREATE_TABLE_MOVIE);
			
			// Populate the person table using WorkbookUtility
			final File inputFile = new File(filePath);
			final List<Movie> movies = WorkbookUtility.retrieveMoviesFromWorkbook(inputFile);
			
			for (final Movie movie : movies) {
				final String insertValues = "insert into movie (title, director, lengthInMinutes, movieDesc) "
						+ "values ('" + movie.getTitle() + "', "
						+ "'" + movie.getDirector() + "', "
						+ movie.getLengthInMinutes() + ", "
						+ "'" + movie.getMovieDesc() + "');";
					
				
				System.out.println(insertValues);  // NOTES: Log message to console so we can see data being added to database.
				
				statement.executeUpdate(insertValues);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();   // Printed to application logs
			throw new MovieDaoException("Error: Class Not Found Exception: Unable to populate database.");
			
		} catch (SQLException e) {
			e.printStackTrace();   // Printed to application logs
			throw new MovieDaoException("Error: SQL Exception: Unable to populate database.");
			
		} catch (InvalidFormatException e) {
			e.printStackTrace();   // Printed to application logs
			throw new MovieDaoException("Error: Invalid Format Exception: Unable to populate database.");
			
		} catch (IOException e) {
			e.printStackTrace();   // Printed to application logs
			throw new MovieDaoException("Error: IOException: Unable to populate database.");
			
		} finally {
			DBUtility.closeConnections(connection, statement);
		}
	}

	
	@Override
	public List<Movie> retrieveMovies() throws MovieDaoException {
		
		Connection connection = null;
		Statement statement = null;
		
		final List<Movie> movies = new ArrayList<>();
		
		try {
			
			connection = DBUtility.createConnection();
			statement = connection.createStatement();
			
			statement.setQueryTimeout(DBUtility.TIMEOUT);
			
			// resultSet now contains data returned from the query.
			// ResultSet as an object - call methods on, call method .next will return true if there is another line, false if not.
			final ResultSet resultSet = statement.executeQuery(SELECT_ALL_FROM_MOVIE);
			
			// While pulling data from database, create new list of person objects name people
			while (resultSet.next()) {
				final String title = resultSet.getString("title");
				final String director = resultSet.getString("director");
				final int lengthInMinutes = resultSet.getInt("lengthInMinutes");
				final String movieDesc = resultSet.getString("movieDesc");
				
				movies.add(new Movie(title, director, lengthInMinutes, movieDesc));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new MovieDaoException("Error: Unable to retrieve movies.");
		} finally {
			DBUtility.closeConnections(connection, statement);
		}
		
		return movies;
	}


	@Override
	public void insertMovie(Movie movie) throws MovieDaoException {
		
		Connection connection = null;
		
		// Will skip anything that is java related from import file.. () {} etc
		PreparedStatement insertStatement = null;
		
		try {
			
			connection = DBUtility.createConnection();
			
			final String sqlStatement = "insert into movie (title, director, lengthInMinutes, movieDesc) values (?,?,?,?);";
			
			insertStatement = connection.prepareStatement(sqlStatement);
			
			// replace ??? with values that should be used
			insertStatement.setString(1, movie.getTitle());
			insertStatement.setString(2, movie.getDirector());
			insertStatement.setInt(3, movie.getLengthInMinutes());
			insertStatement.setString(4, movie.getMovieDesc());
			
			insertStatement.setQueryTimeout(DBUtility.TIMEOUT);
			
			insertStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new MovieDaoException("Error: Unable to add this movie to the database.");  
			
		} finally {
			DBUtility.closeConnections(connection, insertStatement);
		}
	}
}
