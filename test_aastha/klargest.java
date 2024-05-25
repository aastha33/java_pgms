import java.util.*;

public class klargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        Arrays.fill(brr, 0);
        int[] crr = new int[n];
        System.out.println("Enter the value of k : ");
        int k =sc.nextInt();
        if(k>n)
        {
            System.out.println("Enter the valid value");
        }
        else
        {
            for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            crr[i]=arr[i];
        }
        for(int i=0;i<k;i++)
        {
        
        int maxi=Integer.MIN_VALUE;
        int index=0;
        for(int j=0;j<n;j++)
        {
            if(maxi<arr[j])
            {
                maxi=arr[j];
                index=j;
            }
        }
        
        brr[index]=1;
        arr[index]=Integer.MIN_VALUE;
        }
        
        for(int i=0;i<n;i++)
        {
            if(brr[i]==1)
            System.out.print(crr[i]+" ");
        }
        }
        
    }
  
  
}