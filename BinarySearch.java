import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] arr,int target,int low,int high)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(target==arr[mid])
                return mid;
            if(target>arr[mid])
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("Size of array:");
        int high = sc.nextInt();
        arr = new int[high];
        System.out.println("Enter Elements:");
        for (int i = 0; i < high; i++) {
            int k = sc.nextInt();
            arr[i] = k;
        }
        System.out.println("target Element:");
        int target=sc.nextInt();
        System.out.println("strting arr:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
        int index = search(arr, target, 0, high - 1);
        System.out.println("final arr:"+Arrays.toString(arr));
        System.out.println("we found it at:"+index);
    }
}
