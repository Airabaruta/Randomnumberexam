package exampracticerandom;




	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;

	public class Randomnumb {
	    public static void main(String[] args) {
	        // Create an array to store 500 random numbGenerate 500 random numbers and print the nth smallest number in Java.ers
	        int[] randomNumbers = new int[500];

	        // Generate random numbers and fill the array
	        Random random = new Random();
	        for (int counter = 0; counter < randomNumbers.length; counter++) {
	            randomNumbers[counter] = random.nextInt(1000); // Change 1000 to the desired range of random numbers
	        }
	        
	        int n = 20;

	        // Sort the array in ascending order
	        Arrays.sort(randomNumbers);

	        

	        int nthSmallest = randomNumbers[n-1];
	        System.out.println("Generated random numbers:");
	        for (int number : randomNumbers) {
	        	System.out.print(number + " ");
	        }
	        System.out.println("\n" + n + "th smallest number: " + nthSmallest);
        }


	        
	    }
	


