public class arrayy
{
    public static void main(String args[]) {
        int[] arr = new int[4];
        int sum = 0;

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
         
        for(int i=0;i < arr.length;i++) {
            System.out.println("arr["+i+"]:"+arr[i]);
         sum = sum +arr[i];
        }
         System.out.println("array values:"+sum);
         

        
    }
}
