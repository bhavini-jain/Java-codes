import java.util.*;
class add
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		String name;
		int age;
		double marks;
		System.out.println("Enter ur name");
		name = Sc.nextLine();
		System.out.println("Enter ur Age");
		age = Sc.nextInt();
		System.out.println("Enter ur Marks");
		marks = Sc.nextDouble();
		System.out.println("Name="+name+"\nAge = "+age+"\nMarks ="+marks);	
	}
}
