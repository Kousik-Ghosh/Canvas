public class POJO {
    int data;
    POJO(){
        data = 0;
    }
    POJO(int x){
        data = x;
    }

    static void simpleArrayLength(int[] arr){
        System.out.println(arr.length);;
    }

    /* This method can take variable length of int and 
     * put them in array. We can also pass an array to it.
    */
    static void multipleArgArrayLength(int... arr){
        System.out.println(arr.length);;
    }
}
