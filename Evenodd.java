import java.util.Scanner;

class Evenodd
{
  public static void main(String args[])
  {
    int n,flag=0,counter;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter your Number which you want to check whither it is even or odd");
    n=in.nextInt();
    if(n>0)
    {
      if(n%2==0)
      {
        System.out.println("Even");
        System.out.println("Even Numbers");
      }
      else
      {
        System.out.println("Odd");
      }
    }

  }

}
