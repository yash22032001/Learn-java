 package yash; 
 import java.util.Scanner;

   public class Masti{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      // int m=4;
        int fact=1;
       // int fact1=1;
     for(int i=1;i<=n;i++){
          fact=fact*i;
          }
        System.out.println(fact);
             }
          }