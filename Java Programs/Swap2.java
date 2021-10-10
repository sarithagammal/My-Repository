/*Write a program to swap two numbers without using temporary variable.Print the numbers before and after swap*/
class Swap2{
public static void main(String args[]){
int a=10,b=20;
System.out.println("Value of a before swap="+a);
System.out.println("Value of b before swap="+b);

a=a+b;
b=a-b;
a=a-b;

System.out.println("Value of a after swap="+a);
System.out.println("Value of b after swap="+b);

}
}