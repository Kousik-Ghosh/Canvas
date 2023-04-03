import java.io.Serializable;

class BoundGenericClass <T extends Number & Serializable>{

    /* This generic method return and accept 
     * type is only Number and its subclasses.
     * Defined at object creation.
     */
    T getOnlyNumberValue(T x){
        return x;
    }

    /* This generic method can accept and return any
     * type & not bounded to only Number or its sub-classes
     * though it is in bounded class.
     * since the type determination happens for static
     * at  Class_name.<Type>method(Type arg);
    */
    static <T> T getAnyValue(T x){
        return x;
    }

}