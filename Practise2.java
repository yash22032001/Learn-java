 
import java.util.Scanner;
 public class Practise2{
  static Scanner sc= new Scanner(System.in);

 public static void main(String[] args){
  float a= 7/4*9/2;
  float c= 7/4.0f*9/2.0f;
System.out.println(a);
System.out.println(c);
 encryptgrade();
 comparison_ope();
 expression();
   }

  public static void encryptgrade() {

  char grade= 'B';
  grade= (char)(grade+8);
  System.out.println(grade);

  grade=(char)(grade-8);
  System.out.println(grade);
   }
   
   public static void comparison_ope(){
   
   int a= sc.nextInt();
   System.out.println(a>64);
   }

   public static void expression(){
   float k= (float)(3*3-4*4)/(2*4*5);
   System.out.println(k);
   int b= 7*49/7+35/7;
   System.out.println(b);
   }
   
   
 }