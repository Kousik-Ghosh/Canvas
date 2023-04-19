public class OuterClass {
    
    public int z;
    private int x;
    private static int y = 10;
    OuterClass(int x){
        this.x = x;
        this.z = x;
    }

    public void print(){
        System.out.println(this.z);
    }

    public void classInsideMethod(){
        int p = 1000;
        class LocalInnterClass{
            void print(){
                System.out.println(x);
                System.out.println(p);
            }
        } 
        LocalInnterClass lin = new LocalInnterClass();
        lin.print();
    }

     class InnerClass{
        void print(){
            System.out.println(x);
        }
    }

    public static class StaticInnerClass{
        void print(){
            System.out.println(y);
        }
    }





}
