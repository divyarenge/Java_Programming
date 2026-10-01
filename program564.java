import java.io.*;
import java.util.*;

class program564
{
    public static void main(String Args[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        Scanner sobj = new Scanner(System.in);
        FileReader frobj = null;

        System.out.println("Enter the name of file: ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            frobj = new FileReader(FileName);
        }
        else
        {
            System.out.println("There is no such file");
        }

        if(frobj != null)
        {
            frobj.close();
        }
        
        frobj.close();
        sobj.close();
    }
}