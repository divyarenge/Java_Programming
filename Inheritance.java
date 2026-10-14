class Teacher{
void subject(){
System.out.println("Mathematics");
}
}
class Student extends Teacher{
void marks(){
System.out.println("marks=89");
}
}
class Inheritance{
public static void main(String args[]){
System.out.println("MArks in math subject");
Student s=new Student();
s.subject();
s.marks();
}
}