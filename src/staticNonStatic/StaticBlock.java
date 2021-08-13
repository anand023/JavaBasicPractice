package staticNonStatic;

public class StaticBlock {
    int a;
    static  int b;
    static {
        /**
         * static blocks execute during class loading
         * static blocks executes before main() method.
         * and whatever logic/code will write, we will not be able to call from anywhere,
         * So, in static block we can write those code/logic which we want to be ready before execution of the main() method.
         * in order to be ready to serve without westing any time for initialization or
         * some common logic which we want to execute before main().
         * Non-static members/variables/methods can't accessed from static blocks or static methods.
         * To access non-static members/variables/methods from static blocks or static methods we need to call with object reference.
         *
         * */
        System.out.println("from static block 1"); // 1st this will print
        StaticBlock staticBlock=new StaticBlock(); //constructor call
        staticBlock.a=0;
        b=2;

    }
    {
        /**
         * From non-static blocks/methods we can access static members/variables/methods
         * */
        a=7;
        this.a=5;
        b=8;
    }

    StaticBlock(){
        System.out.println("From constructor.....");
        /*
        * 2nd because it called from 1st static block,
        * 5th this will print
        * */
    }
    public static void main(String[] args) {
        System.out.println("From main method.... before constructor call from main"); //3rd this will print
        StaticBlock thisReference1=new StaticBlock();
        System.out.println("From main method.... after constructor call from main"); //5th this will print

        //a=9; // incorrect CE: Non-static field can not be referenced from static context.
        //this.a=9;  // incorrect  CE: this can not be referenced from a static context.
        thisReference1.a=9;  // correct
        b=9;
        thisReference1.b=8;// correct but not recommended.
         /**While allowed by Java Language Specification,
          * referring to static members via instance variables makes the code confusing
          * as the reader may think that the result of the method depends on the instance.
          * */
        StaticBlock.b=7;



    }

    static {
        System.out.println("from static block 2"); //2nd this will print
    }
    //OP:
    /*
    * from static block 1
    * from static block 2
    * From main method.... before constructor call from main
    * From constructor.....
    * From main method.... after constructor call from main
    * */
}
