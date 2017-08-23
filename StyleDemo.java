/*
 * File: StyleDemo.java
 * Author: Yael Brown
 * Date: August 22, 2017
 * Purpose: This program demostrates the use of Standard I/O
 * classes including the BufferedReader and Scanner classes.
 */

package com.cm141.w2;

// Import each required Java class
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * StyleDemo
 */
public class StyleDemo {
	public static void main(String[] args) throws IOException {
		// Variables to hold values
		int favInt = 0;
		double favDouble = 0.0;
		int secondfavInt = 0;
		double secondfavDouble = 0.0;
		boolean myBoolean = false;
		short myShort = 0;
		
		// Define a InputStreamReader based on Standard Input
		InputStreamReader isReader = new InputStreamReader(System.in);
		// Send the InputStreamReader to a BufferedReader
		BufferedReader stdin = new BufferedReader(isReader);
		
		// Prompt the user to enter a byte
		System.out.println("Enter your favorite byte value:");
		// the nextByte() method scans the next byte value
		byte myByte = scannerIn.nextByte();
		System.out.println("Your favorite byte is: " + myByte);
		
		secondFavInt = scannerIn.nextInt();secondFavDouble = scannerIn.nextDouble();
		System.out.println("Your second favorite int is: " + secondFavInt);
		System.out.println("Your second favorite double is: " + secondFavDouble);	
	}
}
