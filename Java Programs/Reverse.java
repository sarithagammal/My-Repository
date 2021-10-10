 //Write a program to find the reverse of number.
 import java.util.Scanner;
 class Reverse{
	 public static void main(String args[])
	 {
 Scanner number= new Scanner(System.in);
 int num,rev=0;
 System.out.print("Enter the number  :  ");
 num=number.nextInt();
 while(num!=0){
	  //r=r*10;
	 rev=(rev*10)+(num%10);
	 num=num/10;
	
 }
 System.out.print("The reverse of the number : "+rev);
 }
 }