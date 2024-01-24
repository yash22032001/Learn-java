import java.util.Scanner;
    public class dsa_array1{
     public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int m,n,p;
     System.out.print("Enter no of elements: ");
     m=sc.nextInt();
     int [] a=new int[m];
     int [] b=new int[m+1];
        
     System.out.print("Enter values: ");
     for(int i=0;i<m;i++){
          a[i]=sc.nextInt();
        }
      System.out.print("print values: ");
       for(int i=0;i<m;i++){
         System.out.println(a[i]);
              }
       System.out.print("Enter the index where new value  is to be inserted");
        n=sc.nextInt();
        System.out.print("Enter the new value");
         p=sc.nextInt();
           
          for(int i=0;i<m+1;i++){
            if(i<n){
            b[i]= a[i];
                  }
              else if(i==n){
                 b[i]=p;
                     }
             else{
                  b[i]=a[i-1];
                  }
                }
          System.out.print("Print the value: ");
         for(int i=0;i<m+1;i++){
            System.out.println(b[i]);
                       }
   
           }
         }
    