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
		StringBuilder bin = new StringBuilder();
		while(n>0){
		    int temp = n%2;
		    bin.append(temp);
		    n /= 2;
		}
		bin.reverse();
		System.out.println(bin);
	}
}