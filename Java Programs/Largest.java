import java.util.Scanner;
class Largest{
public static void main(String args[]){
Scanner Number=new Scanner(System.in);
int a,b,c;
System.out.print("Enter first number   : ");
a=Number.nextInt();
System.out.print("Enter second number  : ");
b=Number.nextInt();
System.out.print("Enter third number   : ");
c=Number.nextInt();
if((a>b)&&(a>c))
{System.out.println(a+" is the biggest number");
}
else if((b>a)&&(b>c)){
System.out.println(b+" is the biggest number");
}
else {System.out.println(c+ " is the biggest number");
}
}
}