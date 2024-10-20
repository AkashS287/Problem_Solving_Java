/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		// octal to decimal
		Scanner sc = new Scanner(System.in);
		int oct = sc.nextInt();
		int dec = 0;
		int m=0;
		while(oct > 0){
		    int t = oct%10;
		    dec += t*Math.pow(8,m);
		    m++;
		    oct /= 10;
		}
		//decimal to hexadecimal
		StringBuilder hex = new StringBuilder();
		while(dec>0){
		    int p = dec%16;
		    if(p<=9){
		        hex.append(p);
		    }
		    else{
		        hex.append((char)(65 + (p-10)));
		    }
		    dec /= 16; 
		}
		hex.reverse();
		System.out.println(hex);
	}
}