import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nagpur");
        cities.add("Banglore");
        cities.add("Chennai");

        Iterator<String> iterator = cities.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        
    }
}
