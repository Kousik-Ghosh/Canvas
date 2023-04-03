public class GenericClass <T>{
    
    private T value;
    GenericClass(T x){
        value = x;
    }

    T getValue(){
        return this.value;
    }

    void setValue(T x){
        value = x;
    }
}
