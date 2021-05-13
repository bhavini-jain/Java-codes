import java.util.*;
class input_character
{
	public static void main(String args[])
	{
		Scanner Sc = new Scanner(System.in);
		char a;
		System.out.println("Enter a character");
		a = Sc.next().charAt(0);
		System.out.println("Character is "+a);
	}
}