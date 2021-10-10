//12. Write a program to print Fibonacci series[0 1 1 2 3 5]. 13.
import java.util.Scanner;
class Fib{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int l,a=0,c=1,b=0;
System.out.print("Enter the limit : ");
l=s.nextInt();
for(;b<=l;)
{
System.out.println(b);

a=b;
b=c;
c=a+b;
}
}
}