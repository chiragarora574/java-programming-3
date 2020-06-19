/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class complex
{
  Scanner sc = new Scanner (System.in);
  int r1,r2,i1,i2,a,b;
  void addcomplex ()
  {
    System.out.print ("enter the 1st real part");
    r1 = sc.nextInt ();
    System.out.print ("enter the 1st imaginary part");
    i1 = sc.nextInt ();
    System.out.print ("enter the 2nd real part");
    r2 = sc.nextInt ();
    System.out.print ("enter the 2nd imaginary part");
    i2 = sc.nextInt ();
    a=r1+r2;
    b=i1+i2;
    System.out.println("The sum is"+ a +"+i"+b);
  }
  void differnce()
  {
      a=r1-r2;
      b=i1-i2;
      System.out.println("The diffrence is"+ a +"+i"+b);
  }
  void multiply(){
      a=r1*r2;
      b=i1*i2;
      System.out.print("The product is"+a+"+i"+b);
  }
}

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);



    complex a1 = new complex ();
      a1.addcomplex();
      a1.differnce();
      a1.multiply();


  }
}
