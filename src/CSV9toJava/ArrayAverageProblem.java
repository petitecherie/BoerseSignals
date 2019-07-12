package CSV9toJava;

import java.util.Scanner;

/*
 * Java Program to calculate average of numbers in array
 * input : [1, 2, 3, 4, 5]
 * output: 3.0
 */

public class ArrayAverageProblem {

  public static void main(String[] args) {

  System.out
  .println("Welcome to Java Prorgram to calculate average of numbers");
  System.out.println("Please enter length of the array?");

  Scanner scnr = new Scanner(System.in);
  int length = scnr.nextInt();
  int[] input = new int[length];

  System.out.println("Please enter numbers ");

  for (int i = 0; i < length; i++) {
  input[i] = scnr.nextInt();
  }

  float average = average(input);

  System.out.println("Average of all numbers in array is " + average);
  scnr.close();
  }

  /**
  * Java method to calculate average of all numbers of array
  * 
  * @param input
  * @return average of all numbers in array
  */
  public static float average(int[] input) {
  float sum = 0f;
  for (int number : input) {
  sum = sum + number;
  }
  return sum / input.length;
  }

}
