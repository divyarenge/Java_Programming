interface A
{
    int no = 11;
    void Fun();
    private void Display()
    {
        System.out.println("Inside private Display()");
    }
    default void Gun()
    {
        System.out.println("Inside Gun Insterface A");
        Display();
    }
}

class Demo implements A          //Multiple Inheritance
{
    public void Fun()
    {
        System.out.println("Inside Fun()");
    }
}

class InterfaceDemo9
{
    public static void main(String a[])
    {          
        Demo dobj = new Demo();
        dobj.Fun();
        dobj.Gun();
        //dobj.Display();           //Error
    }
}           
