import java.util.*;
public class Q3 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
     	int m,n,i,j,p,q,k;
     	int a[][] = new int[10][10];
     	int b[][] = new int[10][10];
     	int c[][] = new int[10][10];
     	System.out.println("Enter rows and column of matrix A :");
     	System.out.print("r = ");
     	m = sc.nextInt();
     	System.out.print("c = ");
     	n = sc.nextInt();
     	
     	System.out.println("Enter rows and column of matrix B :");
     	System.out.print("r = ");
     	p = sc.nextInt();
     	System.out.print("c = ");
     	q = sc.nextInt();
     	
     	if(n==p)
     	{
        	
     		System.out.println("===========================");
     		System.out.println("Enter matrix A : ");
     		for(i=0;i<m;++i)
     		{
     			for(j=0;j<n;++j)
     			{
     				
     				a[i][j] = sc.nextInt();
     			}
     		}	
     	
     		System.out.println("===========================");
     	
     		System.out.print("Enter matrix B : \n");
     		for(i=0;i<p;++i)
     		{
     			for(j=0;j<q;++j)
     			{
     				
     				b[i][j] = sc.nextInt();
     			}
     		}
     		System.out.println("===========================");
     		System.out.println("Multiplicaiton of matric A and B is : ");
     		
     		for(i=0;i<m;++i)
     		{
     			for(j=0;j<q;++j)
     			{
     				c[i][j]= 0;
     				for(k=0;k<n;++k)
     				{
     					c[i][j] = c[i][j] + (a[i][k]*b[k][j]);
     				}
     			}
     		}
     			
     			System.out.println("===========================");
     		for(i=0;i<m;++i)
     		{
     			System.out.print("\n");
     			for(j=0;j<q;++j)
     			{
     				System.out.print(c[i][j]+" ");
     			}
     		}
     	}
     	else
     	{
     		System.out.println("Multiplicaiton is not possible ");
     	}
     		
    }
}
