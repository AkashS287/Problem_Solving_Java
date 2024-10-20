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
		for(int i=2;i<=n/2;i++){
		    int j=n-i;
		    if(prime(i) && prime(j)){           // 1 + 1
		        System.out.println(i+"+"+j);
		    }
		}
	}
	static boolean prime(int num){
	    if(num<=1){
	        return false;
	    }
	    for(int k=2;k<=Math.sqrt(num);k++){
	        if(num%k==0){
	           return false;
	        }
	    }
	    return true;
	}
}