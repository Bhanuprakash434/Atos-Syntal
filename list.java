import java.util.ArrayList;
import java.util.List;
// import java.util.stream.collectors;

public class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(20);

        if(list.contains(11)) {
            System.out.println("yes present in the list"); 
        }
        else {
            System.out.println("no not present in the list");
        }
        for(int i=0;i< list.size();i++) {
            System.out.println(list.get(i));
         }
         /*for(int i : list ) {
             System.out.println(i);
         }*/
        // list.forEach(System.out::println);
        /*list.stream().filter(e -> e % 2 == 0)
        .collect(collectors.tolist())
        .forEach(System.out::println);*/

        
    }
    
}
