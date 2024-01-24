import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
        public class Oracle{
           public static void main(String[] args){
          try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection(
                     "jdbc:oracle:thin:@localhost:1521:XE",
                          "system","54321");
                 Statement stmt=con.createStatement();
                 ResultSet rs=stmt.executeQuery(
                           "Select * from student");
                    ResultSetMetaData d=rs.getMetaData();
                    for(int i=1;i<=d.getColumnCount();i++){
                      System.out.print(d.getColumnName(i)+"\t");
                                 }
                     System.out.println();
                   while(rs.next()){
                      System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                       }
                      con.close();
                          }
                              catch(Exception e){
                                    System.out.println(e);
                                            }
                                         }
                                       }