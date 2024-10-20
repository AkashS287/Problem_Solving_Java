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
		StringBuilder oct = new StringBuilder();
		while(n>0){
		    int temp = n%16;
		    if(temp<=9){
		        oct.append(temp);
		    }
		    else{
		        oct.append((char)(65 + (temp-10)));
		    }
		    n /= 16;
		}
		oct.reverse();
		System.out.print(oct);
	}
}