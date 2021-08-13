package singleton;

public class Main {
    public static void main(String[] args) {
        try {
            /*SingleTonWithPublicConstructor st=new SingleTonWithPublicConstructor();
            System.out.println("1  "+st);
            SingleTonWithPublicConstructor st2=new SingleTonWithPublicConstructor();
            System.out.println("2  "+st2);*/

        }catch (Exception ex){
            ex.printStackTrace();
        }

        long n=2%10;
      //  System.out.println(n);
        double d=11;
        double c=3;
        double x= d%c;
        System.out.println(x);
    }
}
