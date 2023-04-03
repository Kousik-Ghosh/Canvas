interface Parent {
    void method() throws Exception;
    default public void someMethod(){
        throw new UnsupportedOperationException();
    }
}
