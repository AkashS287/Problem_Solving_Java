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
	    for(int j=1;j<=n;j++){
	        if(isprime(j)){
	            System.out.println(j);
	        }
	    }
	    
	}
	static boolean isprime(int num){
	    if(num<2){
	        return false;
	    }
	    else{
	        for(int i=2;i<num/2;i++){
	            if(num%i==0){
	                return false;
	            }
	        }
	    }
	    return true;
	}
}