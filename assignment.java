class Solution 
{
    public boolean divideArray(int[] arr,int n) {
        int temp=0;
        for( int a=0;a<n;a++)
        {
            for( int b=1;b<n-1;b++)
            {
                if(arr[b]<arr[b-1])
                {
                    temp= arr[b];
                    arr[b]=arr[b-1];
                    arr[b-1]=temp;
                }
            }
        }

        int target = arr[0]+arr[n-1];
        int i=0; 
        int j=n-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==target)
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
        }
        
    }
    
    
}


class Hello
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
  
    }

    Solution obj  = new Solution();

    boolean output = obj.divideArray(arr,n);
    if(output)
    {
        System.out.print("True");
    }
    else{
        System.out.print("False");
    }
    
 }
}


