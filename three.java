import java.util.*;
class three
{
public static void main(String args [])

{
                int[] arr={2,1,1,3,5,50,12};
		Arrays.sort(arr);
		int n=arr.length;
		int p=n-1;
		while(p!=0)
		{
		    int sum=0;
		    for(int i=0 ; i<p ; i++)
		    {
		        sum+=arr[i];
		    }
		    if(sum>arr[p])
		    {
		        System.out.print(sum);
		    }
		    p-=1;
		}
   }

}