package staticNonStatic;

public class ThisReference {
    int a;
    static  int b;

    public static void main(String[] args) {
        ThisReference thisReference=new ThisReference();

        //a=9; // incorrect CE: Non-static field can not be referenced from static context.
        //this.a=9;  // incorrect  CE: this can not be referenced from a static context.
        thisReference.a=9;  // correct
        b=9;
        thisReference.b=8;// correct but not recommended.
         /**While allowed by Java Language Specification,
          * referring to static members via instance variables makes the code confusing
          * as the reader may think that the result of the method depends on the instance. */
        ThisReference.b=7;


    }
}
