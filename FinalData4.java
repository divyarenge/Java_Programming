class Demo
{
    public int i ;
    final public int j ;

    public Demo(int a, int b)
    {
        this.j=12;
        this.i=22;
    }

}

class FinalData4
{
    public static void main(String a[])
    {
        Demo dobj= new Demo(11,21);
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        //dobj.j++;       //Error

    }

}