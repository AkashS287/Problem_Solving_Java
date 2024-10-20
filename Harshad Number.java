/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();     //18
		int sum = 0;
		int digit = 0;
		int temp = n;
	    while(temp>0){
	        digit = temp%10;
	        sum = sum + digit;
	        temp = temp/10;
	    }
	    
	    if(n%sum==0){
	          System.out.println("Harshad");
	         }
	   else{
	           System.out.println("Not Harshad");
	         }
	}
}