package Pre_work_Pacakage;
import java.util.Scanner;


import java.util.Scanner;



public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   System.out.println("enter your string to check for plaindrome");
    	   
    	   String inputString = sc.next();
    	   
    	   char[] reverseCharArrayOfInputString = new char[inputString.length()];
    	   
    	   
    	   /*following loop is to break the inputString into characters in
    	    * reverse order and store them in char array 
    	   */
    	   int reverseIndex = inputString.length();
    	  
    	   for (int i = 0; i < inputString.length(); i++) {
    		   reverseCharArrayOfInputString[i] = inputString.charAt(reverseIndex - 1);
    		   reverseIndex--;
    		  }
    	   
    	   String reverseInputString = new String(reverseCharArrayOfInputString);
    	   
    	   if (inputString.equals(reverseInputString)) {
    		   System.out.println("given string is a palindrome");
    	   }
    	   else {
    		   System.out.println("given string is not a palindrome");
    	   }
    	   
      }

 

            //function to printPattern

       public void printPattern() {
    	   
    	   System.out.println("Enter number of stars to start");
    	   
    	   int numberOfStarToStart = sc.nextInt();
    	  
    	   for (int outsideLoopIndex = 0; outsideLoopIndex < numberOfStarToStart; outsideLoopIndex++ ) {
    		   int insideLoopConditionIndex = numberOfStarToStart - outsideLoopIndex;
    		   for (int insideLoopIndex = 0; insideLoopIndex < insideLoopConditionIndex; insideLoopIndex++) {
    			   System.out.print("*");
    		   } 
    		   System.out.println();
    	   }
      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	System.out.println("enter the number to check if Prime or not");
        	
        	int number = sc.nextInt();
        	
        	boolean isPrime = true;
        	
        	for (int divisor = 2; divisor < number; divisor++) {
        		if (number%divisor == 0) {
        			System.out.println(number + " is not a prime number");
        			isPrime = false;
        			break;
        		}
        	}
        	
        	if (isPrime) {
        		System.out.println(number + " is prime number");
        	}
        	
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {
        	  
        	  System.out.println("enter the number of terms of Fibonacci Series you want to print");
        	  
        	  int number = sc.nextInt();
        	//initialize the first and second value as 0,1 respectively.
        	  
        	  int first = 0, second = 1;
              
        	  System.out.print(first + ", ");
              
        	  System.out.print(second + ", ");
              
              for (int i = 2; i < number; i++) {
           	   System.out.print((first + second)+ ", ");
                  int third = first + second;
                  first = second;
                  second = third;
                
                  }
           
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
		 

      

		

		 

		




