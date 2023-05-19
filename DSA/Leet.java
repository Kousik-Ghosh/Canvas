public class Leet {

   public static void main(String[] args) {
    
         
      
        
      System.out.println(Integer.toBinaryString(5));
      System.out.println(Integer.toBinaryString(25));
      System.out.println(Integer.toBinaryString(125));
      System.out.println(Integer.toBinaryString(625));

      System.out.println(cuts("1111101"));

   }

   static int cuts(String s)
    {
      int ans = 0;
        int x = 0;
        for (int i = 1; i < s.length(); i++) {
            x = Integer.parseInt(s.substring(0, i), 2);
            if(x != 0){
               int n = (int)(Math.log(x) / Math.log(5));
               if(Math.pow(5, n) == x){
                  ans =  s.length() / i;
               }
            }
        }
        return ans == 0 ? -1 : ans;
    }
}