/**
 * File: Homework1.java
 * Author: Yael Brown
 * Date: August 22, 2017
 * Purpose: Prompt for EMPLID, 3 quiz scores, age, current temperature in celcius.
 */

package com.cm141.w2;

// Import each required Java class
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Homework1
 */
public class Homework1 {
	public static void main(String[] args) {
		// Variables to hold values
		int EMPLID = 0;
		double quiz1 = 0.0;
		double quiz2 = 0.0;
		double quiz3 = 0.0;
		double average = 0.0;
		int age = 0;
		int ageInYears = 0;
		double temperatureC = 0.0;
		double temperatureF = 0.0;
		
		// Definte input scanner
		Scanner Scan = new Scanner(System.in);
		
		// Prompt user for EMPLID
		System.out.println("Enter your Student EMPLID (0 - 99999): ");
			EMPLID = Scan.nextInt();
			
		// Prompt user for three test scores
		System.out.println("Enter your quiz1 percentage score (0.0 - 100.0): ");
			quiz1 = Scan.nextDouble();
		System.out.println("Enter your quiz2 percentage score (0.0 - 100.0): ");
			quiz2 = Scan.nextDouble();
		System.out.println("Enter your quiz3 percentage score (0.0 - 100.0): ");
			quiz3 = Scan.nextDouble();
			
		// Prompt for users' age
		System.out.println("Enter your age in months (0-1440); ");
			age = Scan.nextInt();
			
		// Prompt for current temperature
		System.out.println("Enter the current Temperature in degrees Celsius: ");
			temperatureC = Scan.nextDouble();
			
		
			
		
		// Print outputs
		System.out.println("*** Thank you***");
		System.out.println("Student EMPLID: " + EMPLID);
		System.out.println("Quiz 1 Score: " + quiz1);
		System.out.println("Quiz 2 Score: " + quiz2);
		System.out.println("Quiz 3 Score: " + quiz3);
		System.out.println("Average quiz score: " + average);
		System.out.println("Age in months: " + age);
		System.out.println("Age in years: " + ageInYears);
		System.out.println("Temperature in Celsius: " + temperatureC + "C");
		System.out.println("Temperature in Fahrenheit: " + temperatureF + "F");
	}
}