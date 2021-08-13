package recursion;

public class Demo {
    public static void main(String[] args) {
        int n=0;
        while (n<5){
            n++;
            int i = rec("hello") + rec("world");

        }
    }
    private static int rec(String str){
        if (str.equals("hello")){
            System.out.printf("hello -> ");
            return 1;
        }else if (str.equals("world")){
            System.out.printf("world -> ");
            return 2;
        }else {
            System.out.printf("Nothing -> ");
        }
        return 0;
    }
}
