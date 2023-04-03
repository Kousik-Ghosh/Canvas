public class WildCard <T extends Number>{
    

    void simpleGenericMethod(T wct){
        
    }

    /* This method can take any sub-class type of Number.
     * Calling object type does not matter.
     * i.e. Even if  WildCard<Integer> wci = new  WildCard<Integer>();
     * the wci object is Integer Type, for this perticular method it
     * can pass any other sub type of Integer - like Short, Long.
    */
    void wildCardMethod(WildCard<?> wc){

    }

    /* This method can take only type for which the object
     * is initializws with.
     * i.e. WildCard<Integer> wci = new  WildCard<Integer>();
     * we can only pass - new WildCard<Integer>()
     * NOT - new WildCard<Long>()
    */
    void GenericMethod(WildCard<T> wc){

    }

}
