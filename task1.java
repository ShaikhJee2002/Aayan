package tasks;

import java.util.Random;
import java.util.Scanner;

public class task1 {

	  public static void main(String[] args) {
	    // Create an array with 10 randomly chosen integers
	    Random rand = new Random();
	    int[] array = new int[10];
	    for (int i = 0; i < array.length; i++) {
	      array[i] = rand.nextInt();
	    }

	    // Prompt the user to enter the index of the array
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the index of the array: ");
	    int index = scanner.nextInt();

	    try {
	      // Display the corresponding element value
	      System.out.println("The value at index " + index + " is " + array[index]);
	    } catch (ArrayIndexOutOfBoundsException e) {
	      // If the specified index is out of bounds, display the message "Out of Bounds"
	      System.out.println("Out of Bounds");
	    }
	  }
	}


