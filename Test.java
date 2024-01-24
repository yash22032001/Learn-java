 import java.util.Scanner;

   public class Test{
    
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
            Main obj = new Main();
              System.out.println(obj.factorial(8));
             /*  int a = 3,b = 4,c = 5;
                int d = a+b+c;
            System.out.println(d);
             
             int sub1 = 87,sub2 = 98,sub3 = 99;
               double CGPA = (sub1+sub2+sub3)/3;
             System.out.println(CGPA);

             System.out.print("Enter Your Name: ");
             String name = sc.nextLine();
            System.out.println("Hello "+name+" have a good day!");

                   //_____Convert km to miles (1 miles = 1.609km)______
                     System.out.print("Enter Km: ");
                      double km = sc.nextDouble();
                     double miles = km/1.609;
                      System.out.println(miles);

                 //_______Detect Integer_____
                    
                  System.out.println("Enter The Number: ");
                  Scanner sc1 = new Scanner(System.in);
                   System.out.println(sc1.hasNextInt());*/
                   prctise2 p = new prctise2();
                     p.p2(); 
               }
             }
      
          class prctise2{
                          public void p2(){
                          Scanner sc1 = new Scanner(System.in);
                                       /* int x = 8,y = 2;
                                         float z = (x-y)/2;
                             System.out.println(z);
                          int q = 7;
                          int r = ++q*8;
                        System.out.println(r);*/
                    /* char grade = 'A';
                      char t = grade+=8;
                       
                      System.out.println(t);*/
                        
                      /* int given_no = 56;
                       int user_no = sc1.nextInt();
                       String result = (user_no > given_no)? "greater" : "smaller";
                        System.out.println(result);*/
                  
                       /*String a = "HELLO you are good";
                         System.out.println(a.replace(' ','_')); */

                      //  _____________ CONDITIONAL STATEMENT___________

                            /* int a = 10;
                            if(a == 11){
                             System.out.println("I am 11");
                            }
                           else{
                               System.out.println("I am not 11");
                         }*/
                           /* System.out.print("Enter Subject1: ");
                            int sub1 = sc1.nextInt();
                            System.out.print("Enter Subject2: ");
                             int sub2 = sc1.nextInt();
                             System.out.print("Enter Subject3: ");
                               int sub3 = sc1.nextInt();
                            float total = (sub1+sub2+sub3)/3.0f;
                             System.out.println("Your overall percentage: "+ total);

                             if(total>=40 && sub1>=33 && sub2>=33 && sub3>=33){
                           System.out.print("Congrats! You are pass ");
                           }
                             else{
                                   System.out.println("You are fail");
                                  }*/
                        //________________SWITCH___________
                         
                       /* int day = sc1.nextInt();
                        switch(day){
                               case 1:
                                  System.out.print("Today is Monday!");
                                   break;
                               case 2:
                                  System.out.print("Today is Tuesday!");
                                   break;
                               case 3:
                                  System.out.print("Today is Wednesday!");
                                   break;
                                case 4:
                                  System.out.print("Today is Thursday!");
                                   break;
                                case 5:
                                  System.out.print("Today is Friday!");
                                   break;
                                case 6:
                                  System.out.print("Today is Saturday!");
                                   break;
                                 case 7:
                                  System.out.print("Today is Sunday!");
                                   break;
                                 default:
                                  System.out.print("Invalid Choice!");
                                   }*/
                                
                              /* String line = sc1.nextLine();
                               if(line.endsWith(".com")){
                                  System.out.print("It is commercial website!");
                                   }
                               else if(line.endsWith(".org")){
                                  System.out.print("It is organizational website!");
                                  }
                              else if(line.endsWith(".in")){
                                  System.out.print("It is indian website!");
                                  }
                              else{
                                   System.out.print("It is other website!");
                                  }*/
                          
                    //______________Loop Statement____________
             
                   
                  /* for(int i = 5; i>0; i--){
                         for(int j = 0; j<i; j++){
                               System.out.print("*");
                            }
                     System.out.print("\n");
                         } */
                  /* System.out.print("Enter the even number on which sum is needed: ");
                    int n = sc1.nextInt();
                    int i = 0;
                    int sum = 0;
                    while( i<=n){
                        if(i%2 == 0){
                          sum += i;
                           }
                           i++;
                         }
                   System.out.print("Sum of "+n+" even number is: "+ sum); */
                       
                  /*System.out.print("Enter the no whose table to be write: ");
                    int n = sc1.nextInt();
                     for(int i = 10; i>=1; i--){
                        System.out.println(n + " * " +i+" = "+n*i);
                           }*/
                    /* System.out.print("Enter the no whose factorial to be write: ");
                        int n = sc1.nextInt();
                        int factorial = 1;
                         for(int i = 1; i<=n; i++){
                             factorial *= i;
                                 }
                          System.out.print("Factorial of the no: "+factorial); */
                          
                          /*  int n = 0;
                          for(int i = 1; i<=10; i++){
                             n += (8*i);
                              }
                          System.out.println(n);*/


                          int [] no = {23,89,12,98,10};
                          int temp = 0; 
                          for(int i = 0; i<no.length-1; i++){
                              if(no[i] > no[i+1]){
                                  temp = no[i];
                                   no[i] = no[i+1];
                                   no[i+1] = temp;
                                    }
                                  }
                           System.out.println("Sorted Successfully");
                           for(int c : no){
                             System.out.println(c);
                                 }
                              
                         
                        /* System.out.print("Enter a given no: ");  
                         int a = sc1.nextInt();
                         int [] b = {34,56,78,90,23};
                          for(int i = 0;i<b.length;i++){
                                 if(a == b[i]){
                                  System.out.println("The given no is present!");
                                      break;
                                  }
                                 else{
                                System.out.println("The given no is not present");
                                          break;
                                   }
                             }*/

                            /* float [] marks ={78,89,90,98,89};
                             float sum = 0;
                              for(float i:marks){
                                 sum +=i;
                                 }
                             float avg = sum/ marks.length;
                              System.out.println(avg); */

                           /* int [][] a = {{1,2,3},{4,5,6}};
                            int [][] b = {{8,9,10},{11,12,13}};
                            int [][] result = {{0,0,0},{0,0,0}};
                             
                            for(int i=0;i<a.length;i++){
                                for(int j =0;j<a[i].length;j++){
                                   result[i][j] = a[i][j]+b[i][j];
                                    System.out.print(result[i][j]+" ");
                                    }
                                System.out.println("");
                                }*/
                       }
                     }