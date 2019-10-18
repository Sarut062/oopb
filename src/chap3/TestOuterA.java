package chap3;
class OuterA{
    int outerAttribute1=5;
    static int outerAttribute2=10;
    
    void outerMethod(){
        System.out.println("OuterA : outerMethod1()");
    }
    static void outMethod2(){
        System.out.println("OuterA : outerMethod2()");
    }
    static class StaticLnner{
        int staticLnnerAttribute1=15;
        static int staticLnnerAttribute2=20;
        
        void staticLnnerMethod1(){
            System.out.println(staticLnnerAttribute1+","+staticLnnerAttribute2);
        }
        static void staticInnerMethod2(){
            outMethod2();
        }
    }
}//end class OuterA
public class TestOuterA {
    public static void main(String[]args){
        OuterA.StaticLnner innerObj=new OuterA.StaticLnner();
        innerObj.staticLnnerMethod1();
        OuterA.StaticLnner.staticInnerMethod2();       
    }
}//end class TestOuterA
