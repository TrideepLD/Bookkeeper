

## Submissions

### For A2.0 and A2.1
	The Submission would be All Files in database_files

### A2.2
	The File should include TagDAO and TagDAOImpl java files in examples.pubhub.dao
	

### A3
	This is the Tag class in examples.pubhub.model

### A3.1 and A3.2

	This is includes files TagDAO, TagDAOImpl and TestTagDAO.<br>
		The First two files are in examples.pubhub.dao<br>
		The Final File is in examples.pubhub.test<br>


## Things to note:
- I used my JDBC driver and a MySQL community server as opposed to postgreSQL<br>
- Let me know if any changes required or if I missed anything. Admittingly it took me longer than expected mostly because I made really silly errors during testing<br>
- You should be able to test all methods by calling printContent(rs, rsmd) in rs.next while block.<br>

- There is also 2 implementations of the connection method called getConnection_1 and getConnection_2.<br>
	There is slight difference in functionality so if 1 doesn't connect, you can troubleshoot with the other.<br>
	_2 is my skeleton implementation that I use to test everything connection wise.<br>
	_1 was left there for ease of use for you.<br>


As such, here are a few things you may need to change:<br>
File: DAOUtilities. <br>
Location: examples.pubhub.utilities<br>
To change:
- Line 22 -> The value inside Class.forName. This should be your postgre driver<br>
- Line 49 -> Driver again, should be your postgre Driver<br>
- Line 50 -> The URL should be your database URL<br>