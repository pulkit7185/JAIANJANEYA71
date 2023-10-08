interface Vehicle1
{
 public void test();
 public void test1();
 }
class Rajasthanncap implements Vehicle1
{
  public void test()
 {
  System.out.println("ncap is mandatory in some countries");
  }

 public void test1()
 {
 System.out.println("it should have atleast 4.5 star rating");
  }

 public static void main(String[] args)
 {
  Vehicle1 r=new Rajasthanncap();
  r.test();
  r.test1();
  }
}