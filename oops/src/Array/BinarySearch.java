package Array;
import java.util.*;
public class BinarySearch {
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array you want to create");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("unsorted array");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Sorted array");
        for(int i=0;i<size-1;i++){
            int min=arr[i];
            int minIndex=i;
            for(int j=i;j<size;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    
    
        System.out.println("\n Enter the element to be searched");
        int searchValue=sc.nextInt();
        int start=0;
        int end=size-1;
        int pos=0;
        for(int i=0;i<size;i++){
            int mid=(start+end)/2;
            if(searchValue==arr[mid]){
                pos=mid;
              break;
            }
            if(searchValue<arr[mid]){
                end=mid-1;
            }
            if(searchValue>arr[mid]){
                end=mid+1;
            }

        }
          System.out.println("found at "+pos);
    
}
}

    

