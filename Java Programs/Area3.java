// Find the Area of circle and rectangle using method overloading.
import java.util.Scanner;
class Area3{
public static void main(String args[]){
int length,breadth,radius;
Scanner ar = new Scanner(System.in);
System.out.print("Enter radius : ");
radius=ar.nextInt();
Area3.area(radius);

System.out.print("Enter length : ");
length=ar.nextInt();
System.out.print("Enter breadth : ");
breadth=ar.nextInt();
Area3.area(length,breadth);
}
public static void area(int rad){
float area=(float)3.14*rad*rad;
System.out.println("Area of the circle : "+area);
}
public static void area(int length,int breadth)
{
int area=length*breadth;
System.out.println("Area of the rectangle : "+area);
}
}