public class ExceptionGeneric <T extends Exception>{

    void getException() throws T{
        try {
            throw new Exception();
        } catch (Exception e) {
        }
    }


    void getException1(T x) throws T{
        try {
            throw new Exception();
        } catch (Exception e) {
            x.initCause(e);
            x.printStackTrace();
            throw x;
        }
    }

    static <TQ extends Exception> void getException2(TQ tq) throws TQ{
        try {
            throw tq;
        } catch (Exception e) {
            tq.initCause(e);
            tq.printStackTrace();
            throw tq;
        }
    }

}
