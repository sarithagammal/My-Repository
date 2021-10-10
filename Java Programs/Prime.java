//16. Write a program to check whether the given number is Prime/Not.
import java.util.Scanner;
class Prime{
public static void main(String args[]){
int number, prime, flag=0,i,p=2;
Scanner pr=new Scanner(System.in);
System.out.print("Enter a number  : ");
number=pr.nextInt();
for(i=2;i<=number/2;i++)
{
if(number%i==0)
flag=1;
}
if(flag==0)
System.out.println("The number is Prime");
else
System.out.println("The number is not Prime");
}
}
