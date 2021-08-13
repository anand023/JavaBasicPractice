package immutable;

import java.security.PublicKey;

class A {
    static A a;
     A(){
        if (a!=null){
            throw new IllegalArgumentException();
        }
    }
}

class B extends A {
    static B b;
     B(){
        if (b!=null){
            throw new IllegalArgumentException();
        }
    }
}

