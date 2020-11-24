package examples.pubhub.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

import examples.pubhub.dao.TagDAO;
import examples.pubhub.dao.TagDAOImpl;
import examples.pubhub.utilities.DAOUtilities;

public class TestTagDAO {
	
	public static TagDAO getTagDAO() {
		return new TagDAOImpl();
	}

	public static void main(String[] args)  {
		
		TagDAO tagDAO = new TagDAOImpl();
		String tag = "The Adventures of Steve";
		tagDAO.getAllBooksWithTag(tag);
		
		tagDAO.getAllBooksOnlyIfTheyHaveATag();
		
//		try {
//			Connection conn = DAOUtilities.getConnection_2();
//			Statement st = conn.createStatement();
//
//			ResultSet rs = st.executeQuery("SELECT * FROM world.book_tags");
//			rs = st.executeQuery("SELECT c.* FROM world.books c LEFT OUTER JOIN world.book_tags b ON c.isbn_13 = b.isbn_13 WHERE tag_name='The Adventures of Steve'");
//			ResultSetMetaData rsmd = rs.getMetaData();
//
//			int columnsNumber = rsmd.getColumnCount();
//			
//			while (rs.next()) {
//				//Print one row          
//				for(int i = 1 ; i <= columnsNumber; i++){
//
//					System.out.print(rs.getString(i) + " "); //Print one element of a row
//
//				}
//					System.out.println();//Move to the next line to print the next row.           
//
//		    }
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			
//    		conn = DAOUtilities.getConnection_2();
//    		PreparedStatement c = conn.prepareStatement("SELECT * FROM world.book_tags SELECT c.* FROM world.books c LEFT OUTER JOIN world.book_tags b ON c.isbn_13 = b.isbn_13 WHERE tag_name='The Adventures of Steve'");
//    		ResultSet rs=c.executeQuery();
//    		ResultSetMetaData rsmd = rs.getMetaData();
//
//    		int columnsNumber = rsmd.getColumnCount();
//    		System.out.println(columnsNumber);
//    		
//    		System.out.println("Table has been completed");
//		} 
//    	catch (Exception e) {System.out.println(e);} 
		
//		Connection conn;
//		TagDAO tagDAO = new TagDAOImpl();
//		
//		try {
//			conn = DAOUtilities.getConnection_1();
//			String sql = "SELECT * FROM world.book_tags; \r\n" + 
//					"\r\n" + 
//					"SELECT b.* FROM world.books b LEFT OUTER JOIN world.book_tags bt ON b.isbn_13 = bt.isbn_13 WHERE tag_name='The Adventures of Steve'";
//			PreparedStatement  st = conn.prepareStatement(sql);
//			ResultSet rs = st.executeQuery(sql);
//			ResultSetMetaData rsmd = rs.getMetaData();
//			
//			int columnsNumber = rsmd.getColumnCount();
//			System.out.println(columnsNumber);
//			
//			String tag = "The Adventures of Steve";
//			tagDAO.getAllBooksWithTag(tag);
//			
//			while (rs.next()) {
//				//Print one row          
//				for(int i = 1 ; i <= columnsNumber; i++){
//
//				      System.out.print(rs.getString(i) + " "); //Print one element of a row
//
//				}
//
//				  System.out.println();//Move to the next line to print the next row.           
//
//				    }
//			
//			
//		} catch (SQLException e) {
//			System.out.println("SQL Expection. Error:");
//			e.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("Expection. Error:");
//			e.printStackTrace();
//		}
		
	}
	
}
