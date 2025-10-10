class Demo
{
    public int i = 11;
    final public int j = 21;

    public Demo()
    {
        this.j=12;
        this.i=22;
    }

}

class FinalData3
{
    public static void main(String a[])
    {
        Demo dobj= new Demo();
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        //dobj.j++;       //Error

    }

}