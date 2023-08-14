package day1;

public class Typecasting {
	//Java is the process of converting a
	//value of one data type into another data type.
	 public static void main(String[] args) {
	        int intValue = 200;
	        long longValue = intValue; 
	        // Implicit casting from int to long

	        System.out.println("intValue: " + intValue);
	        System.out.println("longValue: " + longValue);

	        double doubleValue = 9.7865;
	        int intvalue = (int) doubleValue;
	        // Explicit casting from double to int

	        System.out.println("doubleValue: " + doubleValue);
	        System.out.println("intValue: " + intvalue);
	         }
}
