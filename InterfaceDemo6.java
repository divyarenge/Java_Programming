interface A
{
    int no = 11;
    void Fun();
}

interface B
{
    int no = 21;
    void Fun();
}

class Demo implements A,B           //Multiple Inheritance
{
    public void Fun()
    {
        System.out.println("Inside Fun()"+no);          //no generates error
    }
}

class InterfaceDemo6
{
    public static void main(String a[])
    {          
        Demo dobj = new Demo();
        dobj.Fun();
    }
}
