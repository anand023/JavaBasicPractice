package hashcodeContract;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(1, "john","bangalore");
        Student s2=new Student(1, "john","bangalore");
        Student s3=new Student(3, "john","bangalore");

        System.out.println("s1 hashcode : "+s1.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);
        String st1=new String("hello");
        String st2=new String("hello");
        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));

    }
}
