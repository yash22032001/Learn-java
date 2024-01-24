 import java.sql.*;

public class Oracle2{
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
                       
           		String q="update student set address='Dhanbad' where name='Rohit'";         
                        stmt.executeUpdate(q);
                        System.out.println("here updated row-3");
                         rs=stmt.executeQuery("select * from student");
                	for(int i=1;i<=d.getColumnCount();i++)
                      		System.out.print(d.getColumnName(i)+"\t");
            
                	System.out.println();
                	while(rs.next()){
                      		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                       }
        		
			
			  String p="delete from student where ID=4";
                          stmt.executeUpdate(p);
                         System.out.println("here deleted row-4");
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