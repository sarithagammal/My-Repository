/*4. Write a program to swap two numbers with temporary variable.*/
// Print the numbers before and after swap. 5. Write a program to swap two numbers „without‟ temporary variable.
// Print the numbers before and after swap
class Swap{
public static void main(String args[]){
int a=10,b=20,c;
System.out.println("Value of a before swap="+a);
System.out.println("Value of b before swap="+b);
c=a;a=b;b=c;
System.out.println("Value of a after swap="+a);
System.out.println("Value of b after swap="+b);

}
}