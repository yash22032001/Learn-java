import java.util.Scanner;
   class AddNo {
	static Scanner sc= new Scanner(System.in);
   public static void main(String[] args){
     
    // program 1-->
      System.out.println("Enter three no");
       System.out.println("a= ");
        int a= sc.nextInt();
        System.out.println("b= ");
        int b= sc.nextInt();
        System.out.println("c= ");
        int c= sc.nextInt();
        int sum= a+b+c;
       System.out.println("answer is: "+sum);

       // calculateCGPA();
       // greet();
       conversion(); 
       check(); 
         }

       public static void calculateCGPA() {
         System.out.println("Enter the Grades");
          System.out.println("d= ");
            int d= sc.nextInt();
           System.out.println("e= ");
            int e= sc.nextInt();
           System.out.println("f= ");
            int f= sc.nextInt();
         float cgpa= (float)(d+e+f)/3;
          System.out.println("Your CGPA is: "+cgpa);
         
     }
        
         public static void greet() {
          String name= sc.next();
          System.out.println("Hello "+name+" have a good day!");
      }
        
        public static void conversion() {
         System.out.println("Enter the kilometers: ");
         float km= sc.nextFloat();
         double miles= km*0.621371;
         System.out.println("Your distance in miles= "+miles);
      }

       public static void check() {
       System.out.print(sc.hasNextInt());
    }
}
          