import java.util.Scanner;
class BubblesortArray{
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