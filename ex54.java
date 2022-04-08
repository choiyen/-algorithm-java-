import java.util.Arrays;
import java.util.Comparator;

public class ex54 {
    public static void main(String[] args) 
    {
        int [][] point = {{2,7},{1,3}, {1,2}, {2,5},{3,6}};
        Arrays.sort(point, (a,b) -> {
             if(a[0] == b[0])
             {
                 return a[1] - b[1];
             }
             else
             {
                 return a[0] - b[0];
             }
        });
        for(int [] arr : point)
        {
            System.out.println(Arrays.toString(arr));
        }
    }
}
