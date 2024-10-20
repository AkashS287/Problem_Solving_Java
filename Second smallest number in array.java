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
		int[] a = new int[n];
		for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int j=0;j<n;j++){
		    if(a[j]<min){
		        min = a[j];
		    }
		}
		int secmin = Integer.MAX_VALUE;
		for(int k=0;k<n;k++){
		    if(a[k]!=min && a[k]<secmin){
		        secmin = a[k];
		    }
		}
		if(secmin == Integer.MAX_VALUE) {
            System.out.println("No second smallest element.");
        } else {
            System.out.println(secmin);
        }
	}
}