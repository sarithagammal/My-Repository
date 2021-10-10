import java.util.Scanner;
public class Vowel{
public static void main(String args[]){
char ch,v;
Scanner vow= new Scanner(System.in);
do
{
System.out.print("Enter a character  : ");
v=vow.next().charAt(0);
switch(v)
{
case 'a': System.out.println("The character is vowel");
break;
case 'e': System.out.println("The character is vowel");
break;
case 'i': System.out.println("The character is vowel");
break;
case 'o': System.out.println("The character is vowel");
break;
case 'u': System.out.println("The character is vowel");
break;
case 'A': System.out.println("The character is vowel");
break;
case 'E': System.out.println("The character is vowel");
break;
case 'I': System.out.println("The character is vowel");
break;
case 'O': System.out.println("The character is vowel");
break;
case 'U': System.out.println("The character is vowel");
break;
default: System.out.println("The character is not a vowel");

}
System.out.print("Do you wish to continue(Type y/Y to continue)  : ");
ch=vow.next().charAt(0);

}while(ch=='y'|| ch=='Y');
}
}
