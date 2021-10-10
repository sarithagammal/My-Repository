/*27. Write a program to check whether the customer have discount (get 20% discount if total amount is greater than 5000) 
or not and get the final amount in main method. (static methods)  Get prices of items using parameterized method 
 Method 1 - Calculate total amount  Method 2 - Check discount*/
import java.util.*;
class Shopping{
	public static void main(String args[]){
int number;
float ttlp,discPrice;
Scanner sh = new Scanner(System.in);
System.out.print("Enter number of items :");
number = sh.nextInt();
ttlp=Shopping.calTotalAmt(number);
	System.out.println("Total price :"+ttlp);
discPrice=calTotalAmt(ttlp);
if (discPrice<ttlp)
	System.out.print("Discounted price :"+discPrice);
}


public static float calTotalAmt(int number)
{
float price,totalPrice=0.0f;
Scanner sh = new Scanner(System.in);
for(int i=1;i<=number;i++)
{
System.out.print("Enter the price of product "+i +" : ");
price=sh.nextFloat();
totalPrice = totalPrice+price;
}
return(totalPrice);
}
public static float calTotalAmt(float total){
	float discountPrice;
	if(total>=5000.0)
	{
		discountPrice=total-(total*20/100);
		return(discountPrice);
	}
		else
			return(total);
}
}
