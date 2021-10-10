/*10. Write a program to find the grade of a Student based on total marks 
 Mark less than 40- Failed  40 to 60–Grade D  61 to 70-Grade C 
 71 to 80-Grade B  81 to 100-Grade A*/
import java.util.Scanner;
class StudGrade{
public static void main(String args[]){
int g;
Scanner sc=new Scanner(System.in);
System.out.print(" Enter the Mark  :");
g=sc.nextInt();
if (g<40)
{
System.out.println( "The student is failed");
}
else if((g>=40)&&(g<60))
{
System.out.println( "The student is in grade D ");
}
else if((g>=60)&&(g<70))
{
System.out.println( "The student is in Grade C");
}
else if((g>=70)&&(g<80))
{
System.out.println( "The student is in Grade B");
}
else if((g>=80)&&(g<=100))
{
System.out.println( "The student is in Grade A");
}
else
{
System.out.println( "The entered mark is invalid ");
}
}
}
