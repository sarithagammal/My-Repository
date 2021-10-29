package excelRead;
import java.util.*;

import java.io.IOException;

public class ExcelReadMAin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//for(int i=0;i<3;i++) {
			//for(int j=0;j<3;j++) {
		//Cell.CELL_TYPE_NUMERIC	
		
String s= ExcelReadClass.readString(0, 0);
System.out.println("The value of a = "+s);
//String s2 = String.valueOf(ExcelReadClass.readString(1, 1));
String s2 = String.valueOf(ExcelReadClass.readIntData(1, 1));
System.out.println("The value of s2 = "+s2);
		//}
		//}
	}

	//private static String valueOf(String readIntData) {
		// TODO Auto-generated method stub
		//return valueOf(readIntData);
	//}

}