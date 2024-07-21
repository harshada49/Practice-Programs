import java.util.*;

public class Iterator2 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(4);
        ls.add(3);
        ls.add(6);
        ls.add(8);
        
        System.out.println(ls);
        Iterator<Integer> t = ls.iterator();
        while(t.hasNext()){
            int val = t.next();
            if(val % 2 != 0 )
               t.remove();

        }
        //iterating the values using for each loop 
        for(int val : ls)
          System.out.print(val+ " ");
        System.out.println();


        //using for each method
        System.out.println("testing forEach method");
        ls.forEach((Integer val) -> System.out.println(val));
       
    }
}
