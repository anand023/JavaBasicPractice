package defaultMethod;

public interface DefaultAndStaticPrep2 {
    default void helloDefault(){
        System.out.println("helloDefault from Interface DefaultAndStaticPrep");
    }
    static void helloStatic(){
        System.out.println("helloStatic from Interface DefaultAndStaticPrep");
    }
}
