/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int digitsum(int n){
    if(n==0){
        return 0;
    }
    else{
        return (n%10 +digitsum(n/10));
    }
}
  public static void main (String[]args)
  {  Scanner sc = new Scanner (System.in);
  int n;
    System.out.print("Enter the number ");
    n=sc.nextInt();
    int result = digitsum(n);
     System.out.print(result); 
  }
}

