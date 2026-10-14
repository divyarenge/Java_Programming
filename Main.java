import java.io.FileWriter;
class Main
{
public static void main(String arg[])
{
String data="This is the data in the output File";
try
{
FileWriter output =new FileWriter("output.txt");
output.write(data);
System.out.println("Data is written to the file.");
output.close();
}
catch(Exception e)
{
e.getStackTrace();
}
}
}