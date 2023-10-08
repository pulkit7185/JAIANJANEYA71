import java.util.Scanner;
class Rainaji71
{
 public static void main(String[] args)
 {
  int weekday;

  System.out.println("enter userchoice weekday");
  Scanner sc=new Scanner(System.in);
  weekday=sc.nextInt();

  switch(weekday)
 {
   case 1:
   System.out.println("its monday");
   break;

  
   case 2:
   System.out.println("its tuesday");
   break;

  
   case 3:
   System.out.println("its wednesday");
   break;

   
   case 4:
   System.out.println("its thurseday");
   break;

   
   case 5:
   System.out.println("its friday");
   break;

  
   case 6:
   System.out.println("its saturday");
   break;

   
   case 7:
   System.out.println("its sunday");
   break;
 }
}
}