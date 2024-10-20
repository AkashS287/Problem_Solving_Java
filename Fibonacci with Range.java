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
		int first = 0;
		int second = 1;
		System.out.print(first);
		System.out.print(second);
		for(int i=2;i<n;i++){
		    int temp = first+second;
		    System.out.print(temp);
		    first = second;
		    second = temp;
		}
	}
}