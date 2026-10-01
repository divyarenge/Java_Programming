import java.io.*;
import java.util.*;

class program559
{
    public static void main(String Args[]) throws Exception
    {
        boolean bRet = false;
        String FileName = null;
        File fobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file: ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        bRet = fobj.exists();
        
        if(bRet == true)
        {
            System.out.println("File is Already Present");
        }
        else
        {
            bRet = fobj.createNewFile();

            if(bRet == true)
            {
                System.out.println("File gets created Successfully");
            }
            else
            {
                System.out.println("Unable to create file");        
            }
        }

        sobj.close();
    }
}