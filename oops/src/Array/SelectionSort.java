package Array;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array elements");
        
            for(int i=0;i<size;i++)
            {
                array[i]=sc.nextInt();

            }
        System.out.println("Unsorted array \n");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        //sorting
        for(int i=0;i<size-1;i++){
            int min=array[i];
            int minIndex=i;
            int j;
            for( j=i;j<size;j++)
            {
                if(array[j]<min)
                {
                    min=array[j];
                    minIndex=j;

                }
            }
            //swapping
            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;


        }
        System.out.println("Sorted array \n");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
