import java.util.Arrays;

class Main
{
    public int part(int[] arr,int l,int h)
    {
        int p = arr[h];
        int i = l - 1;
        for (int j = l; j <= h -1 ; j++) 
        {
            if(arr[j] <= p)
            {
                i ++;
                int t1 = arr[i];
                arr[i] = arr[j];
                arr[j] = t1;

            }   
        }
        int t2 = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = t2;
        return i + 1;
    }
    void quickSort(int arr[],int l,int h)
    {
        if(l < h)
        {
            int p = part(arr, l, h);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, h);
        }
    }
    public static void main(String[] args) 
    {
        Main m = new Main();
        int[] arr = {2,5,6,1,3,20};
        int h = arr.length;
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        m.quickSort(arr, 0, h - 1);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }
}
