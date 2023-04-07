import java.util.Arrays;

class Main
{
    public static void main(String[] args) {
        int[] arr = {50, 20, 70, 10, 30, 80, 60, 40};
        System.out.println("Array is : " + Arrays.toString(arr));
        int len = arr.length,key = 50;
        int val = linearSearch(arr,len,key);
        if(val == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at index : " + val);
    }
    static int linearSearch(int[] arr,int len,int key)
    {
        for(int i = 0;i < len; i++)
            if(arr[i] == key)
                return i;
        return -1;
    }
}
