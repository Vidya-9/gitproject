import java.util.Scanner;
public class Average {
    public static void main(String args[]){
        int  sum=0,i,n;
        System.out.println("enter number of elements ");
        Scanner sc = new Scanner(System.in);
         n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array elements");
         for(i=0;i<n;i++){
             arr[i]=sc.nextInt();
             sum+=arr[i];
         }
         int avg=sum/n;
         System.out.println(avg);

    }
}
