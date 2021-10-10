import java.util.Scanner;
class Voting{
public static void main(String args[]){
	char ch;
	//do{
System.out.println("The eligibility is : "+Voting.eligibility());
//System.out.println(" : "Do you wish to continue : (Y/y")

}
public static boolean eligibility(){
Scanner v= new Scanner(System.in);
System.out.print("Enter the age : ");
int age= v.nextInt();
if(age>=18)
return true;
else
return false;
}
}