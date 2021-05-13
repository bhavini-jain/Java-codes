import java.util.*;
public class Q1
{
    static float add(float x,float y)
    {
        return x+y;
    }

    static float sub(float x,float y)
    {
        return x-y;
    }

    static float mul(float x,float y)
    {
        return x*y;
    }

    static float div(float x,float y)
    {
        return x/y;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a,b,ch,res;
        System.out.println("MENU - ");
        System.out.println("1.Add ");
        System.out.println("2.Subtract ");
        System.out.println("3.Multiply ");
        System.out.println("4.Divide ");
        System.out.print("Enter ur choice : ");
        ch = sc.nextInt();
        
        if(ch == 1)
        {
            System.out.print("Enter a = ");
            a = sc.nextFloat();
            System.out.print("Enter b = ");
            b = sc.nextFloat();
            res = add(a,b);
            System.out.println("Addition = "+res);
        }
        else if(ch==2)
        {
            System.out.print("Enter a = ");
            a = sc.nextFloat();
            System.out.print("Enter b = ");
            b = sc.nextFloat();
            res = sub(a,b);
            System.out.println("Subtraction = "+res);
        }
        else if(ch == 3)
        {
            System.out.print("Enter a = ");
            a = sc.nextFloat();
            System.out.print("Enter b = ");
            b = sc.nextFloat();
            res = mul(a,b);
            System.out.println("Multiplicaiton = "+res);
        }
        else if(ch==4)
        {
            System.out.print("Enter a = ");
            a = sc.nextFloat();
            System.out.print("Enter b = ");
            b = sc.nextFloat();
            res = div(a,b);
            System.out.println("Division = "+res);
        }
        else
        {
            System.out.println("Wrong ip");
        }

    }
}