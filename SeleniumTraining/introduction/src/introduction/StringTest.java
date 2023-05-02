package introduction;

public class StringTest {

	public static void main(String[] args) {
String s1 = "Rahul Sheety Selenium" ;
String s5 = "Hello";

String s2 = new String("Welcome");
String s3 = new String ("Welcome");
String s = "Rahul Shetty Selenium";
          String [] splittedString = s.split("Shetty");
          System.out.println(splittedString[0]);
          System.out.println(splittedString[1]);
          System.out.println(splittedString[1].trim());
          for(int i =s.length()-1;i>=0;i--)
          {
        	  System.out.println(s.charAt(i));
          }
	}

}
