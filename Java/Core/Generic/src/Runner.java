import java.util.*;

public class Runner {
    public static void main(String[] args) {
       
        /* Simple generic class*/
        GenericClass<String> gcs = new GenericClass<String>("Kousik");
        System.out.println(gcs.getValue());
        GenericClass<Integer> gci = new GenericClass<Integer>(30);
        System.out.println(gci.getValue());
        GenericClass<Cube> gcc = new GenericClass<Cube>(new Cube("CX"));
        System.out.println(gcc.getValue());
        

        /* Advanced generic class */
        AdvanceGenericClass<String> agc = new AdvanceGenericClass<String>("Audi");
        System.out.println(agc.getValue());
        System.out.println(agc.genericMethod("BMW"));
        System.out.println(AdvanceGenericClass.<Cube>staticGenericMethod(new Cube("C1")).getName());
        System.out.println(agc.purelyGenericMethod("Mercedes"));        
        System.out.println(AdvanceGenericClass.<Cube>staticPurelyGenericMethod(new Cube("C2")).getName());        



        /* Generic methods in non-generic classes*/
        NonGenericClass ngc = new NonGenericClass();
        System.out.println(ngc.factoryMethodTypeString().getValue());
        System.out.println(ngc.factoryMethodTypeInteger().getValue());
        System.out.println(NonGenericClass.staticFactoryMethodTypeInteger().getValue());
        System.out.println(ngc.purelyGenericMethod("Mercedes"));        
        System.out.println(NonGenericClass.<Cube>staticPurelyGenericMethod(new Cube("C2")).getName());    


        /* Bounded generic class*/
        System.out.println(new BoundGenericClass<Integer>().getOnlyNumberValue(10));
        System.out.println(BoundGenericClass.<Cube>getAnyValue(new Cube("C3")).getName());



        /* Generic Array creation*/
        //GenericClass<String>[] gc = new GenericClass<String>[10];                 // NOT-OK
        List<GenericClass<String>> gcl = new ArrayList<GenericClass<String>>();     // OK
        gcl.add(gcs);


        

        WildCard<Integer> wc = new WildCard<Integer>();
        wc.simpleGenericMethod(34);
        wc.wildCardMethod(new WildCard<Byte>());

        

        


    }
}
