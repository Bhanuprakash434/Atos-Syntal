import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int size;
        size =s.nextInt();
        int[] arr = new int[size];
        for(int i=0;i < arr.length();i++)
        {
            arr[i] = s.nextInt();
        }
           for(int j=arr.length()-1;j>=0;j--)
        {
          System.out.println("a["+j+"]="+arr[j]);
        }
    }
}
