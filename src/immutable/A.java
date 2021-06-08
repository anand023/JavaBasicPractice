package immutable;

import java.security.PublicKey;

class A {
    A a;
     A(){
        if (a!=null){
            throw new IllegalArgumentException();
        }
    }
}

class B extends A {
    B b;
     B(){
        if (b!=null){
            throw new IllegalArgumentException();
        }
    }
}

