public class Runner {
    
    public static void main(String[] args) {
        
        OuterClass oc = new OuterClass(3);
        oc.classInsideMethod();

        OuterClass.InnerClass ocic = oc.new InnerClass();
        ocic.print();

        OuterClass.InnerClass ocics = new OuterClass(0).new InnerClass();
        ocics.print();

        OuterClass.StaticInnerClass ocsic = new OuterClass.StaticInnerClass();
        ocsic.print();


        
        // this means anonymousObject is extending from OuterClass
        OuterClass anonymousObject = new OuterClass(3){
            @Override
            public void print(){
                System.out.println("from anoymous z = "+this.z);
            }
        };
        anonymousObject.print();

    }
    
}