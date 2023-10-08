import java.util.Scanner;
class Mtester
{
  String name;
  int rank;
  double sal;

  public void qasurance()
  {
   System.out.println("ENTER NAME, RANK AND SAL");
   Scanner sc=new Scanner(System.in);
   name=sc.next();
   rank=sc.nextInt();
   sal=sc.nextDouble();
    }
 }

class Tester extends Mtester
{
  public void qasurance71()
  {
   System.out.println(name+" "+rank+" "+sal);
    }
 }
class Qualitya71
{
  public static void main(String[] args)
 {
  Tester r=new Tester();
  r.qasurance();
  r.qasurance71();
  
  System.out.println("THIS IS MULTI-LEVEL INHERITANCE");
   }
}
