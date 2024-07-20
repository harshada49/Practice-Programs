import java.util.*;

public class ComparatorI {
    public static void main(String[] args) {

        // Comparator<Integer> com = new Comparator<Integer>()
        // {

        //     public int compare(Integer i, Integer j){
        //         if(i%10 > j%10)
        //           return 1;
        //         else 
        //           return -1;
        //     }
        // };
        Comparator<Integer> com = (i, j) -> i > j ? 1: -1;

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(52);
        ls.add(87);
        ls.add(29);
        ls.add(34);
        ls.add(65);

        Collections.sort(ls,com);
        System.out.println(ls);
    }
}
