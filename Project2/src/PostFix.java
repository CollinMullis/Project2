/* Post Fix Calculator, 
 * Coded by Collin Mullis
 * April 11th, 2016
 */

import java.util.Arrays;
import java.util.Scanner;


public class PostFix {
	
	private static String[] stackArray;
	private static int stackSize;
	
	private static int[] stackInt;
	
	private static int topOfStack = -1;
	
	private static int SIZE = 50;
	
	PostFix(){
		
		stackSize = SIZE;
		stackArray = new String [SIZE];
		stackInt = new int [SIZE];
		
	}
	
	public static void push(String input) {
		
		if(topOfStack + 1 < stackSize) {
			
			topOfStack++;
			
			stackArray[topOfStack] = input;
		}
		else System.out.println("Sorry But the Stack is Full");
		
	//	displayPostFix();
		
		System.out.println("PUSH" + input + " Was Added to Stack 1\n");
	}
	
	public static void push1(int input) {
		if(topOfStack + 1 < stackSize) {
			
			topOfStack++;
			
			stackInt[topOfStack] = input;
			
			System.out.println("PUSH" + input + " Was Added to Stack 2\n");
		}
	}
	public String pop() {
		if(topOfStack >= 0) {
			
			//	displayPostFix();
				
				System.out.println("POP" + stackArray[topOfStack] + " Was Removed From the Stack\n");
				
				stackArray[topOfStack] = "-1";
				
				return stackArray[topOfStack--];
				
				}else{
					// displayPostFix();
					System.out.println("Sorry But the First Stack is Empty");
					return "-1";
				}		
		}
	
	public int pop2() {
		if(topOfStack >= 0) {
			
			//	displayPostFix();
				
				System.out.println("POP2" + stackArray[topOfStack] + " Was Removed From the Stack\n");
				
				stackInt[topOfStack] = -1;
				
				return stackInt[topOfStack--];
				
				}else{
					// displayPostFix();
					System.out.println("Sorry But the Second Stack is Empty");
					return -1;
				}		
		}
	
	public static void pushMany(String multipleValues) {
		String []  tempString = multipleValues.split(" ");
		
		for(int i = 0; i < tempString.length; i++) {
			if (tempString[i].matches("\\d+$")) {
				int temp = Integer.parseInt(tempString[i]);
				push1(temp);
			} else {
				push(tempString[i]);
			}
		}
	}
		
	public static void separate(String newStackArray) {
		
		
	}
	public static void main(String[] args) {
		
		PostFix postFix = new PostFix();
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Integers: ");
		String newS = reader.nextLine();
		
		pushMany(newS);
		
		System.out.println(stackArray);
		}
	}