import java.util.Arrays;

public class SimpleArray {
    static void run(){

        int[] arr = new int[]{3,7,9,4,11,3,4,66,0,42,93,58,389,49};

        // Sort
        Arrays.sort(arr);
        print(arr);


        // Binary Search 
        int pos = Arrays.binarySearch(arr, 11);
        System.out.println("POSITION: "+pos);


        // New array with existing data and increased-0/decreased length
        int[] arrCopy = Arrays.copyOf(arr, 50);
        System.out.println("New Array Length: "+arrCopy.length);


        // New array with existing data and same length
        int[] arrClone = arr.clone();
        System.out.println("Clone Array Length "+ arrClone.length);


        // Fill array with -1
        int[] arrFill = new int[5];
        Arrays.fill(arrFill, -1);
        print(arrFill);


        // SetAll - Fill with custom logic
        int[] arrGiven = new int[]{-2,5,-6,-7,8};
        int[] arrTemp = new int[arrGiven.length];
        Arrays.setAll(arrTemp, index -> {
            if(arrGiven[index] < 0){
                return -1;
            }
            return 1;
        });
        print(arrTemp);

        // Print [array]
        System.out.println(Arrays.toString(new int[]{2,3,4,5,6,6,3,2}));
        
        //Passing anonymous array
        print(new int[]{2,3,4,5,6,6,3,2});
    }

    static void print(int[] arr){
        System.out.println("----------");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void print(Integer[] arr){
        System.out.println("----------");
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
