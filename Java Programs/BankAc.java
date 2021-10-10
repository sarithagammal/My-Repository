/* 26. Write a program to deposit and withdraw amount from bank account(Withdrawal amount do not exceeds the current balance). 
Add an extra method to check the account balance. (static methods)*/
import java.util.*;
class BankAc{
static int balance=1000;
public static void main (String args[]){
int choice; char ch;
Scanner bk=new Scanner(System.in);
do{
System.out.println("NATIVE BANK");
System.out.println("1. Deposit");
System.out.println("2. Withdrawal");
System.out.println("3. Account Balance");
System.out.println("4. Exit");
System.out.print("Enter your choice : ");
choice=bk.nextInt();

switch(choice)
{
case 1: BankAc.deposit();
break;
case 2: BankAc.withdraw();
break;
case 3 : BankAc.accountBalance();
break;
case 4 : {
System.out.println("Thank you");
System.exit(0);
}
default: System.out.println("Invalid choice");
}
System.out.print("Do you want to continue (Enter y/Y to continue) : ");
ch=bk.next().charAt(0);
}while(ch=='y'||ch=='Y');
}
public static void deposit()
{
int amount;
Scanner bk=new Scanner(System.in);
System.out.print("Enter the amount you want to deposit : ");
amount=bk.nextInt();
balance=balance+amount;
BankAc.accountBalance();
}
public static void withdraw()
{
int amount;Scanner bk=new Scanner(System.in);
System.out.print("Enter the amount you want to withdraw : ");
amount=bk.nextInt();
if(balance<amount)
System.out.println("You have not enough balance : ");
else
balance=balance-amount;
BankAc.accountBalance();
}
public static void accountBalance()
{
System.out.println("Your account balance is  : "+balance);

}
}


















