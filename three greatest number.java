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
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
	    int n3 = sc.nextInt();
	    int res = (n1>n2) ? ((n1>n3) ? n1 : n3) : ((n2>n3) ? n2:n3) ;
	    System.out.println(res);
	}
}