package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPrep {

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.add("A");
        System.out.println(list);

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        Integer i=1;
        linkedList.remove((Integer) 1);
        list.remove("A");


    }
}
