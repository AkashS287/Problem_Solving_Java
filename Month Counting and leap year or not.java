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
		int n = sc.nextInt();
		switch(n){
		    case 1:
		    case 3:
		    case 5:
		    case 8:
		    case 10:
		    case 12:
		    System.out.println("31 days");   
		    break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    System.out.println("30 days"); 
		    
		    case 2:
		        int year = sc.nextInt();
		        if((year%400==0) || (year%4==0) && (year%100!=0)){
		            System.out.println("leap year");
		        }
		        else{
		            System.out.println("Not a leap year");
		        }
		}
	}
}