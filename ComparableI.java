import java.util.*;
import java.util.ArrayList;

class Student implements Comparable<Student>{
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student s){
        if(this.age > s.age)
           return 1;
        else
           return -1;
    }
}
public class ComparableI {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22,"harsh"));
        list.add(new Student(16,"Yash" ));
        list.add(new Student(18, "Arya"));
     
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.age + " " + s.name);
        }     
    }
}
