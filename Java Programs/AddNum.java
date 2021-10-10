import java.util.Scanner;
class AddNum{
public static void main(String args[]){

AddNum.add();
}

public static void add()
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first number : ");
a=sc.nextInt();
System.out.print("Enter the second number : ");
b=sc.nextInt();
System.out.println("Sum = "+(a+b));
}

}