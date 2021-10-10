//19. Write a program to add two matrices.
import java.util.Scanner;
class MatrixAddition{
public static void main(String args[]){
int c[][];
//a=new int[2][3];
//b=new int[2][3];
c=new int[2][3];
int a[][]={{10,20,30},{40,50,60}};
int b[][]={{5,5,5},{5,5,5}};
System.out.println( "The sum of the matrices");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+"  ");
}
System.out.println();
}
}

}