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
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Exactly divisors:");
		int x = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++){
		    int count_factors = 0;
		    for(int j=1;j<=i;j++){
		        if(i%j==0){
		            count_factors++;
		        }
		    }
		    if(count_factors==x){
		        count++;
		    }
		}
		System.out.println(count);
	}
}