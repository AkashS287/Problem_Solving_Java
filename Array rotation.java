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
		int d = sc.nextInt(); //2
		int[] a = {1,2,3,4};
		int[] temp = new int[d];
		d = d % a.length;
 		for(int i=0;i<d;i++){
		   temp[i] = a[i];    
		}
		for(int i=0;i<a.length-d;i++){
		    a[i] = a[i+d];
		}
		for(int i=0;i<d;i++){
		    a[a.length-d+i] = temp[i];
		}
		System.out.println(Arrays.toString(a));
	}
}