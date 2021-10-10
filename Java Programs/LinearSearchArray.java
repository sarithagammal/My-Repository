//20. Write a program to search array element with Linear Search.
import java.util.Scanner;
class LinearSearchArray{
public static void main(String args[])
{
int a[], l,i,flag=0, sum=0;
Scanner ar=new Scanner(System.in);
a=new int[5];
System.out.print("Enter 5 numbers :");
for(i=0;i<5;i++)
{
a[i]=ar.nextInt();
}
System.out.print("Enter the number to be search :");
l=ar.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==l)
{
System.out.println("The number is in the array location :"+i);
flag=1;
}
}
if (flag!=1)
System.out.println("The number is not in the array ");

}
}
