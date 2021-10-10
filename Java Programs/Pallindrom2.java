/*24. Write a program to check whether the given number is Palindrome/Not by using static methods. 
 Method 1- to find the reverse(pass the number in argument)  Method 2-to check palindrome/not */
import java.util.Scanner;
class Pallindrom2{
public static void main(String args[]){
int num, reverse; boolean flag;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
num= sc.nextInt();
reverse=reverseNumber(num);
System.out.println("Reverse of the number : "+reverse);
palindromeCheck(num,reverse);
}
public static int reverseNumber(int n)
{
int rev=0;
while(n!=0){
rev=rev*10+(n%10);
n=n/10;
}
return(rev);
}
public static void palindromeCheck(int num,int rev)
{
	
	if(num==rev)
		System.out.println("The number is pallindrom");
	else
		System.out.println("The number is not pallindrom");
		
}
}