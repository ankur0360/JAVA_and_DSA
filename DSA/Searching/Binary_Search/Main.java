import java.util.Arrays;

class Main
{
    public static void main(String[] args) {
        int[] arr = {50, 20, 70, 10, 30, 80, 60, 40};
        Arrays.sort(arr);
        System.out.println("Array is : " + Arrays.toString(arr));
        int l = 0,r = arr.length - 1,key = 15;
        int val = binarySearch(arr,l,r,key);
        if(val == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at index : " + val);
    }
    static int binarySearch(int[] arr,int l,int r,int x)
    {
        if (r >= l) 
        {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
