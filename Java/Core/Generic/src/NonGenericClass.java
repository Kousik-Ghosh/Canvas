public class NonGenericClass {
    
    /* A factory method that returns an object of 
     * a generic class AdvanceGenericClass 
     * with type parameter as String
     * Can be in a generic class as well.
    */
    AdvanceGenericClass<String> factoryMethodTypeString(){
        return new AdvanceGenericClass<String>("XYZ");
    }    

    /* A factory method that returns an object of 
     * a generic class AdvanceGenericClass 
     * with type parameter as Integer.
     * Can be in a generic class as well.
    */
    AdvanceGenericClass<Integer> factoryMethodTypeInteger(){
        return new AdvanceGenericClass<Integer>(50);
    }   
    
    /* A static factory method that returns an object of 
     * a generic class AdvanceGenericClass 
     * with type parameter as Integer
     * Can be in a generic class as well.
     * though it is static, we do not need to mention <T> 
     * before return type because java can determine the 
     * type from AdvanceGenericClass<Integer>
     * 
    */
    static AdvanceGenericClass<Integer> staticFactoryMethodTypeInteger(){
        return new AdvanceGenericClass<Integer>(60);
    }   


    /* Purely generic method.
     * It has its own generic-value <X> that it deals with.
     * This method will work with any type or object.
     * Can be in a generic class as well.
     */
    <X> X purelyGenericMethod(X x){
        return x;
    }

    /* Purely generic static method
     * Can be in a generic class as well.
     * It has its own generic-value <TV> that it deals with.
     * This method will work with any type or object.
     */
    static <X> X staticPurelyGenericMethod(X x){
        return x;
    }
}
