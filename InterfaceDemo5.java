interface A
{
    void Fun();
}

interface B
{
    void Fun();
}

class Demo implements A,B           //Multiple Inheritance
{
    public void Fun()
    {
        System.out.println("Inside Fun()");
    }
}

class InterfaceDemo5
{
    public static void main(String a[])
    {          
        Demo dobj = new Demo();
        dobj.Fun();
    }
}
