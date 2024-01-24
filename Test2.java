import java.util.Scanner;

 /* public class Test2{
              public static void main(String[] args){
                
                Main obj = new Main();
                 System.out.println(obj.factorial(8));
                      }
                   }*/
          class Main{
                public int factorial(int k){
                              if(k > 0){
                                return k *factorial(k-1);
                            }
                       else{
                              return 1;
                         }
                       } 
                      }