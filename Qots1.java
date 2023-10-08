abstract class Netflix
{
 abstract void wseries();
 }
class You extends Netflix
{
 @Override
 void wseries()
 {
 System.out.println("you indeed the best thriller series on netflix");
  }
}
class Sthings extends Netflix
{
 @Override
 void wseries()
 {
 System.out.println("stranger thing has different genre");
  }
}
class Ozark21 extends Netflix
{
 @Override
 void wseries()
 {
 System.out.println("ozark definately is the best crime dramaon netflix");
  }
}
class Qots1
{
 public static void main(String[] args)
 {
  You y=new You();
  y.wseries();
 
  Sthings s=new Sthings();
  s.wseries();
 
  Ozark21 o=new Ozark21();
  o.wseries();
   }
}     