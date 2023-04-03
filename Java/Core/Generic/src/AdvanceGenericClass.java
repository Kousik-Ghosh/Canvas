

public class AdvanceGenericClass <T>{
    
    private T value;
    AdvanceGenericClass(T x){
        value = x;
    }
    
    /* Simple method that return T-type value */
    T getValue(){
        return value;
    }

    /* A generic method that accepts and returns object 
     * of Type-T, where this T is defined in object creation of
     * AdvanceGenericClass to call this method.
    */
    T genericMethod(T x){
        return x;
    }

    /* 1. Purely generic method 
     * A static generic method which returns void or T
     * must define <T> - the type of the genric method.
     * Cause non-static method can get the Type from the object
     * like AdvanceGenericClass<String> agc = new AdvanceGenericClass<String>();
     * here object 'agc' only deals with <String>
     * but for static we call this method by class_name.methodname
     * i.e. AdvanceGenericClass.<Type>genericMethodType1(s);
     * This Type is not bounded by class <T>
    */
    static <T> T staticGenericMethod(T x){
        return x;
    }

    /* 2. Purely generic method - same as 1
     * Can be in a non-generic class as well.
     * It has its own generic-value <TV> that it deals with.
     * This method will work with any type or object.
     */
    <X> X purelyGenericMethod(X x){
        return x;
    }

    /* 3. Purely generic static method
     * Can be in a non-generic class as well.
     * It has its own generic-value <TV> that it deals with.
     * This method will work with any type or object.
     */
    static <X> X staticPurelyGenericMethod(X x){
        return x;
    }
}
