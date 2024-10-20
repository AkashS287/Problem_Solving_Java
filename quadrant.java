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
		int m = sc.nextInt();
		int n = sc.nextInt();
	    res(m,n);
	}
	static void res(int x,int y){
		
		if(x>0 && y>0){
		    System.out.println("Quadrant I");
		}
		else if(x<0 && y>0){
		    System.out.println("Quadrant II");
		}
		else if(x<0 && y<0){
		    System.out.println("Quadrant III");
		}
		else if(x>0 && y<0){
		    System.out.println("Quadrant IV");
		}
		else if(x==0 && y==0){
		    System.out.println("Origin");
		}
		else if(x!=0 && y==0){
		    System.out.println("X-axis");
		}
		else if(x==0 && y!=0){
		    System.out.println("Y-axis");
		}
	}
}