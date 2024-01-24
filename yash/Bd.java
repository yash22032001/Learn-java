package yash;
import java.io.*;

public class BD{
 public static void main(String[] args) throws IOException{
 
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 double radius = Double.parseDouble(in.readLine());
 double area = 3.14*radius*radius;
  System.out.println("Area: "+area);
       }
    } 