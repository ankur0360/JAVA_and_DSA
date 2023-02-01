import java.util.Arrays;
import java.util.Collections;
class Main
{
    public static void main(String[] args) {
        Integer arr[] = {1,2,3};
        Integer copy[] = arr.clone();
        Collections.reverse(Arrays.asList(arr));
        if(arr == copy)
            System.out.println("Yes");
        else
          System.out.println("No");
    }
}
