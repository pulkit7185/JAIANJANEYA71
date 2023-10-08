class Rajasthan7
{
 private String value;
  
 void setValue(String x)
 {
  value=x;
   }

 String getValue()
 {
  return value;
   }

 public static void main(String[] args)
 {
  Rajasthan7 r=new Rajasthan7();
  r.setValue("RAJASTHAN@2023");
  System.out.println(r.getValue());
  System.out.println("THIS IS BASIC ENCAPSUALTION");
  }
 } 