
import java.util.*;
public class recursive {
        
    /**
     * Creates a new instance of <code>recursive</code>.
     */
    public recursive() {
    }
    static void  counting(int n)
    {
    	if(n==0)
    	{
    		return;
    	}	
    	else
    	{
    		System.out.println("number is "+n);
    		counting(n-1);
    	}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Sc.nextInt();
        counting(n);
        
    }
}
