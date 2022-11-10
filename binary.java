import java.util.Scanner;
class bi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //----------binary search--------
        // int[] arr;
        // arr= new int[]{10,23,41,53,90,100,120};
        int s,n,l,r,m;
        System.out.println("enter a length");
        n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("enter a searching element");
        s=sc.nextInt(); 
        l=0;
        r=n-1;  
while(true)
    {
        m=(r+l)/2;
        if(s==arr[m])
        {
            System.out.println(m);
            return;
        }
        if(s<arr[m])
            r=m-1;
        if(s>arr[m])
            l=m+1;
    }
    }  
}