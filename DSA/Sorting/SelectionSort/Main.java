import java.util.Arrays;

class Main
{
    public static void main(String[] args) {
        int[] arr = {50, 20, 70, 10, 30, 80, 60, 40};
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int m = i;
            for (int j = i + 1; j < arr.length; j++) 
            {
                if(arr[j] < arr[m])
                    m = j;    
                int t = arr[m];
                arr[m] = arr[i];
                arr[i] = t;
            }    
        }
        System.out.println(Arrays.toString(arr));
    }
}
