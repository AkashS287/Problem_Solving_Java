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
		detect(n);
	
		}
		static int fact(int num){
		  int fact = 1;
		  for(int i = 1;i<=num;i++){
		        fact = fact*i;
		     }
		    return fact;
		}
		static void detect(int n){
		    int sum=0;
		    int temp = n;
		    int fetch;
		    while(temp!=0){
		        fetch = temp%10;
		        sum = sum + fact(fetch);
		        temp = temp/10;
		    }
		    if(sum==n){
		        System.out.println(sum+" Strong Number");
		    }
		    else{
		        System.out.println(sum+"!="+n+"Not a Strong Number");
		    }
		}
	}
