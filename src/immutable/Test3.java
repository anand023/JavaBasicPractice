package immutable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
class Emp implements  Comparable{
    int id;
    String name;
    long salary;

    @Override
    public int compareTo(Object o) {
        Emp emp=(Emp) o;
        int re;
        re = Integer.compare(this.id, emp.id);
        if(re == 0){
            re=this.name.compareTo(emp.name);
            if (re==0){
                re=Long.compare(this.salary, emp.salary);
            }

        }
        return  re;
    }
}
class Test3 {
    Test3 t;
    Test3(){
        if(t==null){
            new Test3();
        }
        //return new Exception();
    }
    public static void main(String[] args) {
        List<Emp> l=new ArrayList<>();

       // l.add(emp);
        Collections.sort(l);
        Test3 t=new Test3();
        Test3 t2=new Test3();
    }
}