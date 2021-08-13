package defaultMethod;

public interface DefaultAndStaticPrep {
    default void helloDefault(){
        System.out.println("helloDefault from Interface DefaultAndStaticPrep");
    }
    default void helloDefault2(){
        System.out.println("helloDefault from Interface DefaultAndStaticPrep");
    }
    static void helloStatic(){
        System.out.println("helloStatic from Interface DefaultAndStaticPrep");
    }
}
