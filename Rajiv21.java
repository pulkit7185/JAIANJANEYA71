import java.util.ArrayList;
class Rajiv21
{
 public static void main(String[] args)
 {
  ArrayList<String> name=new ArrayList<String>();
 
  name.add("NANAPATEKAR");
  name.add("TABBU");
  name.add("Akshaykumar");
  name.add("Sunilshetty");
  System.out.println(name);

  name.add(0,"AMITABH");
  name.add(2,"PARESH");
  name.remove(4);
  System.out.println(name);

  name.clear();
  System.out.println(name);
 }
}