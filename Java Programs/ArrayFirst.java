//Arrays
import java.util.Scanner;
class ArrayFirst{
public static void main(String args[])
{
int a[], l,i, sum=0;
Scanner ar=new Scanner(System.in);
a=new int[5];
System.out.println("Enter 5 numbers :");
for(i=0;i<5;i++)
{
a[i]=ar.nextInt();
}
System.out.println("The array values are :");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
sum=sum+a[i];
}
System.out.println("Sum= "+sum);
}
}











