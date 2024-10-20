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
		int n =  sc.nextInt();
		int sum = 0;
		int o = n;
		int len = String.valueOf(n).length();
		while(n!=0){
		    int f = n % 10;
		    double m = Math.pow(f,len);
		    n /= 10;
		    sum += m; 
		}
		if(ams(o,sum)){
		    System.out.println("Armstrong");
		}
		else{
		    System.out.println("Not Armstrong");
		}
		
		
	}
	static boolean ams(int o,int sum){
	 	    return o==sum;
	 	}
}