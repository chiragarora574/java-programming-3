/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{    
    public static void  invert(int n)
    {
        if(n==0)
        {
            System.out.print(n+ " ");
        }
        else
        {
            System.out.print(n+" ");
            invert(n-1);
            System.out.print(n+" ");
        }
    }
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the value: ");
        int i= sc.nextInt();
        invert(i);
	}
}
