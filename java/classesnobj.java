
import java.util.*;
public class student
{
        public int roll;
		public float marks1;
		public float marks2;
		public String name;
    	public void getdata()
    	{
    Scanner Sc = new Scanner(System.in);
     System.out.println("Enter name");
     name = Sc.next();
     System.out.println("Enter Roll No.");
     roll = Sc.nextInt();
     System.out.println("enter marks 1");
     marks1 = Sc.nextFloat();
     System.out.println("enter marks 2");
     marks2 = Sc.nextFloat();
    }
     
    public void show()
		{
			System.out.print("\n");
			System.out.print("\nName : "+name);
			System.out.print("\nRoll number : "+roll);
			System.out.print("\nMarks 1 : "+marks1);
			System.out.print("\nMarks 2 : "+marks2);
		}
		
    

    public static void main(String[] args) 
    	{
        classesnobj a= new classesnobj();
        a.getdata();
        a.show();
    }
}
