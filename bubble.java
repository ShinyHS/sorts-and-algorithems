class bubble{
    public static void main(String[] args) {
        //-------binary sort-------- 
        //Scanner sc=new Scanner(System.in);
        int[] arr;
        arr= new int[]{13,32,26,35,10};
        int n=5,j,i;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]);

    }
}