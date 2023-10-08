import java.util.Scanner;
class Rajnarayan71
{
  public static void main(String[] args)
 {
  int i,size,n,count=0;

  System.out.println("enter size of an array");
  Scanner sc=new Scanner(System.in);
  size=sc.nextInt();

  int a[]=new int[size];
  
  for(i=0;i<size;i++)
  {
   a[i]=sc.nextInt();
    }
  System.out.println("printed arrays");
  
  for(i=0;i<size;i++)
  {
  System.out.println(a[i]+" ");
      }

  System.out.println("enter search element");
  n=sc.nextInt();

  for(i=0;i<size;i++)
  {
   if(a[i]==n)
   {
    count++;
     }
  }

  if(count>0)
  {
   System.out.println("item-found"+" "+count+" "+"times");
     }
  
   else
   {
   System.out.println("item not found");
     }
 }
}
   
   
     
     