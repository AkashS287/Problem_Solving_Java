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
		for(int i=1;i<=n;i++){
		    for(int j=i;j<=n;j++){
		        System.out.print(" ");
		     }
		    for(int j=1;j<=2*i-1;j++){
		        System.out.print("*");
		     }
		    System.out.println();
		}
		for(int i=n-1;i>=1;i--){  //5 - 1 = 4
		    for(int j=n;j>=i;j--){
		           System.out.print(" ");
		        }
		       for(int j=1;j<=2*i-1;j++){
		        System.out.print("*");
		       }
		       System.out.println();
		  }
	  }
}