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
		int r = sc.nextInt();
		int n = sc.nextInt();
		int diff = n-r;
		int formula = fact(n)/fact(diff);
		System.out.println(formula);
	}
	static int fact(int n){
	    int fact = 1;
	    for(int i=1;i<=n;i++){
	        fact *=i;
	    }
	    return fact;
	}
	
}