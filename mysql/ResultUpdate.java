package jdbc;

import java.sql.*;
import java.util.Properties;
public class ResultUpdate {
 public static void main (String[] args)       {
Connection conn = null;
try
    {
	//step1 load the driver class  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  String url="10.113.17.162";
	//step2 create  the connection object 
	 
	  Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@//10.113.17.162:1521/orcl","hr","nidhi");  
	 
	//step3 create the statement object  

Statement stmt =  con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
		ResultSet.CONCUR_UPDATABLE);
ResultSet rs = stmt.executeQuery("SELECT E.* FROM EMPL E");
System.out.println("Before...");
System.out.println("ECODE  EName");
while (rs.next() ) {
System.out.println( rs.getInt(1) +"      "+rs.getString(2));
}
//inserting a new row
 	rs.moveToInsertRow();
	rs.updateInt("ECODE", 1);
	rs.updateString("Ename", "Geeta");
	rs.insertRow();
	//updating 2nd row – changing name to Seetha
	rs.absolute(2); 
    rs.updateString(2,"Seetha"); 
	rs.updateRow(); 

 rs.beforeFirst();      
System.out.println("After...");
//rs.updateString("Ename", "Geeta");
while (rs.next() ) {
System.out.println( rs.getInt(1) +"      "+rs.getString(2));}}
catch (Exception e) {  System.out.println (e); e.printStackTrace();
}
finally {if (conn != null)    {
try {conn.close ();} catch (SQLException e) { }     }         }     } }

