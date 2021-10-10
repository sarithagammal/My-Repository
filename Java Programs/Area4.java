// Find the Area of circle and rectangle using method overloading.
import java.util.Scanner;
class Area4{
public static void main(String args[]){
int length,breadth,side;
float radius;
Scanner ar = new Scanner(System.in);
Area4 shape= new Area4();

shape.area(5.0f);
shape.area(10,8);
shape.area(9);
}
public void area(float rad){
float area=(float)3.14*rad*rad;
System.out.println("Area of the circle : "+area);
}
public void area(int length,int breadth)
{
int area=length*breadth;
System.out.println("Area of the rectangle : "+area);
}
public void area(int side)
{
int area=side*side;
System.out.println("Area of the Square : "+area);
}
}