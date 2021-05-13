public class Q2 
{
        
    public static void main(String[] args) 
    {
    	int a[] = {2,4,6,8,10};
    	int sum = 0;
    	float avg = 0;
    	for(int i=0;i<a.length;++i)
    	{
    		sum = sum + a[i];
    	}
    	avg = sum/5;
    	System.out.println("Sum = "+sum);
    	System.out.println("Avg = "+avg);
    }
}
