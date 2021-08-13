package singleton;

import java.util.HashMap;

public class SingleTonWithPublicConstructor {
    private static SingleTonWithPublicConstructor s;

    public SingleTonWithPublicConstructor() throws Exception {
        /*if(SingleTonWithPublicConstructor.class.isInstance(this)){
            throw new Exception();
        }*/
        ;

        if (s !=null){
            throw new Exception();
        }else {
            s=this;

            new HashMap<>();
        }
    }

    /*public static SingleTonWithPublicConstructor getInstance() {
        return s;
    }*/
}
