import java.io.*;

public class RevProgTwo 
{
	/**
	 * @param xyz
	 * @throws IOException
	 */
	public static void main(String xyz[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of the array");
		int size = Integer.parseInt(br.readLine());
		int a[]=new int[size];

		System.out.println("the size of array is "+size);
		System.out.println("Please enter the elements of the array ");

		for (int i=0 ; i < size ; i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
				
		for (int k = 0; k < a.length/2; k++) 
		{
    			int temp = a[k];
    			a[k] = a[a.length-(1+k)];
   			a[a.length-(1+k)] = temp;
		}

		System.out.println("Please enter the array dividing factor (n) ");
		int n = Integer.parseInt(br.readLine());
		int r = size%n;
		
		if(r==0)
		{
			int itr = size/n;
			int m = n;
			int stop = 0;
			
			for(int i=0; i < itr; i++)
			{
				for(int j=m; j > stop; j--)
				{
					System.out.print(a[j-1]+" ");
					
				}
				m = m + n;
				stop = stop + n;
			
			}	
		
		}
		else
		{
			int itr = size/n;
			int m = n;
			int stop = 0;
			
			for(int i=0; i < itr; i++)
			{
				for(int j=m; j > stop; j--)
				{
					System.out.print(a[j-1]+" ");
					
				}
				m = m + n;
				stop = stop + n;
			}
			
			int last = size-r;
			int s= size-1;
			while(s >= last)
			
			{
				System.out.print(a[s]+" ");
				s=s-1;
				
			}
		}
		
	}
}
