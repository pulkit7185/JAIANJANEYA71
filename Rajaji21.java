class Sasha21
{
 private int value;
 
 void setValue(int a)
 {
  value=a;
   }
 int getValue()
 {
  return value;
   }
}
 
class Rajaji21
 {
  public static void main(String[] args)
  {
  Sasha21 s=new Sasha21();
  s.setValue(101);
  System.out.println(s.getValue());
    }
}