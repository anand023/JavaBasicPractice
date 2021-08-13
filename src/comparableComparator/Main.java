package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Student john =new Student(3,"John", 18);
        Student jane =new Student(1,"Jane", 21);
        Student tom =new Student(2,"Tom", 20);

        list.add(john);
        list.add(jane);
        list.add(tom);

        System.out.println("Here it will give natural sorted order :");
        Collections.sort(list);
        list.stream().forEach(student -> System.out.println(student));


        System.out.println("Here providing ageComparator to sort based on comparator : ");
        Collections.sort(list, new AgeComparator());
        list.stream().forEach(student -> System.out.println(student));

    }
}
