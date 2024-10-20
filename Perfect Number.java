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
		int sum =0;
		for(int i=1;i<n;i++){
		    if(n%i==0){
		        sum = sum + i;   //1+3     1 + 2 + 4 + 7 + 14 = 28. 6
		    }
		}
		if(sum==n){
		        System.out.println("perfect");
		    }
		    else{
		        System.out.println("not perfect");
		    }
	}
}