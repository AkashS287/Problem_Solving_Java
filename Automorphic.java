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
	  Long n = sc.nextLong();
	  lastnum(n);
	}
	static long sqr(long n){        //5 = 25
	    long sr =(long)(Math.pow(n,2));
	    return sr;
	}
	static void lastnum(long num){
	    long temp = sqr(num);
	    String tempstr = Long.toString(temp);
	    String numstr = Long.toString(num);
	    if(tempstr.endsWith(numstr)){
	        System.out.println("Automorphic");
	    }
	    else{
	        System.out.println("Not Automorphic");
	    }
	}
}