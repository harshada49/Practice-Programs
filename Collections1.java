//all methods in collections used here
import java.util.*;
public class Collections1 {
    public static void main(String args[]){
        List<Integer> ls = new ArrayList<>();
        //add 
        ls.add(2);
        ls.add(6);
        ls.add(5);
        ls.add(8);
        ls.add(3);

        //size 
        System.out.println("size: " + ls.size());
        //isEmpty
        System.out.println("is empty: " + ls.isEmpty());
        //contains
        System.out.println("contains :" + ls.contains(6));
        //removing using index
        ls.remove(3);
        System.out.println("removed using index: " + ls.contains(8));
        //remove using object
        ls.remove(Integer.valueOf(2));
        System.out.println("removed using objects: " + ls.contains(2));

        Stack<Integer> st = new Stack<>();
        st.add(4);
        st.add(9);
        st.add(1);
        //add all from first collection
        ls.addAll(st);
        System.out.println("Values contains stack values: " + ls.containsAll(st));

        ls.removeAll(st);
        System.out.println("removed all values from fisrt collection:" + ls.containsAll(st));

        ls.clear();
        System.out.println("clear: "+ ls.isEmpty());


    }
}
