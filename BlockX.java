class Demo
{
    public int i;           //Instance Variable
    static public int j;       //Class Variable

    static
    {
        System.out.println("Inside Static Block");
        j = 21;
    }

    {       //Initializer block
        System.out.println("Inside Initializer Block");
    }

    public Demo()
    {
        System.out.println("Inside Constructor Demo");
        this.i = 11;
    }

    public Demo(int a)
    {
        System.out.println("Inside Parameterized Constructor Demo");
        this.i = a;
    }   
}

class BlockX
{
    public static void main(String a[])
    {
        System.out.println("Inside Main method");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        Demo dobj4 = new Demo(11);
    }
}