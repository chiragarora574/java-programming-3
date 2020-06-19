
import java.util.Scanner;
class area
{
  Scanner sc = new Scanner (System.in);
  int l, b, area;
  void setdims ()
  {
       System.out.print ("enter lenght");
    l = sc.nextInt ();
    System.out.print ("enter breadth");
    b = sc.nextInt ();
  }

  int getarea ()
  {
    //int area;
    area = l * b;
    System.out.print (area);
    return 0;
  }


}

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);



    area a1 = new area ();
      a1.setdims ();
      a1.getarea ();


  }
}
