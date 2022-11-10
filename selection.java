class selection{
    public static void main(String[] args) {
        //-----selection sort--------
        //Scanner sc=new Scanner(System.in);
        int[] arr;
        arr= new int[]{13,32,26,35,10};
        int n=5,j,i;
        for(i=0;i<n;i++)
        {
            //int min=arr[i];
            int minInd=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[minInd]>arr[j])
                {
                   // min=arr[j];
                    minInd=j;
                }
            }
            //----swap------
            int t=arr[i];
            arr[i]=arr[minInd];
            arr[minInd]=t;
           // System.out.println(min); 
        }
        for(i=0;i<n;i++)
        System.out.println(arr[i]);

    }
}