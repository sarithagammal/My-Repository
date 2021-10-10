//14. Write a program to check whether the given number is Palindrome/Not.
import java.util.Scanner;
 class Pallindrom{
	 public static void main(String args[])
	 {
 Scanner number= new Scanner(System.in);
 int num,rev=0,temp;
 System.out.print("Enter the number  :  ");
 num=number.nextInt();
 temp=num;
 while(num!=0){
	  //r=r*10;
	 rev=(rev*10)+(num%10);
	 num=num/10;
	
 }
 if(temp==rev)
 {
	 System.out.println("The reverse of the number ="+rev); 
 System.out.print("The  number is pallindrom");
 }
 else
 {
	
	 System.out.println("The reverse of the number ="+rev); 
 System.out.print("The  number is not pallindrom"); 
 }
 }
	 }