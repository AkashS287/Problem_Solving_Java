/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// import java.util.*;
public class Main
{
    //each no of students should shake hand wth each students
	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
		int n1 = 1;
		int d1 = 3;
		int n2 = 3;
		int d2 = 9;
		int numerator = (n1*d2)+(d1*n2);
		int denominator = d1*d2;
		int res = gcd(numerator,denominator);
		int onum= numerator/res;
		int oden= denominator/res;
		System.out.println(onum+" "+oden);
}
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}