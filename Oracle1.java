/*import java.sql.*;
 // import java.sql.Connection;
//  import java.sql.DriverManager;
//  import java.sql.Statement;
  public class Oracle1{
    public static void main(String[] args) throws Exception
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","54321");
     Statement stmt=con.createStatement();
       //stmt.execute("create table person(sno int,name varchar(20),age int)");
       stmt.execute("insert into person values(1,'akash',21)");
      System.out.println("done");
                }
             }*/

  import java.sql.*;

public class Oracle1{
       public static void main(String[] args){
       		try{
 	               Class.forName("oracle.jdbc.driver.OracleDriver");
        	       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","54321");
                       Statement stmt=con.createStatement();
                 	ResultSet rs=stmt.executeQuery("Select * from student");
                 	ResultSetMetaData d=rs.getMetaData();
                    	
			for(int i=1;i<=d.getColumnCount();i++)
                      		System.out.print(d.getColumnName(i)+"\t");
                   
                     	System.out.println();
                     	
			while(rs.next())
                      		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                       
           		String q="update student set address='Dhanbad' where name='rahul'";         
                        stmt.executeUpdate(q);
                         rs=stmt.executeQuery("select * from student");
                	for(int i=1;i<=d.getColumnCount();i++)
                      		System.out.print(d.getColumnName(i)+"\t");
            
                	System.out.println();
                	while(rs.next()){
                      		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                       }
        		
			
			  String p="delete from student where ID=3";
                          stmt.executeUpdate(p);
		         rs=stmt.executeQuery("select * from student");
                         
			 
		         for(int i=1;i<=d.getColumnCount();i++){
                             System.out.print(d.getColumnName(i)+"\t");
                       }
                             System.out.println();
                   
                        while(rs.next()){
                               System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                       } 
                      
              
                      con.close();
                    }catch(Exception e){
                        System.out.println(e);
               	    }
          }
  }         