package defaultMethod.impl;

import defaultMethod.DefaultAndStaticPrep;
import defaultMethod.DefaultAndStaticPrep2;

public class DefaultAndStaticImpl implements DefaultAndStaticPrep, DefaultAndStaticPrep2 {
    @Override
    public void helloDefault() {
        DefaultAndStaticPrep2.super.helloDefault();
    }
}
