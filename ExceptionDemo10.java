import java.util.*;

class ExceptionDemo10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40,50};
        int iIndex = 0, iData = 0;

        System.out.println("Enter the Index Number: ");
        iIndex = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");
            iData = Arr[iIndex];        //Exception prone code
        }
        catch(Exception eobj)
        {
            System.out.println("Inside catch block");
            System.out.println(eobj);
        }
        finally
        {
            System.out.println("Inside Finally block");
        }

        System.out.println("Element at that Index is "+iData);
    }
}