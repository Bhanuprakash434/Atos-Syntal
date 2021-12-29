import java.util.Arraydeque;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
        Queue <String> q = new ArrayDeque<>();
        q.offer("bhanu");
        q.offer("prakash");
        q.offer("karanam");

        q.forEach(System.out::println);
    
        
    }
    
}
