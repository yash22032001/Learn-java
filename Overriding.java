class Bank{
 int getRateOfInterest(){
     return 0;
         }
       }
 class SBI extends Bank{
   int getRateOfInterest(){
      return 9;
         }
        }
  class ICICI extends Bank{
   int getRateOfInterest(){
        return 7;
            }
          }
  class AXIS extends Bank{
    int getRateOfInterest(){
         return 8;
            }
          }
   public class Overriding{
     public static void main(String[] args){
         SBI s=new SBI();
         ICICI i=new ICICI();
         AXIS a=new AXIS();
        System.out.println("SBI Rate of interest is "+s.getRateOfInterest());
        System.out.println("ICICI Rate of interest is "+i.getRateOfInterest());
        System.out.println("AXIS Rate of interest is "+a.getRateOfInterest());
                  }
              }