//22. Write a program to set your name and age by a static method and get them in an another static method.
class NameAge{
public static void main(String args[]){
NameAge.set();
}
public static void print(int age, String name)
{
System.out.println("Name  :"+name);
System.out.println("Age   : "+age);		
}
public static void set()
{
String name="Gauri";
int age=10;
NameAge.print(age,name);
}
}