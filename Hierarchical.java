class College{void Total(){
System.out.println("There are 10000 students");}
}
class Female extends College{void female(){
System.out.println("There are 6000 Females");}
}
class Male extends College{void male(){
System.out.println("There are 4000 Males");}
}
class Hierarchical{
public static void main(String args[]){
Male m=new Male();
m.Total();
m.male();
Female f=new Female();
f.female();
}
}