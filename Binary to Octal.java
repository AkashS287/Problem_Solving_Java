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
		int binary = sc.nextInt();
		int decimal = 0;
		int n = 0;
		while(binary>0){
		    int temp = binary%10;
		    decimal += temp*Math.pow(2,n);
		    n++;
		    binary /= 10;
		}
		int[] oct = new int[20];
		int j = 0;
		while(decimal>0){
		    int r = decimal%8;
		    oct[j++] = r;
		    decimal /= 8;
		}
		for(int i=j;j>=0;j--){
		    System.out.print(oct[j]);
		}
	}
}