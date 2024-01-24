import java.util.Scanner;

public class stringPalindrome{

   public static void main(String[] args){
    
    Scanner sc= new Scanner(System.in);
    String line,reverse="";
    
      System.out.println("enter a string:");
      line=sc.nextLine();
      int size= line.length();
     
          for(int i=size-1;i>=0;i--){
         reverse=reverse+line.charAt(i);
          }

           if(line.equalsIgnoreCase(reverse)){
             System.out.println(line+" is a Palindrome");
                  }
           else{
             System.out.println(line+" is not a Palindrome");
               }
             }
          }
  