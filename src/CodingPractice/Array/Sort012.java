package CodingPractice.Array;

// Java program to sort an array of 0, 1 and 2
import java.io.*;

class countzot {

    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0,temp=0;

        System.out.println("Case " + a[mid] + ", lo = " + lo + ", mid = " + mid + ", hi = " + hi);
        printArray(a, arr_size);


        while (mid <= hi)
        {
            switch (a[mid])
            {
                case 0:
                {
                    System.out.print("Case " + a[mid] + " : ");
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    System.out.println("lo = " + lo + ", mid = " + mid + ", hi = " + hi);
                    printArray(a, arr_size);
                    break;
                }
                case 1:
                    System.out.print("Case " + a[mid] + " : ");
                    mid++;
                    System.out.println("lo = " + lo + ", mid = " + mid + ", hi = " + hi);
                    printArray(a, arr_size);
                    break;
                case 2:
                {
                    System.out.print("Case " + a[mid] + " : ");
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    System.out.println("lo = " + lo + ", mid = " + mid + ", hi = " + hi);
                    printArray(a, arr_size);
                    break;
                }
            }
        }
    }

    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i]+" ");
        System.out.println("\n");
    }

    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after seggregation ");
        printArray(arr, arr_size);
    }
}
