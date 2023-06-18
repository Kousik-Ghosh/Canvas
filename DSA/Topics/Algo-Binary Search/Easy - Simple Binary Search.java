
class Solution{

    public static int bs(int[] arr){
         int x = 6;
         int left = 0;
         int right = arr.length-1;
         while (left <= right) {
            int mid = left + ((right - left) / 2);
            if(arr[mid] == x){
               return mid;
            }else if(x < arr[mid]){
               right = mid - 1;
            }else{
               left = mid + 1;
            }

         }  
         return -1;
   }

   public static int rbs(int[] arr, int left, int right, int x){
         if(left > right){
            return -1;
         }
         int mid = left + ((right - left) / 2);
         if(arr[mid] == x){
            return mid;
         }else if(x < arr[mid]){
            return rbs(arr, left, mid -1, x);
         }else{
            return rbs(arr, mid + 1, right, x);
         }
   }
}
