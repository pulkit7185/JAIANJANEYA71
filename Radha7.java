import java.util.Scanner;
class Santosh
{
 int rollno,idno,marks;
 String name, institute;

 void sem1()
 {
  System.out.println("enter rollno,idno,marks,name & institute");
  Scanner sc=new Scanner(System.in);
  rollno=sc.nextInt();
  idno=sc.nextInt();
  marks=sc.nextInt();
  name=sc.next();
  institute=sc.next();
    }
}
class Beenesh extends Santosh
{
  void sem2()
 {
  System.out.println(rollno+" "+idno+" "+marks+" "+name+" "+institute);
    }
 }
class Radha7 
{
  public static void main(String[] args)
 {
  System.out.println("  Student Profile  ");
  Beenesh b=new Beenesh();
  b.sem1(); b.sem2();
  System.out.println("student details");
   }
} 