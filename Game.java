 import java.util.Scanner;
import java.util.Random;
  
   public class Game{
     public static void main(String[] args){
  //0 for Rock
  //1 for paper
  //2 for scissor
  Scanner sc=new Scanner(System.in);
   int i;
    for(i=1; i<=5; i++){
    System.out.println("Enter 0 for Rock,1 for paper,2 for scissor");
    int userinput=sc.nextInt();
    Random random=new Random();
     int computerinput= random.nextInt(3);

	if(userinput>2){
System.out.println("Invalid choice");
	continue;
}
   else if(userinput==computerinput){
    System.out.println("Draw");
}     else if(userinput==0 && computerinput==2||userinput==1 && computerinput==0||userinput==2&& computerinput==1){
        System.out.println("You won!");
  } else{
      System.out.println("computer won!");
}
   
   if(computerinput==0){
     System.out.println("computer choice:Rock");
}  else if( computerinput==1){
    System.out.println("computer choice is:Paper");
} else if(computerinput==2){
     System.out.println("computer choice is:Scissor");
     }
   }
  }
 } 
  