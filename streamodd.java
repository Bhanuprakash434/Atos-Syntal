import java.util.*;
public class streamodd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(24);
        list.add(45);
        list.add(-8);
        list.add(-15);


        list.stream()
        .filter(e-> (e % 2 != 0))
        .forEach(System.out::println);
    }
    
}
