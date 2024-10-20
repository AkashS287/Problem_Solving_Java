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
		for(int i=n;i>0;i--){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    if((i==1) || (i==n)){
		        for(int j=1;j<=2*i-1;j++){
		            System.out.print("*");
		        }
		    }
		    else{
		       for(int j=1;j<=2*i-1;j++){
		        if((j==1) || (j==2*i-1)){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }   
		    }
		    System.out.println();
		}
	}
}