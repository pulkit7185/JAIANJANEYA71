import java.util.Scanner;
class Rachel71   //inheritance program.!
{
  int sal;
  String occupation;
  double lpa;
  public void employee1()
 {
   System.out.println("enter sal,occupation and lpa");
   Scanner sc=new Scanner(System.in);
   sal=sc.nextInt();
   occupation=sc.next();
   lpa=sc.nextDouble();
     }
}
class Rachel extends Rachel71 
{
  public void employee71()
 {
  System.out.println(sal+" "+occupation+" "+lpa);
    }

  public static void main(String[] args)
 {
  Rachel r=new Rachel();
  r.employee1();
  r.employee71();
    }
}