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
	    System.out.println("Enter the n size:");
	    int n  = sc.nextInt();
	    int[] arr = new int[n];
	    int max = arr[0];
	    System.out.println("Enter the arrays");
	    for(int j=0;j<n;j++){
	        arr[j] = sc.nextInt();
	    }
	    
	    for(int i=0;i<n;i++){
	        if(arr[i]>max){
	            max = arr[i];
	        }
	    }
	    System.out.println("Maximum no in the array is "+max);
	}
}