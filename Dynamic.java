import java.util.Scanner;

class Dynamic
{
    public static void main(String A [])
    {
        Scanner sobj = new Scannner(System.in);

        int iLength=0;
        int Arr[];

        System.out.println("Enter the Number of elements:");
        iLength = sobj.nextInt();

        Arr=new int [length];

        if(Arr == null)
        {System.out.println("Unable to allocate memory");}

         else{
            System.out.println("Memory is Allocated");
         }
         Arr=null;
         System.gc();
    }

}