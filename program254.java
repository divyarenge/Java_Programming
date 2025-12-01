import java.util.*;

class StringX
{
    public String Update(String str)
    {

        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        return new String(Arr);
    }
}

class program254
{
    public static void main(String A[])
    {

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sobj  = scanobj.nextLine();

        StringX strobj = new StringX();

        sobj = strobj.Update(sobj);                 //Change but not preferable bcoz the previous data i.e. string is lost

        System.out.println("Updated String : "+sobj);
    }
}