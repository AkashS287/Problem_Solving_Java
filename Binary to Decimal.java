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
		int n =sc.nextInt();  //111001=57
		int decimal = 0;
		int m = 0;
	    while(n>0){
	        int temp = n%10;
	        decimal += temp*Math.pow(2,m);
	        n = n/10;
	        m++;
	    }
	    System.out.println(decimal);
	}
}