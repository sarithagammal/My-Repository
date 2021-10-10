//Program to add two numbers. Accept numbers using command line arguments
class Addition
{
public static void main(String args[]){
System.out.println(args[0]);
System.out.println(args[1]);
int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
System.out.println("sum="+sum);
}
}