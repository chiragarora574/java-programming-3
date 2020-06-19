/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
int n,temp,a,b=0;
System.out.print("Enter the number");
n=sc.nextInt();
temp=n;
while(n>0){
    a=n%10;
    n=n/10;
    b=b+(a*a*a);
}
if(b==temp){
    System.out.print("It is a armstrong no.");
}
else{
    System.out.print("Not a armstrong number");
}


  }
}
