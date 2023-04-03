

public class Runner {
   public static void main(String[] args) throws Exception {
        
      /* Child can not throw more generic exception*/
      // Child c = new Child();
      // c.method();


      /* Simple exception throwing */
      // throw new OwnException();
      // throw new OwnException("Just like that!");
      


      /* Try-Catch block */
      // try {
      //    throw new OwnException("Just like that!");
      // } catch (Exception e) {
      //    e.printStackTrace();
      // }
      // System.out.println("Business asusual!");



      /* Multiple Catch */
      // int x = 0;
      // try {
      //    if(x == 1){
      //       throw new OwnException("Just like that!");
      //    }else{
      //       throw new IOException("Just like that as well!");
      //    }
      // } catch (OwnException | IOException e) {
      //    e.printStackTrace();
      // }
      // System.out.println("Business asusual!");



      /* Re-Thowing from Catch */
      // try {
      //    throw new OwnException("Just like that!");
      // } catch (Exception e) {
      //    Exception excp = new Exception();
      //    excp.initCause(e);
      //    throw excp;
      // }


      /* Finally workings */
      // int x = 1;
      // try {
      //    if(x == 0){
      //       throw new OwnException("Just like that!");
      //    }
      //    System.out.println("After Throw");
      // } catch (OwnException e) {
      //    System.out.println("::In Catch::");
      //    e.printStackTrace();
      //    throw new Exception();
      // }finally{
      //    System.out.println("::In Finally::");
      // }
      // System.out.println("Business asusual!");



      /* Nested Try-Catch & Try-Finally */
      // try {
      //    try {
      //       //throw new OwnException("Just like that!");
      //       throw new UnsupportedOperationException();

      //    } finally {
      //       System.out.println("::In Finally::");
      //    }
      // } catch (Exception e) {
      //    e.printStackTrace();
      // }

      

      
      Child c = new Child();
      c.someMethod();
         
     

   }

}