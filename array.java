import java.util.*;
public class array
{
    static int es(int a[])
    {
        
            int n=a.length;
            int sum=0,max=0;
            for (int i=0;i<n;i++) {
                sum+=a[i];
                max=Math.max(a[i],max);
                
            }
            if((sum-max)>max)
            {
                return sum;
            }
            return 0;
        
    }
	public static void main(String[] args) {
		int[] arr={2,1,1,3,5};
		Arrays.sort(arr);
	    for(int i=arr.length-1 ; i<=0 ; i--)
	    {
	        arr[i]=0;
	        System.out.print(es(arr));
	    }
		
	}
}