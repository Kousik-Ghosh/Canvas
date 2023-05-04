import java.util.Arrays;



public class Leet {

    public static void main(String[] args) {
    

        int[][] arr = new int[][]{{1,3,4},{2,3,5},{3,4,2},{5,8,9},{2,8,10}};

        // Arrays.sort(arr,(x,y)->y[2]-x[2]);
        Arrays.sort(arr, (a, b)->a[0]==b[0]? a[1]-b[1]:a[0]-b[0]);

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }

       

    }
}