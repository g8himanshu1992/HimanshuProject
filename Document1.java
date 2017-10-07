import java.util.Scanner;

class student
{
  public int roll_number,sub1,sub2;
  void getroll_number()
  {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter Your Roll Nmuber");
	roll_number=in.nextInt();
  }
}

class dis extends student
{
    void get_marks()
	{
	  Scanner in =new Scanner(System.in);
	  System.out.println("Enter your First subject marks");
	  sub1= in.nextInt();
    }
    void get_marks1()
    {
      	Scanner in=new Scanner(System.in);
      	System.out.println("Enter Your First Subject Marks");
      	sub2= in.nextInt();
	}
   void display()
	{
		System.out.println(" Your First Subject Marks"+sub1);
		System.out.println(" Your Second Subject Marks"+sub2);
		System.out.println(" Your Roll Number is"+roll_number);
	}
}

class Document1
{
	public static void main(String args[])
	{
		dis obj=new dis();
		obj.getroll_number();
		obj.get_marks();
		obj.get_marks1();
		obj.display();
	}
}

