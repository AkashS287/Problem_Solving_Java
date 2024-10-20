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
		check(n);
	}
	static void check(int n){
	    for(int i=1;i<=n;i++){
	        if(n%2==0){
	            System.out.println(2+" ");
	            n /= 2;
	        }
	    }
	    for(int i=3;i<=Math.sqrt(n);i+=2){
	           while(n%i==0){
	                System.out.println(i);
	                n /= i;
	            }
	        }
	    if(n>2){
	            System.out.println(n);
	        }     
	}
}