/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    int n = sc.nextInt(); //111000
	    StringBuilder str = new StringBuilder();
	    String s = Integer.toString(n);
	    int len = s.length();
	    for(int i=1;i<=len;i++){
	        int temp = n%10;
	        if(temp==0){
	            str.append(1);
	        }
	        else{
	            str.append(temp);
	        }
	        n = n/10;
	    }
	    str.reverse();
	    System.out.println(str);
	}
}