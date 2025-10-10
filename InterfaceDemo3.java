interface Demo
{
    int iNo=11;             //public static final
    void Display();         //public abstract 
}

class Hello implements Demo
{
    public void Display()
    {
        System.out.println("Inside Display() method");
    }
}

class InterfaceDemo3
{
    public static void main(String a[])
    {
        System.out.println(Demo.iNo);       //iNo is public and static
        //Demo.iNo=12;                      //iNo is final
        Hello hobj = new Hello(); 
        hobj.Display();          

    }

}
