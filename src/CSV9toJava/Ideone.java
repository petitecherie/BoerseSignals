package CSV9toJava;
import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] numbers = {5, 8, 12, -18, -54, 84, -35, 17, 37};
		OptionalDouble average = Arrays.stream(numbers).average();
		System.out.println(average);
	}
}