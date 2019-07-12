package CSV9toJava;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//Среднее арифметическое
//Вводить с клавиатуры числа и вычислить среднее арифметическое.
//Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
//-1 не должно учитываться.

public class Solution {
	  public static void main(String[] args) throws Exception {
		     
		     InputStream inputStream = System.in;
		     Reader inputStreamReader = new InputStreamReader(inputStream);
		     BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		     
		     
		     double sum = 0;
		     int i = 0;
		     
		     
		     while(true) {
		      String numS = bufferedReader.readLine();
		         int num = Integer.parseInt(numS);
		         i++;               
		         sum += num; 
		      
		         if(num == -1 ) {  
		          i = i -1;
		          sum = sum + 1;
		          double avSum = sum/i;          
		          System.out.println(avSum);
		          break;
		         }        
		      
		     }
		     
		     
		    }
		 

		}


