//package testing;
import java.util.Scanner;
public class WeekDays{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int w;
System.out.print("Enter the number");
w=sc.nextInt();
if(w==1){
System.out.print("Sunday");
}
else if(w==2){
System.out.print("Monday");
}
else if(w==3){
System.out.print("Tuesday");
}
else if(w==4){
System.out.print("Wednesday");
}
else if(w==5){
System.out.print("Thursday");
}
else if(w==6){
System.out.print("Friday");
}
else if(w==7){
System.out.print("Saturday");
}
else{
	System.out.println("Invalid Number");
}
}
}