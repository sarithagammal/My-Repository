//15. Write a program to check whether the given number is Armstrong/Not.
import java.util.Scanner;
 class Armstrong{
	 public static void main(String args[])
	 {
 Scanner number= new Scanner(System.in);
 int num,rem=0, arm=0, temp;
 System.out.print("Enter the number  :  ");
 num=number.nextInt();
 temp=num;
 while(num!=0){
	 
	 rem=num%10;
	 arm=arm+(rem*rem*rem);
	 num=num/10;
	
 }
 if(temp==arm)
 System.out.print("The number is armstrong");
 else
  System.out.print("The number is not armstrong");
 }
 }