import java.util.*;

class program850
{
    public static void main(String A[])
    {

        String str = "   India    is   my  country    ";

        System.out.println(str);
        str = str.trim();

        //str = str.replaceAll("\\s+"," ");         //IMP

        String Arr[] = str.split(" ");

        System.out.println(Arr.length);
          
    }
}