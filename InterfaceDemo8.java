interface A
{
    int no = 11;
    void Fun();
    default void Gun()
    {
        System.out.println("Inside Gun Insterface A");
    }
}

class Demo implements A          //Multiple Inheritance
{
    public void Fun()
    {
        System.out.println("Inside Fun()");
    }
}

class InterfaceDemo8
{
    public static void main(String a[])
    {          
        Demo dobj = new Demo();
        dobj.Fun();
        dobj.Gun();
    }
}
