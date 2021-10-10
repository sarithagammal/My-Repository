import java.util.Scanner;
class Area2{
public static void main (String args[]){
float radius;
int length=5,bredth=10;
//System.out.print("Enter the radius : ");
//Scanner crl = new Scanner(System.in);
//radius=crl.next(Float);
radius = 7.0f;
Area2.circleArea(radius);

/*System.out.print("Enter the length : ");
length=crl.next(Int);
System.out.print("Enter the bredth : ");
bredth=crl.next(Int);*/

Area2.rectArea(length,bredth);
}

public static void circleArea(float r )
{
float p=3.14f;
float area=(float)p*r*r;
System.out.println("Area of the circle : "+area);
Scanner n=new Scanner(System.in);
}
public static void rectArea(int l, int b)
{
int area=l*b;
System.out.println("Area of the rectangle : "+area);
}
}