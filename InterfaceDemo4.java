interface A
{
    void Fun();
}

interface B
{
    void Gun();
}

class Demo implements A,B           //Multiple Inheritance
{
    public void Fun()
    {
        System.out.println("Inside Fun()");
    }
    public void Gun()
    {
        System.out.println("Inside Gun()");
    }
}

class InterfaceDemo4
{
    public static void main(String a[])
    {          
        Demo dobj = new Demo();
        dobj.Fun();
        dobj.Gun();
    }
}
