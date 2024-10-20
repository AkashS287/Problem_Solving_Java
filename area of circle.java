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
		double n = sc.nextDouble();
		AreaCircle(n);
	}
	static void AreaCircle(double num){
	    double temp = (3.14)*(num*num);
	    System.out.println(temp);
	}
}