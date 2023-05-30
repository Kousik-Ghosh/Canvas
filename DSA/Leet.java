public class Leet {

   public static void main(String[] args) {
    
         
      long x = 1096396827279023640l;
      int y = 1231676767;

      String bid = "1096396827279023640";
      

      long res = 0;
 
        // One by one process all digits of 'num'
        for (int i = 0; i < bid.length(); i++){
            res = (res * 10 + bid.charAt(i) - '0') % 4;
        }

        System.out.println(res);
        System.out.println(x % 256);
        System.out.println(y % 256);

   }

}