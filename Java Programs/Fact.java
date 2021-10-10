//23. Write a program to find the factorial of a number(static method)  Output – “Factorial of <given number> is <result>. 
import java.util.Scanner;
class Fact{
public static void main (String args[]){
int num;
Scanner n=new Scanner(System.in);
System.out.print("Enter the Number : ");
num=n.nextInt();
System.out.println( "Factorial of "+num +" is "+factorial(num));
}

public static int factorial(int l)
{
int fact=1;
for (int i=1;i<=l;i++)
{
fact=fact*i;
}
return(fact);
}
}