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
		String n = sc.next();
		String hex = "0123456789ABCDEF";
		int dec = 0;
		int m=0;
		for(int i =n.length()-1;i>=0;i--){    //1A3
		    char temp = n.charAt(i);
		    dec += check(temp,hex)*Math.pow(16,m);
		    m++;
		}
		System.out.println(dec);
	}
	static int check(char x,String hex){
	    return hex.indexOf(x);
	}
}