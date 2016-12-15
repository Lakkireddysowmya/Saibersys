package usingJDBC;

public class DBException extends Exception {
	public DBException(Exception e) {
        super(e);  // handling exception from super method of the exception class
    }
}
