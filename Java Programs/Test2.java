class Test2{
public static void main(String args[])
{
System.out.println (Test2.even());
}

public static String even()
{
int num=11;
String s;
if(num%2==0)
s="Even";
else
s="Odd";
return s;
}
}