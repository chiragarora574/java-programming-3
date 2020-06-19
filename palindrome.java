/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


import java.util.Scanner; 
  
 public class Main 
{ 
  
static int rev(int n, int temp) 
{ 
    
    if (n == 0) 
        return temp; 
  
    
    temp = (temp * 10) + (n % 10); 
  
    return rev(n / 10, temp); 
} 
  

public static void main (String[] args)  
{
    Scanner sc=new Scanner(System.in);
    int n; 
    System.out.print("Enter the number");
    n=sc.nextInt();
    int temp = rev(n, 0); 
      
    if (temp == n) 
        System.out.println("It is a palindrome"); 
    else
        System.out.println("Not a palindrome" ); 
} 
} 
