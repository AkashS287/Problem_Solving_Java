/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int[] a ={1,2,3,4};
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		StringBuilder str = new StringBuilder();
		if(d>a.length){
		    d = d % a.length;
		}
		for(int i=0;i<d;i++){
		    str.append(a[i]);
		}
		
		
		for(int i=d;i<a.length;i++){
		    System.out.print(a[i]);
		}
		
		System.out.print(str);
		
	}
}