package comparableComparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    // ascending order
    @Override
    public int compare(Student s1, Student s2) {
        /*if (s1.getAge() < s2.getAge()){
            return -1;
        }
        if (s1.getAge() > s2.getAge()){
            return 1;
        }else {
            return 0;
        }*/ //OR below both are same
        return s1.getAge() - s2.getAge();
    }
}